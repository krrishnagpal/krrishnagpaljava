import java.util.Scanner;
public class Duplicate {
    int a[]=new int[10];
    public static void main(String[] args) {
        Duplicate d=new Duplicate();
        Scanner s=new Scanner(System.in);
        int i,j;
        System.out.println("Enter 10 elements:");
    
    for(i=0;i<10;i++){
        d.a[i]=s.nextInt();
    }
    for(i=0;i<10;i++){
        for(j=i+1;j<10;j++){
            if(d.a[i]==d.a[j]){
                System.out.println("Duplicate element is found: ");
                break;
            }
            else{
                System.out.println("No duplicate elements found.");
                s.close();
        }
    }
}
}
}
