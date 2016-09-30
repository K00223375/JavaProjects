import javax.swing.JOptionPane;

public class Reverse 
{
    public static void main(String[] args)
    {
        int revP1;
        int revP2;
        int revP3;
        int revP4;
        
        String input = JOptionPane.showInputDialog("Enter Number in the range 101-199:");
        int num1 = Integer.parseInt(input);
        
        revP1 = num1%10;
        revP2 = num1/10;
        revP3 = revP2%10;
        revP4 = revP2/10;
       
       JOptionPane.showMessageDialog(null, "The reverse of "+ 
                                           num1 + " is " + 
                                           revP1 + revP3 + revP4);
    }
    
}
