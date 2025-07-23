class Person{
  String name;
  int age;
  String city;

  Person(String n, int a, String c){
    this.name=n;
    this.age=a;
    this.city=c;
  }

  Person(String n, String c){
    this.name=n;
    this.age="Not provided";
    this.city=c;
  }

  void dispalyInfo(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("City: "+city);
  }
  
  public static void main(String[] args){
    Person person_1 = new Person("Banuja Vijayarajan",23,"Colombo");
    Person person_2 = new Person("Louis Tomlinson","Doncastor");

    person_1.displayInfo();
    person_2.displayInfo();
  }
}
