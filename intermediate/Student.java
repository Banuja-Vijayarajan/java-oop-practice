class Student{
	private String name;
	private int age;
	private double gpa;
	
	Student(String name, int age, double gpa){
		this.name=name;
		this.age=age;
		this.gpa=gpa;
	}
	
	String getName(){
	return name;	
	}
	
	int getAge(){
		return age;
	}
	
	double getGpa(){
		return gpa;
	}
	
	void setName(String name){
		  this.name=name;
	}
	
	void setAge(int age){
		this.age=age;
	}
	
	void setGpa(double gpa){
		this.gpa=gpa;
	}
	
	void displayDetails(){
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("GPA: " + gpa);
	}
	
	
	public static void main(String[] args){
		Student s1 = new Student("banu",23,3.92);
		
		s1.displayDetails();
	}
}