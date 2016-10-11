/**
 *
 * @author K00223375
 */
public class PrimeNumbersPrinter {
    
    public static void main(String[] args) 
    {
        int i,j, row =0;
        String primeNumbers ="";
        
        for(i=1; i<=1000; i++)
        {
            int count=0;
            for(j=i; j>=1; j--)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(i + " ");
                row++;
                if(row%10==0)
                {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
