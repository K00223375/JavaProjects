import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class ForLoopEx4Extra {

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter a postive number: ");
        int num = Integer.parseInt(input);
        
        int i;
        for(i=1; i<=num; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%-3d", j*i);
            }
            System.out.println();
        }
    }
    
}
