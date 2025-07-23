class Person{
  String name;
  Integer age;
  String city;

  Person(String n, int a, String c){
    this.name=n;
    this.age=a;
    this.city=c;
  }

  Person(String n, String c){
    this.name=n;
    this.age=null;
    this.city=c;
  }

  void displayInfo(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+(age != null ? age : "Not provided"));
    System.out.println("City: "+city);
  }
  
  public static void main(String[] args){
    Person person_1 = new Person("Banuja Vijayarajan",23,"Colombo");
    Person person_2 = new Person("Louis Tomlinson","Doncastor");

    person_1.displayInfo();
    person_2.displayInfo();
  }
}

/* 
import java.util.*;

class Person{
  String name;
  Integer age;
  String city;
  
//If you want to allow new Person() with no values at first 
//(and then fill fields using user input), you need to add a default constructor with null values.

  Person(){
	this.name = null;
    this.age = null;
    this.city = null;
  }
    
// Constructors must match the way objects are created.
// If you use new Person(), you need a no-arg constructor.
// Java doesn't add a default constructor if you define any constructor manually.

  Person(String n, int a, String c){
    this.name=n;
    this.age=a;
    this.city=c;
  }

  Person(String n, String c){
    this.name=n;
    this.age=null;
    this.city=c;
  }

  void displayInfo(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+(age != null ? age : "Not provided"));
    System.out.println("City: "+city);
  }
  
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    Person person_1 = new Person();
    Person person_2 = new Person();
	
	System.out.println("Enter the name of person 1: ");
	person_1.name = sc.nextLine();
	
	System.out.println("Enter the age of person 1: ");
	person_1.age = sc.nextInt();
	
	sc.nextLine();
	 
	System.out.println("Enter the city of person 1: ");
	person_1.city = sc.nextLine();

    person_1.displayInfo();
    person_2.displayInfo();
  }
}


 */
