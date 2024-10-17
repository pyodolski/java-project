package member;

import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		
		//모든 회원들을 출력
		for (MemberVO m : dao.getAllMembers()) {
			System.out.println(m);
		}
		
		// id를 입력받아, 그 회원을 출력
		System.out.print("\nid를 입력하세요: ");
		int id = sc.nextInt();
		MemberVO member = dao.getMemberById(id);
		System.out.println(member);
		
		// 새로운 회원 정보를 입력받아, DB에 저장
		System.out.println("\n새로운 회원 정보(id, 이름, 이메일, 암호, 등록일) 입력:");
		member = new MemberVO();
		member.setId(sc.nextInt());
		member.setName(sc.next());
		member.setEmail(sc.next());
		member.setPassword(sc.next());
		member.setRegdate(sc.next());
		if (dao.insert(member) == 1)
			System.out.println("입력 성공!!");
		else
			System.out.println("입력 실패!!");
		
		// 수정할 회원 정보를 입력받아, DB 변경
		System.out.println("\n수정할 회원 정보(id, 이메일, 암호) 입력: ");
		id = sc.nextInt();
		String email = sc.next();
		String password = sc.next();
		if (dao.update(id, email, password) == 1)
			System.out.println("변경 성공!!");
		else
			System.out.println("변경 실패!!");
		
		// 삭제할 회원 정보를 입력받아, DB에서 삭제
		System.out.print("\n삭제할 회원 id 입력: ");
		id = sc.nextInt();
		if (dao.delete(id) == 1)
			System.out.println("삭제 성공!!");
		else
			System.out.println("삭제 실패!!");
		
		//모든 회원들을 출력
		System.out.println("\n최종 회원 정보");
		for (MemberVO m : dao.getAllMembers()) {
			System.out.println(m);
		}
		sc.close();
	}
}
