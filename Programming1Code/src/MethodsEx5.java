/**
 *
 * @author K00223375
 */
public class MethodsEx5 {

    public static void main(String[] args) 
    {
        int num1 = 3;
        int num2 = 5;
        int num3 = 6;
        int num4 = 7;
        int num5 = 9;
        
        System.out.println( "The largest of 2 int values: " + largestNum(num1, num2));
        System.out.println( "The largest of 3 int values: " + largestNum(num1, num2, num3));
        System.out.println( "The largest of 4 int values: " + largestNum(num1, num2, num3,num4));
        System.out.println( "The largest of 5 int values: " + largestNum(num1, num2, num3,num4,num5));
    }
    
    public static int largestNum(int n1, int n2)
    {
        if(n1>n2)
        {
            return n1;
        }
        else
        {
            return n2;
        }
    }
    
    public static int largestNum(int n1, int n2, int n3)
    {
        return largestNum(largestNum(n1,n2),n3);
    }
    
    public static int largestNum(int n1, int n2, int n3, int n4)
    {
        return largestNum(largestNum(n1,n2,n3),n4);
    }
    
    public static int largestNum(int n1, int n2, int n3, int n4, int n5)
    {
        return largestNum(largestNum(n1,n2,n3,n4),n5);
    }
}
