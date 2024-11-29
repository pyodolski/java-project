package yu241129;

import java.io.*;
import java.util.Scanner;

public class InputStreamExample {
    public static void main(String[] args) {
        String binaryFile = "./students.bin"; // 입력 바이너리 파일 경로
        String outputFile = "./students_output.csv"; // 출력 텍스트 파일 경로

        try (DataInputStream dis = new DataInputStream(new FileInputStream(binaryFile));
             FileWriter fw = new FileWriter(outputFile)) {

            Scanner scanner = new Scanner(System.in);
            fw.write("name, ssn, hobby, gender, grade\n"); // 헤더 작성

            for (int i = 0; i < 10; i++) { // 10개의 데이터를 읽음
                // 바이너리 파일에서 데이터를 읽어옴
                String name = dis.readUTF();
                String studentId = dis.readUTF();
                String hobby = dis.readUTF();
                char gender = dis.readChar();

                // 읽은 데이터를 사람이 읽을 수 있게 표시
                System.out.printf("이름: %s, 학번: %s, 취미: %s, 성별: %c\n", name, studentId, hobby, gender);

                // 성적 입력 받기
                System.out.print("성적을 입력하세요 (A-F): ");
                String grade = scanner.nextLine().toUpperCase();

                // 데이터를 파일에 저장 (한 줄 추가)
                String formattedData = String.format("%s, %s, %s, %c, %s\n", name, studentId, hobby, gender, grade);
                fw.write(formattedData);
            }

            System.out.println("\n모든 데이터가 저장되었습니다.");

        } catch (IOException e) {
            System.out.println("파일을 읽거나 쓰는 중 오류가 발생했습니다: " + e.getMessage());
        }

        // 저장된 데이터 모두 출력
        try (BufferedReader br = new BufferedReader(new FileReader(outputFile))) {
            String line;
            System.out.println("\n저장된 데이터 출력:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}