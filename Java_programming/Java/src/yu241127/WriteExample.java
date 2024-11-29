package yu241127;// FileOutputStream 및 OutputStream 클래스 import
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws Exception {
        // 데이터 도착지를 test1.db로 하는 파일 출력 스트림 생성
        //OutputStream os = new FileOutputStream("C:/Temp/test1.db");
        OutputStream os = new FileOutputStream("/Users/pyodolski/Desktop/Github/java/Java_programming/Java/src/day_9/test1.txt");

        // 각각의 byte 데이터 정의
        byte a = 10; 
        byte b = 20; 
        byte c = 30;

        // 1byte씩 출력
        os.write(a); 
        os.write(b);
        os.write(c);

        // 출력 버퍼에 남아 있는 모든 바이트를 출력
        os.flush();

        // 출력 스트림을 닫음
        os.close();
    }
}