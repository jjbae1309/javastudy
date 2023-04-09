package com.jjbae.app.lesson.poi;

public enum Team {
	롯데
	, KIA
	, NC
	, LG
	, 한화
	, 두산
	, SSG
	, 삼성
	, KT
	, 키움;
	
	public static Team getTeam(String teamName) {
		switch (teamName) {
		case "롯데":
			return 롯데;
		case "KIA":
			return KIA;
		case "NC":
			return NC;
		case "LG":
			return LG;
		case "한화":
			return 한화;
		case "두산":
			return 두산;
		case "SSG":
			return SSG;
		case "삼성":
			return 삼성;
		case "KT":
			return KT;
		case "키움":
			return 키움;
		}
		
		return null;
	}
}
