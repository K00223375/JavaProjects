import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class ForLoopEx2 
{
    public static void main(String[] args)
    {
        String output ="";
        int i;
        
        for(i=1;i<=10;i++)
        {
            output += i + ", ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
