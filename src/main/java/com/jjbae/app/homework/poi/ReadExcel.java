package com.jjbae.app.homework.poi;

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

import com.jjbae.app.lesson.poi.ScoreVo;
import com.jjbae.app.lesson.poi.Team;

public class ReadExcel {
	private static Logger LOGGER = LoggerFactory.getLogger(ReadExcel.class);
	
	private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	public List<ScoreVo> parseScoreFile(String filePath) {
        try {
            File file = new File(filePath);

            FileInputStream inputStream = new FileInputStream(file);

            Workbook workbook = new XSSFWorkbook(inputStream);

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
            	if (row.getRowNum() == 0)
            		continue;
            	
            	ScoreVo scoreVo = new ScoreVo();            	
            	  	
                for (Cell cell : row) {
                	int cellIndex = cell.getColumnIndex();
                	Object cellValue = getCellValue(cell);
                	
                	if (cellIndex == 1) {
                		scoreVo.setAwayTeam(Team.getTeam((String)cellValue));
                	}
                	else if (cellIndex == 2) {
                		scoreVo.setAwayTeamScore((int)cellValue);
                	}
                	else if (cellIndex == 3) { 
                		scoreVo.setHomeTeam(Team.getTeam((String)cellValue));
                	}
                	else if (cellIndex == 4) { 
                		scoreVo.setHomeTeamScore((int)cellValue);
                	}
                }
                
                LOGGER.debug(scoreVo.toString());
            }

            inputStream.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
	}
	
	public Object getCellValue(Cell cell) {
        switch (cell.getCellType()) {

            case NUMERIC:
            	if( DateUtil.isCellDateFormatted(cell)) {
            		return DATE_FORMAT.format(cell.getDateCellValue());
            	}
            	else {
            		return (int)cell.getNumericCellValue();
            	}

            case STRING:
            	return cell.getStringCellValue();
            	
            case BOOLEAN:
            	return cell.getBooleanCellValue();
            	
            default:
        }
        
        return "";
	}
}
