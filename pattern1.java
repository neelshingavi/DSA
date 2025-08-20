public class pattern1 
{
    public static void main(String args[]) 
    {
        int n = 5;
        for(int i=1;i<n;i++)
        {
            char c = 'A';
            char d = 'A';
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(c);
                c++;
            }
            c--;
            for(int l=0;l<i-1;l++)
            {
                c--;
                System.out.print(c);
            }

            System.out.println();
        }
    }
}
