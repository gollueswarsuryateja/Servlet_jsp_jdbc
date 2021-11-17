package demodb.model;

public class Member {

	private String email;
	private String name;
	private String mobile;
	private String gender;
	private int age;
	
	
	public Member() {
		super();
	}
	public Member(String email, String name, String mobile, String gender, int age) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member1 [email=" + email + ", name=" + name + ", mobile=" + mobile + ", gender=" + gender + ", age="
				+ age + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
