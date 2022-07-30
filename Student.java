package sdbms;
import java.util.Comparator;
public class Student {
	private int id;
	private String name;
	private int age;
	private Double marks;

	public Student(int id, String name, int age, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return"Id:"+id+"\nName:"+name+"\nAge:"+age+"\nMarks:"+marks;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getMarkss() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

