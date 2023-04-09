package com.jjbae.app.lesson.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadExcel {
	private static Logger LOGGER = LoggerFactory.getLogger(ReadExcel.class);
	
	private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	public List<ScoreVo> parseScoreFile(String filePath) {
        try {
            // 엑셀 파일 경로 지정
            File file = new File(filePath);

            // 파일 스트림 생성
            FileInputStream inputStream = new FileInputStream(file);

            // 워크북 생성
            //Workbook workbook = WorkbookFactory.create(inputStream);
            Workbook workbook = new XSSFWorkbook(inputStream);

            // 워크시트 선택
            Sheet sheet = workbook.getSheetAt(0);

            // 행 반복
            for (Row row : sheet) {
            	// 첫번째 줄은 헤더라서 처리할 필요 없음
            	if (row.getRowNum() == 0)
            		continue;
            	
            	// 한줄씩 읽는다.
            	ScoreVo scoreVo = new ScoreVo();            	
            	  	
                // 셀 반복
                for (Cell cell : row) {
//                	LOGGER.debug("[" + cell.getColumnIndex() + "]");
                	int cellIndex = cell.getColumnIndex();
                	Object cellValue = getCellValue(cell);
                	
                	if (cellIndex == 1) { // 원정팀
                		scoreVo.setAwayTeam(Team.getTeam((String)cellValue));
                	}
                	else if (cellIndex == 2) { // 원정팀 점수
                		scoreVo.setAwayTeamScore((int)cellValue);
                	}
                	else if (cellIndex == 3) { // 홈 팀 
                		scoreVo.setHomeTeam(Team.getTeam((String)cellValue));
                	}
                	else if (cellIndex == 4) { // 홈 팀 점수
                		scoreVo.setHomeTeamScore((int)cellValue);
                	}
                }
                
                // LOGGER로 ScoreVo를 출력
                LOGGER.debug(scoreVo.toString());
            }

            // 파일 스트림 닫기
            inputStream.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
	}
	
	public Object getCellValue(Cell cell) {
        // 셀 타입에 따라 값 출력
        switch (cell.getCellType()) {

            case NUMERIC:
            	if( DateUtil.isCellDateFormatted(cell)) {
//            		LOGGER.debug(DATE_FORMAT.format(cell.getDateCellValue()));
            		return DATE_FORMAT.format(cell.getDateCellValue());
            	}
            	else {
//            		LOGGER.debug(Double.toString(cell.getNumericCellValue())); 
            		return (int)cell.getNumericCellValue();
            	}

            case STRING:
//            	LOGGER.debug(cell.getStringCellValue());
            	return cell.getStringCellValue();

            case BOOLEAN:
//            	LOGGER.debug(Boolean.toString(cell.getBooleanCellValue()));
                return cell.getBooleanCellValue();
                
            default:
//            	LOGGER.debug("Unknown Cell Type");
        }
        
        return "";
	}
}
