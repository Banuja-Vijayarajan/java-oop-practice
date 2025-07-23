public class Car{
    String brand;
    String model;
    int year;
    
    Car(String b,String m,int y){
        this.brand=b;
        this.model=m;
        this.year=y;
    }
    
    void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
        
    public static void main(String[] args){
    Car car = new Car("Toyota","Corolla",2010);
    car.displayDetails();
    }
}