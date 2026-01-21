import java.util.Scanner;

class OPPclass {
    public static void main(String[] args){
    int sum;
    int sum_arr = 0;
    Scanner s=new Scanner(System.in);
    sum=s.nextInt();
    int arr[]=new int[5];
    for(int i=0;i<5;i++){
        arr[i]=s.nextInt();
        sum_arr+=arr[i];

    }
    System.out.println(sum_arr);
    if(sum==sum_arr){
        System.out.println("BOTH ARE EQUAL");
    }
    else{
        System.out.println("BOTH ARE NOT EQUAL");
    }
    }
}
