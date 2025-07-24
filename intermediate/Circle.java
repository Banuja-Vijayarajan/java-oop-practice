import java.util.*;

class Circle{
	Double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	Circle(){
		this.radius=null;
	}

	double calculateArea(){
		if(radius == null){
		System.out.println("Radius not provided!");
			return 0.0;
		}
		return Math.PI * radius * radius;
	}
	
/* 	WRONG!!!
	double calculateArea(){
		Double area = 3.14 * radius * radius;
		return area;
	}
*/
	 
	 
	void displayInfo(){
		System.out.println("Radius: " + (radius != null ? radius : "Not provided!"));
		System.out.println("Area: " + calculateArea());
		System.out.println(); //fro spacing between circles
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5.0);
		
		circle1.displayInfo();
		circle2.displayInfo();
	}
}