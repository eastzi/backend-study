package J17_최상위클래스;

import java.util.Objects;

public class Teacher {

	private String name;
	private String subject;
	private int age;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", age=" + age + "]";
	}
	
	public void classInfo() {
		System.out.println();
	}
	
}
