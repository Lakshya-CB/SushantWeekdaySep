package Lec_37;

public class Student implements Comparable<Student>{
	String Name;
	int Age;

	public Student(String N, int Age) {
		// TODO Auto-generated constructor stub
		Name = N;
		this.Age = Age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name + "=>" + Age;
	}

	@Override
	public int compareTo(Student o) {
//		A.compareTo(B)
//		arr[s].compareTo(arr[s+1])
//		this => A / arr[s]
//		o => B or arr[s+1]
		return this.Age - o.Age;
	}
}
