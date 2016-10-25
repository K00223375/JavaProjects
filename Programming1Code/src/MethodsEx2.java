import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class MethodsEx2 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter in value 1: ");
        int val1= Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter in value 2: ");
        int val2 = Integer.parseInt(input);
        
        numSizeChecker(val1, val2);
    }
    
    public static void numSizeChecker(int x, int y)
    {
        if(y<x)
        {
            System.out.println("Error! Second value smaller than first!");
        }
        else
        {
            int total=0;
            for(int i=x;i<=y;i++)
            {
                total+=i;
            }
            System.out.println("Sum of the integers from "+ x +" to " + y + " is "+total);
        }
    }
    
}
