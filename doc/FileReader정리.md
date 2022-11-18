Java fileReader/writer
======
자바에선 여러가지 방법으로 파일을 읽거나 쓸수 있다.
-----
이번엔 그 방법들중 가장 기본적인것들을 끄적여볼것이다.
-----
# fileReader
FileReader는 character 파일을 읽을수있는 기능을 제공한다.
Java 11이후엔 인코딩도 제공할수 있다. 
이전 버전엔 인코딩을 적용하기 위해 다른 방법을 사용해야 한다.
이 클래스는 Java.io.inputStreamReader 클래스를 상속받기에, char를 한 글자씩 읽어올수 있음.
# BufferedReader
buffer를 제공하기 때문에, 작업이 좀 더 쉬워진다.
Reader객체를 전달하고, inputStreamReader 등의 다른 reader객체를 전달할 수도 있다.
또한 buffer 사이즈를 지정할수 있다.

# fileWriter
문자 기반 스트림/텍스트 파일을 프로그램으로 읽어드릴때 사용.
문자 단위로 저장하므로 텍스트만 가능.
생성 방법 = ex)FileWriter fw = new File("파일경로");
또한 지정된 파일이 있는데 하나 더 생성할시 덮어씌운다.
