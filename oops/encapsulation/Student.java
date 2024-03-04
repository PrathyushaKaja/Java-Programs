package oops.encapsulation;

public class Student {
	private int stuRollNo;
	private String stuName;
	private boolean isAttended;
	public Student(int stuRollNo) {
		this.stuRollNo = stuRollNo;//this keyword --> if we are taking the same variable 
	}
	
	public void setStudentAttendence(boolean attendenceStatus) {
		if(!isAttended)
		this.isAttended = attendenceStatus;
		System.out.println("Teacher gave the attendence status to the student");
	}

	public boolean getStudentAttendence() {
		System.out.println("Student can access the attendence report");
		return isAttended;
	}
	
	
}
