import java.util.Scanner;
class firstcode
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i;
        String a[]=new String[5];
        System.out.println("Enter the names");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextLine();
        }
        System.out.println("Names are:");
        for(i=0;i<5;i++)
        {
           System.out.println(a[i]);
        }
        System.out.println("Names in reverse order:");
        for(i=4;i>=0;i--)
        {
           System.out.println(a[i]);
        }
    }
}