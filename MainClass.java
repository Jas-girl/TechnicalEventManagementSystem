package project;
import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Register arr[]=new Register[3];
	Register r=new Register();
	RegisterMethod obj=new RegisterMethod(r);
	int index=0;
	arr[index++]=new Register("Aman", 23, "MCA", "Python");
	arr[index++]=new Register("Rahul",19,"Btech","Gaming");
	arr[index++]=new Register("Avleen",34,"BCA","Web Designer");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i].toString());
	}
	int choice;
	do {
		System.out.println("********Technical Management System ***********");
		System.out.println("\n1.Register the event \n2.Filter students by Event \n3.Filter students by name \n4.Count students for specific event");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			//register for the event
			System.out.println("No of students registered");
			int no=sc.nextInt();
			Register arr1[]=new Register[no];
			
			for (int i = 0; i < arr1.length; i++) {
				System.out.println("Student Register:"+(i+1));
				System.out.println("Student should entered \n1.Name \n2.Age \n3.Stream \n4.Event in which he/she interested");
				arr1[i]=new Register(sc.next(), sc.nextInt(), sc.next(), sc.next());
			}
			Register arr2[]=new Register[arr.length+arr1.length];
			System.arraycopy(arr, 0, arr2,0, index);
			System.arraycopy(arr1, 0, arr2,index++,arr1.length);
			arr=arr2;
			index+=arr1.length;
			System.out.println("successfully registered");
			for (int i = 0; i < arr2.length; i++) {
				System.out.println(arr2[i].toString());
			}
			break;
		case 2:
			System.out.println("Enter the type of the event to filter");
			obj.filter(arr,sc.next());
			break;
		case 3:
			System.out.println("Enter the name to filter");
			obj.filterName(arr, sc.next());
			break;
		case 4:
			System.out.println("Enter the type of the event to count the students");
			obj.count(arr,sc.next());break;
		default:System.out.println("exit the system");
		}
		
	}while(choice<5);
	
	
		
}
}
