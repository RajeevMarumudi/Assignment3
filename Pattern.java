import java.util.Scanner;
public class Pattern {
    public static void patternprint(int n){
        int i,j;
        for(i=1;i<=n;++i){
            for(j=1;j<=i;++j){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        patternprint(n);
    }
}
