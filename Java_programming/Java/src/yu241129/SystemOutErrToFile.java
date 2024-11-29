package yu241129;

import java.io.PrintStream;

public class SystemOutErrToFile {
    public static void main(String[] args) throws Exception {
        // 표준 출력과 에러를 파일로 리디렉션
        PrintStream outStream = new PrintStream("/Users/pyodolski/Desktop/Github/java/Java_programming/Java/src/yu241129/output.log");
        PrintStream errStream = new PrintStream("/Users/pyodolski/Desktop/Github/java/Java_programming/Java/src/yu241129/error.log");

        // 기존 출력 스트림 재지정
        System.setOut(outStream);
        System.setErr(errStream);

        // 정상 출력
        System.out.println("This is a normal message.");
        // 에러 출력
        System.err.println("This is an error message.");

        // 스트림 닫기
        outStream.close();
        errStream.close();
    }
}
