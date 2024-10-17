package member;

public class MemberVO {
	private int id;
	private String name;
	private String email;
	private String password;
	private String regdate;
	
	public MemberVO(int id, String name, String email, String password, String regdate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.regdate = regdate;
	}

	public MemberVO() {
	}

	public String toString() {
		return "Member(id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", regdate="
				+ regdate + ")";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}	
}
