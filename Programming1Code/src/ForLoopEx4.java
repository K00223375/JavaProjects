import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author K00223375
 */
public class ForLoopEx4 {
    
    public static void main(String[] args) 
    {
       final int LOW = 10;
       final int HIGH = 200;
       String output="";
       
       for(int i = LOW; i<=HIGH; i++)
       {
           if(i%4==0 && i%5!=0)
           {
               output += i + " ";
           }    
       }
       JOptionPane.showMessageDialog(null, new JTextArea(output));
    }
}
