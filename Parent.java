class GrandParent {
    GrandParent(){
        System.out.println("GrandParent Constructor");
    }
}

class Child  extends GrandParent{
   Child(){
        System.out.println("Child Constructor");
    }
}
public class Parent  {
    public static void main(String args[]) {
        Child c = new Child();

    }
}