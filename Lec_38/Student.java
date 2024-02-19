package Lec_38;

public class Student implements Comparable<Student> {
	final String Name;
	int Age;
	static int total_s = 10;

	public static int getTot() {
//		this.
		return total_s;
	}

	public static void inc_Tot() {
		total_s++;

	}

	public Student(String N, int Age) {
		total_s++;
		// TODO Auto-generated constructor stub
		Name = N;
		this.Age = Age;
	}

	@Override
	public String toString() {
//		Name = ">";
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
