import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class FactorialsForLoop {

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a number a positive number: ");
        int num = Integer.parseInt(input);
        int i, total=1;
        
        for(i=num;i>=1;i--)
        {
            total *= i;
        }
        
        JOptionPane.showMessageDialog(null,num+"! = "+ total);
    }
}
