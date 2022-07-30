package sdbms;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
public abstract  class StudentManagementSystemImpl implements StudentManagementSystem {
	private static final ArrayList<Student> Student = null;
	private static final String collections = null;
	LinkedHashMap<Integer, Student> db=new LinkedHashMap<Integer,Student>();
	Scanner sc=new Scanner(System.in);

	@Override
	public void addStudent() {
		System.out.println("Enter Student Id");
		int id=sc.nextInt();
		System.out.println("Enter Student Name");
		String name=sc.next();
		System.out.println("Enter Student Age");
		int age=sc.nextInt();
		System.out.println("Enter Student Marks");
		double marks=sc.nextDouble();
		Student s1=new Student(id, name, age, marks);
		db.put(id, s1);
		System.out.println("Student records are inserted successfully!");
	}

	

	@Override
	public void removesStudent() {
		
			//		Set<Integer> s=db.keySet();
			//		Student std=db.get(s);
			//		for(Integer key:s) {
			//			System.out.println("Enter Student Id to be Removed from the Database");
			//			key=sc.nextInt();
			//			
			//			System.out.println(db.remove(key));
			////			System.out.println("Student "+db.get(key)+" is Removed from the Database!");
			//		}
			System.out.println("Enter Student to be Deleted from the database");
			int id=sc.nextInt();
			if(db.containsKey(id)) {
				db.remove(id);
				System.out.println("Student "+id+" is successfully deleted from the database!");
			}
			else {
				try {
					throw new StudentDataNotFoundException();

				}
				catch (StudentDataNotFoundException e) {
					System.out.println(e.getMessage());
				} 
			}

		}

	@Override
	public void removeAllStudent() {
		db.clear();
		System.out.println("Student records are removed successfully!!");

	}
	@Override
	public void countStudent() {
		System.out.println("Number of Students present in db is:"+db.size());
	}


	@Override
	public void updateStudent() {
		System.out.println("Enter Student Id to Modifiy Student Details");
		int id=sc.nextInt();

		if(db.containsKey(id)) {
			Student std=db.get(id);
			System.out.println("1.Update Age\t2.Update Name\t3.Update Marks");
			System.out.println("Enter you choice");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter Age to be modified");
				int age=sc.nextInt();
				std.setAge(age);
				break;
			case 2: 
				System.out.println("Enter Name to be modified");
				String name=sc.next();
				std.setName(name);
				break;

			case 3:
				System.out.println("Enter Marks to be modified");
				double marks=sc.nextDouble();
				std.setMarks(marks);
				break;
			default:
				System.out.println("Enter valid option......");
			} 
		}
		else {
			try {
				throw new StudentDataNotFoundException();

			}
			catch (Exception e) {
				System.out.println(e.getMessage());			
			}
		}
		System.out.println("Updated Successfully!");
	}

		
	

	@Override
	public void displayStudent() {
//		Set<Integer> s=db.keySet();
		System.out.println("Enter Student Id to be displayed");
		Integer id=sc.nextInt();
		if(db.containsKey(id))
			System.out.println(db.get(id));
		else {
			try {
				throw new StudentDataNotFoundException();
			}
			catch(StudentDataNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public void sortStudents() {
	}

	

	@Override
	public void displayAllStudent() {
		Set<Integer> s=db.keySet();
		System.out.println("Students present in the database is as follows.......");
		for(Integer key:s) {
			System.out.println(db.get(key)+"\n-----------------------------");
		}
		/*
		 * for(int key:s)
		 * Student std=db.get(key);
		 * System.out.println("Id:"+std.getId()+"Name:"+std.getName+"Age:"+std.getAge()+"Marks:"+std.getMarks();		 * 
		 */
	}

  @Override
  public void SortStudent() {
	ArrayList<Student> l=new ArrayList<Student>();
	Set<Integer> s=db.keySet();
	for(int id:s) {
		l.add(db.get(id));
		
	}
	System.out.println("1:Sort based on id\n2:sort based on name");
	System.out.println("3:Sort based on age\n4:sort based on marks");
	System.out.println("enter choice");
	int choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		Collections.sort(l,new SortStudentById());
		display(l);
		
		break;
	case 2:
		Collections.sort(l,new SortStudentBYName());
		display(l);
       
        break;
    case 3:
    	Collections.sort(l,new SortStudentByAge());
    	display(l);
        break;
    case 4:
    	Collections.sort(l,new SortStudentByMarks());
    	display(l);
    	break;
   default:
	   System.out.println("invalid choice!");
	}
  }

  
    	
			
 private static void display(List<Student> l) {
	  for(Student s1:l) {
		  System.out.println(s1);
	  }
 }
 }
 