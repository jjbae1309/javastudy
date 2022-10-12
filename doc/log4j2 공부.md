log4j2
======

log4j2 개요
----------
우린 서버를 설립하여 클라이언트와 상시 정보를 주고받곤 한다. 다양한 이유로 여러 사건이나 정보를 기록하는데, 이것을 로그라고 한다.
로그를 남기는 행위를 '로깅'이라고 하는데, log4j는 이클립스 자바에서 지원되는 로깅 프로그램중 하나다.

log4j2 설정 파일
--------------

# Appender
appender는 로그를 출력하는 위치는 저장하는것을 의미한다. 또한 
appender엔 여러가지 종류가 있다.
consoleappender = 	이클립스 console창에 나오는 정보
rollingfileappender = 파일에 로그를 기록후 저장함
dailyrollingfileappender = 	기간을 정해주는 appender라고 생각하면 편하다.


# Layout
appender로 로그 생성 전에 메시지 형식을 만드는 클래스.

# 출력 등급
log4j의 출력 레벨은 총 6개가 있다.
debug = 애플리케이션의 내부 실행 상황 추적할 수 있는 상세정보.
info = 애플리케이션의 주요 실행 정보.
warn = 잠재적 위험 상태. 경고
error = 오류 발생. 그치만 애플리케이션 실행은 가능한 상황이다.
fatal = 애플리케이션을 중지해야만 하는 심각한 오류.
trace = debug보다 더 상세한 정보를 찍는데 사용된다.

각 등급의 순서는 
debug<info<warn<error<fatal 로 구성됨.
