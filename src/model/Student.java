package model;

public class Student {
	private String sno;
	private String name;
	private String age;
	public Student(String sno, String name, String age) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
		
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}


}
