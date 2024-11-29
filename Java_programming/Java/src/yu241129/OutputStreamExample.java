package yu241129;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String binaryFile = "./students.bin"; // 생성될 바이너리 파일의 경로

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(binaryFile))) {
            // 예시 데이터 10개씩 작성
            String[] names = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Ivy", "Jack"};
            String[] studentIds = {"2023001", "2023002", "2023003", "2023004", "2023005", "2023006", "2023007", "2023008", "2023009", "2023010"};
            String[] hobbies = {"Reading", "Swimming", "Coding", "Cycling", "Painting", "Hiking", "Gaming", "Writing", "Dancing", "Singing"};
            char[] genders = {'F', 'M', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M'};

            for (int i = 0; i < 10; i++) {
                // UTF 형식 문자열과 Char 형식의 성별을 바이너리 파일로 작성
                dos.writeUTF(names[i]);       // 이름
                dos.writeUTF(studentIds[i]); // 학번
                dos.writeUTF(hobbies[i]);    // 취미
                dos.writeChar(genders[i]);   // 성별
            }

            System.out.println("바이너리 파일에 학생 데이터가 저장되었습니다.");

        } catch (IOException e) {
            System.out.println("파일을 쓰는 동안 오류가 발생했습니다: " + e.getMessage());
        }
    }
}