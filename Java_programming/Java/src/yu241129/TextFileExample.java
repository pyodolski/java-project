package yu241129;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileExample {
    public static void main(String[] args) {
        String fileName = "./students_text.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            // 데이터 저장
            writer.write("Name: Alice\n");
            writer.write("Age: 25\n");
            writer.write("Grade: A\n");

            writer.write("Name: Bob\n");
            writer.write("Age: 22\n");
            writer.write("Grade: B\n");

            System.out.println("데이터가 텍스트 파일에 저장되었습니다: " + fileName);
        } catch (IOException e) {
            System.out.println("텍스트 파일 저장 중 오류 발생: " + e.getMessage());
        }
    }
}