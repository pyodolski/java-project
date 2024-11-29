package member;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    // DB 연결 URL
    private static final String USER = "scott";
    // URL 사용자명
    private static final String PASSWORD = "tiger";
    // 사용자 비밀번호

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
        // getConnection()를 호출하여 데이터베이스와의 연결을 생성
        // SQLException이 연결실패 시 호출
    }

    // 회원 등록 메소드
    public int insert(MemberVO member) {
        String sql = "INSERT INTO Member (id, name, email, password, regdate) VALUES (?, ?, ?, ?, ?)";
        try (Connection  connect = getConnection();
             PreparedStatement state = connect.prepareStatement(sql)) {
            // SQL 쿼리를 미리 컴파일하고 파라미터 바인딩을 통해 안정성 및 성능을 최적화하기 위해 사용되는 JDBC 객체.

            state.setInt(1, member.getId());
            state.setString(2, member.getName());
            state.setString(3, member.getEmail());
            state.setString(4, member.getPassword());
            state.setDate(5, Date.valueOf(member.getRegdate()));  // 문자열을 SQL Date로 변환

            return state.executeUpdate();  // 성공 시 1 반환
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 회원 삭제 메소드
    public int delete(int id) {
        String sql = "DELETE FROM Member WHERE id = ?";
        try (Connection connect = getConnection();
             PreparedStatement state = connect.prepareStatement(sql)) {

            state.setInt(1, id);
            return state.executeUpdate();  // 성공 시 1 반환
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 회원 정보 수정 메소드
    public int update(int id, String email, String password) {
        String sql = "UPDATE Member SET email = ?, password = ? WHERE id = ?";
        try (Connection connect = getConnection();
             PreparedStatement state = connect.prepareStatement(sql)) {

            state.setString(1, email);
            state.setString(2, password);
            state.setInt(3, id);

            return state.executeUpdate();  // 성공 시 1 반환
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 특정 회원 조회 메소드
    public MemberVO getMemberById(int id) {
        String sql = "SELECT * FROM Member WHERE id = ?";
        try (Connection connect = getConnection();
             PreparedStatement state = connect.prepareStatement(sql)) {

            state.setInt(1, id);
            ResultSet rs = state.executeQuery();
            // SQL 쿼리의 실행 결과를 테이블 형식의 데이터로 받아오는 객체.
            // 쿼리 결과를 행으로 탐색할 수 있게 함.

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

        try (Connection connect = getConnection();
             Statement state = connect.createStatement();
             ResultSet result = state.executeQuery(sql)) {

            while (result.next()) {
                members.add(new MemberVO(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getString("email"),
                        result.getString("password"),
                        result.getDate("regdate").toString()  // SQL Date를 문자열로 변환
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return members;
    }
}
