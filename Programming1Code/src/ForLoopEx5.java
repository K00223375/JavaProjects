
/**
 *
 * @author K00223375
 */
public class ForLoopEx5 {

    public static void main(String[] args) 
    {
        int i,j,total;
        
        System.out.print("  | ");
        for(i=1;i<10;i++)
        {
            System.out.printf("%3d",i);
        }
        
        System.out.println();
        
        for(i = 1; i<10; i++)
        {   
            System.out.print(i+" | ");
            for(j = 1; j<10; j++)
            {
                total=i*j;
                System.out.printf("%3d", total);
            }
            System.out.println();
        }
    }
    
}
