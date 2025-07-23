//Create a Rectangle class that calculates: Area, Perimeter

import java.util.*;

class Rectangle{
	double side_A;
	double side_B;
	
	void calculateArea(){
		double area = side_A * side_B;
		System.out.println("The area is :" + area);
	}
	
	void calculatePerimeter(){
		double perimeter = 2 * side_A + 2 * side_B;
		System.out.println("The perimeter is :" + perimeter);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		
		System.out.println("Enter the side A of the rectangle: ");
		r1.side_A = sc.nextDouble();
		
		System.out.println("Enter the side B of the rectangle: ");
		r1.side_B = sc.nextDouble();
		
		r1.calculateArea();
		r1.calculatePerimeter();
	}
}