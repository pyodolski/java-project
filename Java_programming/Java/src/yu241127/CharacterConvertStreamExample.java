package yu241127;// FileInputStream, FileOutputStream, InputStreamReader, OutputStreamWriter 등 관련 클래스 import
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
// 문자열을 파일에 출력하는 메소드
    public static void write(String str) throws Exception {
        // FileOutputStream과 OutputStreamWriter 보조 스트림 연결
        FileOutputStream fos = new FileOutputStream("/Users/pyodolski/Desktop/Github/java/Java_programming/Java/src/yu241127/CharacterConvertStreamExample.txt");
        Writer writer = new OutputStreamWriter(fos);
        // OutputStreamWriter를 이용해서 문자열 출력
        writer.write(str);
        // 출력 버퍼 비우기
        writer.flush();
        // 출력 스트림 닫기
        writer.close();
    }

    // 파일에서 문자열을 읽어오는 메소드
    public static String read() throws Exception {
        // FileInputStream과 InputStreamReader 보조 스트림 연결
        FileInputStream fis = new FileInputStream("/Users/pyodolski/Desktop/Github/java/Java_programming/Java/src/yu241127/CharacterConvertStreamExample.txt");
        Reader reader = new InputStreamReader(fis);
        // 문자 데이터를 읽기 위한 배열 생성
        char[] buffer = new char[100];
        // InputStreamReader를 이용해서 문자 입력
        int readCharNum = reader.read(buffer);
        // 입력 스트림 닫기
        reader.close();
        // char 배열에서 읽은 수만큼 문자열로 변환
        String data = new String(buffer, 0, readCharNum);
        return data;
    }

    public static void main(String[] args) throws Exception {
        // write 메소드를 호출하여 문자열 출력
        write("안녕하세요.");
        // read 메소드를 호출하여 문자열 입력
        String data = read();
        // 읽은 데이터를 출력
        System.out.println(data);
    }
}
