package yu241127;// FileInputStream 및 InputStream 클래스 import
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        // 데이터 출발지를 test1.db로 하는 파일 입력 스트림 생성
        InputStream is = new FileInputStream("./test1.db");

        while (true) {
            // 1byte씩 읽기
            int data = is.read();
            // 파일 끝에 도달했을 경우 반복문 종료
            if (data == -1) break;
            // 읽은 데이터를 출력
            System.out.println(data);
        }

        // 입력 스트림을 닫음
        is.close();
    }
}