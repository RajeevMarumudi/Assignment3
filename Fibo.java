import java.util.Scanner;
public class Fibo {
    static int a=0,b=1,c=0;
    public static void print(int n){
        if(n>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            print(n-1);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        System.out.print(a+" "+b);
        print(n-2);
    }
}
