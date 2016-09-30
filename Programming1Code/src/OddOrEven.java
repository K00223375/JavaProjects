import javax.swing.JOptionPane;

public class OddOrEven 
{
   public static void main(String[] args)
   {
        int num;
        String input = JOptionPane.showInputDialog("Enter Your Number: ");
    
        num = Integer.parseInt(input);
       
        if(num%2==0)
            JOptionPane.showMessageDialog(null, num + " is an Even Number");
        
        
        if(num%2==1)
            JOptionPane.showMessageDialog(null, num + " is an Odd Number");
        
    }
    
}
