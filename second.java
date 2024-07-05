public class second {
    public static void main(String[] args) {
        
        int i,j;
        int r=5;
        int c=5;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                if((j<=3 && i==1) || (j>=3 && i<=c && i==5))
                {
                    System.out.print("@");
                }
                else if(j==3)
                {
                    System.out.print(".");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
