package yu241129;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String[] args) {
        String fileName = "./students_binary.bin";

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("바이너리 파일 내용:");
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int age = dis.readInt();
                String grade = dis.readUTF();

                System.out.printf("Name: %s, Age: %d, Grade: %s\n", name, age, grade);
            }
        } catch (IOException e) {
            System.out.println("바이너리 파일 읽기 중 오류 발생: " + e.getMessage());
        }
    }
}