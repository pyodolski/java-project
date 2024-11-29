package yu241129;

import java.io.*; // 파일 입출력 및 Reader 관련 클래스 사용

public class GetLineStringFromKeyboard {
    public static void main(String[] args) throws Exception {
        // InputStream을 Reader로 변환하고 다시 BufferedReader로 연결
        InputStream is = System.in; // 표준 입력 스트림(System.in)
        Reader reader = new InputStreamReader(is); // 문자 입력 스트림으로 변환
        BufferedReader br = new BufferedReader(reader); // 버퍼를 사용한 문자 입력 스트림

        while (true) {
            // 사용자에게 입력 요청
            System.out.print("Input: ");
            // 라인 단위로 문자열 읽음
            String lineStr = br.readLine();
            // 'q' 또는 'quit'를 입력했을 경우 반복문 종료
            if (lineStr.equals("q") || lineStr.equals("quit"))
                break;

            // 입력된 내용을 출력
            System.out.println("You just input: " + lineStr);
            System.out.println();
        }

        // 입력 스트림 닫기
        br.close();
    }
}