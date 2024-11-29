package yu241127;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {
    public static void main(String[] args) throws Exception {
        // 데이터 도착지를 test.txt로 하는 문자 기반 파일 출력 스트림 생성
        Writer writer = new FileWriter("/Users/pyodolski/Desktop/Github/java/Java_programming/Java/src/day_9/test.txt");

        // 각각의 문자 데이터 정의
        char a = 'A';
        char b = 'B';
        char c = 'C';

        // 한 문자씩 출력
        writer.write(a);
        writer.write(b);
        writer.write(c);

        // 출력 버퍼에 남아 있는 모든 문자를 출력
        writer.flush();

        // 출력 스트림을 닫음
        writer.close();
    }
}