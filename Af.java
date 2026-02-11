public class Af {
 
        final int b=10;
        final  void display(){
            System.out.println("final method");

        }

    }
    final class Bf extends Af{
        void show(){
            System.out.println("final class");
        }
    }
    class Test{
        public static void main(String[] args) {
            Bf obj=new Bf();
            obj.display();
            obj.show();
        }

    }