public class Static {
    
    static int a = 100;
    int b = 200;

    public static void main(String[] args) {

        System.out.println("Static value = " + a);

        Static obj = new Static();
        System.out.println("Non-static value = " + obj.b);
    }
}


