import java.util.Scanner;
// comment
public class first {

    public static void main(String[] args) {
        int i , j;
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Rows : ");
        int row = sc.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.print("No of Cols : ");
        int col = c.nextInt();
        for(i = 1 ; i<=row ; i++)
            {
                for(j=1; j<=col; j++)
                    {
                        if(i==1 || i==row || j==1 || j== col)
                        {
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }

                    }
                System.out.println();    
            }
    }
}
