import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class MethodsEx3 {

    public static void main(String[] args) {
       String input = JOptionPane.showInputDialog("Enter in value 1: ");
        int val1= Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter in value 2: ");
        int val2 = Integer.parseInt(input);
        
        JOptionPane.showMessageDialog(null, "Hypotenuse of this triangle is "+ hypotenuse(val1,val2));
    }
    
    public static double hypotenuse(int x, int y)
    {
        double hyp;
        hyp = Math.sqrt( ( Math.pow(x,2) + Math.pow(y,2) ) );
        return hyp;
    }   
}
