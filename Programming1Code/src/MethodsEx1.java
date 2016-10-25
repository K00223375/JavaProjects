import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class MethodsEx1 {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter in value 1: ");
        int val1= Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter in value 2: ");
        int val2 = Integer.parseInt(input);
        
        System.out.println("Sum of the numbers: " + addNums(val1,val2));
        System.out.println("Subtact the numbers: " + subtractNums(val1,val2));
        System.out.println("Multiply the numbers: " + multiplyNums(val1,val2));
        System.out.println("Divide the numbers: " + divideNums(val1,val2));
    }
    
    public static int addNums(int x, int y)
    {
        int total = x+y;
        return total;
    }
    
    public static int subtractNums(int x, int y)
    {
        int total = x-y;
        return total;
    }
    
    public static int multiplyNums(int x, int y)
    {
        int total = x*y;
        return total;
    }
    
    public static int divideNums(int x, int y)
    {
        int total = x/y;
        return total;
    }
}
