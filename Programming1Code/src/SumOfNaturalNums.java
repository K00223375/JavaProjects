/**
 *
 * @author K00223375
 */
public class SumOfNaturalNums {

    public static void main(String[] args) 
    {
        int i, total=0;
        
        for(i=1;i<1000;i++)
        {
            if(i%3==0 ||i%5==0)
            {
                total +=i;
            }
        }
        System.out.println(total);
    }
}
