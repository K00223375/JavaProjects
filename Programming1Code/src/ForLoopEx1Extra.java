/**
 *
 * @author K00223375
 */
public class ForLoopEx1Extra {

    public static void main(String[] args) 
    {
        int i;
        
        for(i=1; i<=100; i++)
        {
            System.out.printf("%-3d \t",i);
            if(i%10==0)
            {
                System.out.println();
            }
        }
    }
    
}
