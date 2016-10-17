/**
 *
 * @author K00223375
 */
public class ArrayEx4 {

    public static void main(String[] args) 
    {
        int[] arr1 = new int[100];
        for(int i=0; i<arr1.length;i++)
        {
            arr1[i] = (int)(Math.random()*1000+1);
            
        }
        
        int lowNum=arr1[0];
        int highNum=arr1[0];
        int total=0;
        int avg;
        int seven=0;
        
        for(int i=0; i<arr1.length;i++)
        {
            total += arr1[i];
            
            if(lowNum>arr1[i])
            {
                lowNum=arr1[i];
            }
            
            if(highNum<arr1[i])
            {
                highNum=arr1[i];
            }
            
            if(arr1[i]==7)
            {
                seven++;
            }
        }
        avg = total/arr1.length;
        
        System.out.println("Smallest is " + lowNum);
        System.out.println("Largest is " + highNum);
        System.out.println("Number of 7's in the array " + seven);
        System.out.println("Sum is " + total);
        System.out.println("Average is " + avg);
    }
}
