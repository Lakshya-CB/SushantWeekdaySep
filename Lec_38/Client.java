package Lec_38;

public class Client {
	public static void main(String[] args) {
//		Integer.MAX_VALUE;
		Student.inc_Tot();
		Student.inc_Tot();
		Student.inc_Tot();
		
		System.out.println(Student.total_s);
		Student s1 = new Student("A", 10);
		System.out.println(Student.total_s);
		Student s2 = new Student("B", 20);
		System.out.println(Student.total_s);
		System.out.println(Student.total_s);		
	}
//	public void chomu() {
//		this.chomu();
//	}
}
