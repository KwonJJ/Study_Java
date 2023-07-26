package sec01_checkProblem;

public class Student {
	private String studentN;

	public Student(String studentN) {
		this.studentN = studentN;
	}

	public String getStudentN() {
		return studentN;
	}

	@Override
	public int hashCode() {
		return studentN.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (studentN.equals(student.getStudentN())) {
				return true;
			}
		}
		return false;
	}

}
