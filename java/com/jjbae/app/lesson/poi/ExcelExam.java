package com.jjbae.app.lesson.poi;

public class ExcelExam {
	public static void main(String[] args) {
		ReadExcel readExcel = new ReadExcel();
		readExcel.parseScoreFile("data/score.xlsx");
	}
}
