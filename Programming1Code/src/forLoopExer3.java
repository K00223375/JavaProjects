import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 * @author K00223375
 */
public class forLoopExer3 {

    public static void main(String[] args) 
    {
       String input = JOptionPane.showInputDialog("Enter a positive value: ");
       int value = Integer.parseInt(input);
       
       input = JOptionPane.showInputDialog("Enter an upper limit: ");
       int upperLimit = Integer.parseInt(input);
       String output = "The multiples of " + value + " between " + value + " and " + upperLimit + " are: \n";
       upperLimit /= value;   
       
       int outputVal;
       
       for(int i = 1; i<=upperLimit; i++)
       {
           outputVal = value*i;
           output += outputVal + "\t";
           if(i%5==0)
           {
               output += "\n";
           }      
       }
       
       JOptionPane.showMessageDialog(null, new JTextArea(output));
    }
    
}
