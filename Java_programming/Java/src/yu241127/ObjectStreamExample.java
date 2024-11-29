package yu241127;

import java.io.*; // 파일 입출력 관련 클래스
import java.text.SimpleDateFormat; // 날짜 형식 지정 클래스
import java.util.*; // 컬렉션 및 유틸리티 클래스

// Serializable 인터페이스 구현으로 객체 직렬화 가능
class Board implements Serializable {
    private int bno; // 게시글 번호
    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자
    private Date date; // 작성 날짜

    // 생성자: 필드를 초기화
    public Board(int bno, String title, String content, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    // getter와 setter 메소드
    public int getBno() { return bno; }
    public void setBno(int bno) { this.bno = bno; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getWriter() { return writer; }
    public void setWriter(String writer) { this.writer = writer; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}

public class ObjectStreamExample {
    public static void main(String[] args) throws Exception {
        // List를 파일에 저장
        writeList();
        // 파일에 저장된 List 읽기
        List<Board> list = readList();

        // 날짜 포맷 설정
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // List 내용을 모니터에 출력
        for (Board board : list) {
            System.out.println(
                board.getBno() + "\t" + board.getTitle() + "\t" +
                board.getContent() + "\t" + board.getWriter() + "\t" +
                sdf.format(board.getDate())
            );
        }
    }

    // List 생성 및 파일에 저장하는 메소드
    public static void writeList() throws Exception {
        // List 생성
        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
        list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
        list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));

        // 객체 출력 스트림을 이용해서 List 출력
        FileOutputStream fos = new FileOutputStream("./board.db");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list); // 리스트 직렬화 및 출력
        oos.flush();
        oos.close();
    }

    // 파일에서 List를 읽어오는 메소드
    @SuppressWarnings("unchecked")
    public static List<Board> readList() throws Exception {
        // 객체 입력 스트림을 이용해서 List 읽기
        FileInputStream fis = new FileInputStream("./board.db");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>) ois.readObject(); // 직렬화된 리스트 읽기
        ois.close();
        return list;
    }
}