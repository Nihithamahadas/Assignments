package que_1;

public class MyRecord extends Student{

	public MyRecord(String studentName, String rollNumber, Long studentMarks) {
		super(studentName, rollNumber, studentMarks);
	}

	@Override
	public String toString() {
		return "MyRecord [studentName=" + studentName + ", rollNumber=" + rollNumber + ", studentMarks=" + studentMarks
				+ "]";
	}
}
