
import javax.swing.JOptionPane;


public class MinsAndSeconds 
{
    public static void main(String[] args)
    {
        int min;
        int secs;
        
        String input = JOptionPane.showInputDialog("Enter an Integer Amount in Seconds");
        int time = Integer.parseInt(input);
        
       min = time/60;
       secs = time%60;
       
       JOptionPane.showMessageDialog(null, time + " seconds is " + 
                                            min + " Minute(s) and " +
                                            secs + " Seconds");
        
    }
}
