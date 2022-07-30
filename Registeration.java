package sdbms;
import java.util.Scanner;
public class Registeration{
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);	
			StudentManagementSystem obj=new StudentManagementSystemImpl();
			while(true) {
				System.out.println("Enter-");
				System.out.println("1.Add Student\n2.Remove Student\n3.Remove All Students");
				System.out.println("4.Display Student\n5.Display All Students\n6.Update Student");
				System.out.println("7.Count Students\n8.Sort Students\n9.EXIT");
				System.out.println("Enter your choice");
				int choice=sc.nextInt();

				switch(choice) {
				case 1:
					obj.addStudent();
					break;
				case 2:
					obj.removesStudent();
					break;
				case 3:
					obj.removeAllStudent();
					break;
				case 4:
					obj.displayStudent();
					break;
				case 5:
					obj.displayAllStudent();
					break;
				case 6:
					obj.updateStudent();
					break;
				case 7:
					obj.countStudent();
					break;
				case 8:
					obj.sortStudent();
					break;
				case 9:
					System.out.println("Thank you!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice, Kindly Enter Valid Choice....!");
				}
				System.out.println("-----------------------------------------------");
			}
		}
	
}
	


