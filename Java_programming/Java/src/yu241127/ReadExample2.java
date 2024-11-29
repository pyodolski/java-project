package yu241127;// FileReader 및 Reader 클래스 import
import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
    public static void main(String[] args) throws Exception {
        // 데이터 출발지를 test7.txt로 하는 문자 기반 파일 입력 스트림 생성
        Reader reader = new FileReader("./test.txt");

        while (true) {
            // 한 문자씩 읽기
            int data = reader.read();
            // 파일 끝에 도달했을 경우 반복문 종료
            if (data == -1) break;
            // 읽은 데이터를 출력
            System.out.println((char) data);
        }

        // 입력 스트림을 닫음
        reader.close();
    }
}