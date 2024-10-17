package member;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    // 데이터베이스 연결 정보
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    private static final String USER = "scott";
    private static final String PASSWORD = "tiger";

    // DB 연결 생성 메소드
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // 회원 등록 메소드
    public int insert(MemberVO member) {
        String sql = "INSERT INTO Member (id, name, email, password, regdate) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, member.getId());
            stmt.setString(2, member.getName());
            stmt.setString(3, member.getEmail());
            stmt.setString(4, member.getPassword());
            stmt.setDate(5, Date.valueOf(member.getRegdate()));  // 문자열을 SQL Date로 변환

            return stmt.executeUpdate();  // 성공 시 1 반환
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 회원 삭제 메소드
    public int delete(int id) {
        String sql = "DELETE FROM Member WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate();  // 성공 시 1 반환
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 회원 정보 수정 메소드
    public int update(int id, String email, String password) {
        String sql = "UPDATE Member SET email = ?, password = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, password);
            stmt.setInt(3, id);

            return stmt.executeUpdate();  // 성공 시 1 반환
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 특정 회원 조회 메소드
    public MemberVO getMemberById(int id) {
        String sql = "SELECT * FROM Member WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new MemberVO(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getDate("regdate").toString()  // SQL Date를 문자열로 변환
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 모든 회원 조회 메소드
    public List<MemberVO> getAllMembers() {
        List<MemberVO> members = new ArrayList<>();
        String sql = "SELECT * FROM Member";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                members.add(new MemberVO(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getDate("regdate").toString()  // SQL Date를 문자열로 변환
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return members;
    }
}
