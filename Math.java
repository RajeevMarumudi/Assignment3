import java.util.Scanner;
public class Math {
    public static int hcf(int a,int b)
    {
        if(a==0){
            return a;
        }
        if(b==0){
            return b;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return hcf(a-b,b);
        }
        return hcf(a,b-a);
    }
    public static int lcm(int a,int b)
    {
        return (a*b)/hcf(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("HCF is:"+a+"and"+b+"is:"+hcf(a,b));
        System.out.println("LCM is:"+a+"and"+b+"is:"+lcm(a,b));
    }
}
