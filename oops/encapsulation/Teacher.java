package oops.encapsulation;

public class Teacher {
	public static void main(String[] args) {
		Student s = new Student(101);
/*
 * To secure the data better to use the methods.
 * Instead of giving the value directly like below line.
 * And to stop using this, we have to use access modifiers for the variables. 
 * Encapsulation is all about data-hiding so we have to set the variables private 
 */
		//s.isAttended=true;
		s.setStudentAttendence(true);
		s.getStudentAttendence();
	}
}
