//Write a class Student that takes name, age, and marks. 
//Include a method to display the grade (A, B, C) based on marks.

import java.util.*;

class Student{
	String name;
	int age;
	double marks;
	
	void displayDetails(){
		System.out.println("Your name is : "+name);
		System.out.println("Your age is : "+age);
		System.out.println("Your marks is : "+marks);
			}

	void assignGrade(){
			if(marks==100 || marks>=80){   //if(marks>=80) is also right
			System.out.println("Your grade is: A");
		}else if(marks>=60){
				System.out.println("Your grade is: B");
			}else if(marks>=40){
				System.out.println("Your grade is: C");
			}else{
				System.out.println("Your grade is: F");
	}
	
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		s1.name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		s1.age = sc.nextInt();
		
		System.out.println("Enter your marks: ");
		s1.marks = sc.nextDouble();
		
		s1.displayDetails();
		s1.assignGrade();
	}
}
