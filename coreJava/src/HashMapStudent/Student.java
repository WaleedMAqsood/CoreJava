package HashMapStudent;

public class Student {

	private String name;
	private String age;
	private String birthday;
	private String gender;
	private String course;
	private String studentid;

	public Student(String studentid, String name, String age, String birthday, String gender, String course) {

		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.gender = gender;
		this.course = course;

	}

	public String getName() {

		return name;

	}

	public void setStudentid(String studentid) {

		this.studentid = studentid;

	}

	public String getStudentid() {

		return studentid;
	}

	public void setAge(String age) {

		this.age = age;

	}

	public String getAge() {

		return age;
	}

	public void setCourse(String course) {

		this.course = course;

	}

	public String getCourse() {

		return course;

	}

	public void setBirthday(String birthday) {

		this.birthday = birthday;

	}

	public String getBirthday() {

		return birthday;

	}

	public void setGender(String gender) {

		this.gender = gender;

	}

	public String getGender() {

		return gender;

	}

}