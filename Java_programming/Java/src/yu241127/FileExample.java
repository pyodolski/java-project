package yu241127;

import java.io.*; // 파일 입출력 관련 클래스
import java.text.SimpleDateFormat; // 날짜 형식 지정 클래스
import java.util.*; // 유틸리티 클래스

public class FileExample {
    public static void main(String[] args) throws Exception {
        // File 객체 생성: 디렉토리와 파일들
        File dir = new File("C:/Temp/images");
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");

        // 디렉토리가 없으면 생성
        if (dir.exists() == false) { 
            dir.mkdirs(); 
        }

        // 파일이 없으면 생성
        if (file1.exists() == false) { 
            file1.createNewFile(); 
        }
        if (file2.exists() == false) { 
            file2.createNewFile(); 
        }
        if (file3.exists() == false) { 
            file3.createNewFile(); 
        }

        // 현재 폴더의 내용 목록을 배열로 얻음
	// 다른 경로 설정은 "C:/Temp"처럼 설정
        File temp = new File("./");
        File[] contents = temp.listFiles();

        // 출력 헤더
        System.out.println("시간\t\t형태\t\t크기\t이름");
        System.out.println("---------------------------------------");

        // 날짜 형식 지정
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        // 파일 또는 폴더 정보 출력
        for (File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified()))); // 수정된 시간 출력
            if (file.isDirectory()) { // 디렉토리인지 확인
                System.out.print("\t<DIR>\t\t" + file.getName());
            } else { // 파일일 경우
                System.out.print("\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}