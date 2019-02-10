package javaeetutorial.bookmarks;

public class Grade {

	private String grade;
	private String subject;

	public Grade() {
	}

	public Grade(String grade, String subject) {
		this.grade = grade;
		this.subject = subject;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
