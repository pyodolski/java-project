package yu241127;

import java.io.*; // 파일 입출력 관련 클래스

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        // language.txt 파일 생성 및 내용 작성
        createLanguageFile();

        // Reader 객체 생성: ./language.txt 파일 읽기
        Reader reader = new FileReader("./language.txt");
        BufferedReader br = new BufferedReader(reader); // BufferedReader 보조 스트림 연결

        // 파일 내용 읽기
        while (true) {
            // 라인 단위로 문자열 읽기
            String data = br.readLine();
            // 파일 끝에 도달했을 경우 반복문 종료
            if (data == null) break;
            // 읽은 데이터 출력
            System.out.println(data);
        }

        // 입력 스트림 닫기
        br.close();
    }

    // language.txt 파일 생성 및 내용 작성 메소드
    private static void createLanguageFile() {
        try (Writer writer = new FileWriter("./language.txt")) {
            writer.write("C 언어\n");
            writer.write("Java 언어\n");
            writer.write("Python 언어\n");
            writer.flush(); // 버퍼 비우기
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류 발생: " + e.getMessage());
        }
    }
}