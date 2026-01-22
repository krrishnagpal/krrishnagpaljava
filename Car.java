public class Car {
    String model;
    int milege;
    void display(){
        System.out.println("model="+model);
        System.out.println("milege="+milege);
    }
    public static void main(String[] args) {
        Car c1=new Car();
        c1.model="creta";
        c1.milege=22;

        Car c2=new Car();
        c2.model="fortuner";
        c2.milege=10;
        
        c1.display();
        c2.display();

    }
    
}
