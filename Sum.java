import java.util.Scanner;

public class Sum {
    int n;
    int sum=0;
    public static void main(String[] args) {
        Sum m=new Sum();
        Scanner s=new Scanner(System.in);
        m.n=s.nextInt();
        for(int i=1;i<=m.n;i++){
            m.sum+=i;
        }
        System.out.println(m.sum);
    }
}
