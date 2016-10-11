import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author K00223375
 */
public class ForLoopEx2Extra {

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a positive number: ");
        int num = Integer.parseInt(input);
        
        String output="";
        int i;
        
        for(i = 1; i<=num; i++)
        {
            output += i + " ";
            if(i%8==0)
            {
                output += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, new JTextArea(output));
    }
    
}
