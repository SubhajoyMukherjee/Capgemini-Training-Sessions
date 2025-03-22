package day_9.oops.encapsulation;
//This is a Student Management System Using Encapsulation

public class Student {
	private String name;
	private int age;
	private String gender;
	private String branch;
	private String email;
	private String password;
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	
	
	
}
