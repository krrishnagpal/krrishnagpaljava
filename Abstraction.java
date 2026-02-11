
abstract class sample{
    int a=10;
    abstract void display();
     }

class test extends sample{
     void display(){
        System.out.println(a);
        System.out.println("this is abstraction");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        test obj=new test();//Create an object of child class test
        obj.display();//call the display method inherited from abstract class sample
             //call the show method of test class

        
    }
}
