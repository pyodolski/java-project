package yu241129;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileExample {
    public static void main(String[] args) {
        String fileName = "./students_binary.bin";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // 데이터 저장
            dos.writeUTF("Alice");
            dos.writeInt(25);
            dos.writeUTF("A");

            dos.writeUTF("Bob");
            dos.writeInt(22);
            dos.writeUTF("B");

            System.out.println("데이터가 바이너리 파일에 저장되었습니다: " + fileName);
        } catch (IOException e) {
            System.out.println("바이너리 파일 저장 중 오류 발생: " + e.getMessage());
        }
    }
}