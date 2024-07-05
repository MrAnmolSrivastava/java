import java.util.Scanner;

public class shruti {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num: ");
        int n= sc.nextInt();
        int m=n-1;
        for(i=1;i<=2*n-1;i++)
        {
           for(j=1;j<=2*n-1;j++)
            {
                if(i==1 || j==1 || i==2*n-1 || j==2*n-1)
                {
                    System.out.print(n);
                }
                if (i>1 && j>1 && j>=i)
                 {
                    System.out.print(m);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}