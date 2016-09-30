import javax.swing.JOptionPane;

public class CountNumbers 
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        
        /*String input = JOptionPane.showInputDialog("Enter Number 1");
        num1 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter Number 2");
        num2 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter Number 3");
        num3 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter Number 4");
        num4 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter Number 5");
        num5 = Integer.parseInt(input);*/
        
        int pos =0;
        int neg = 0;
        int zero = 0;
        
        for(int i=1; i<6; i++)
        {
            String input = JOptionPane.showInputDialog("Enter Number " + i);
            num1 = Integer.parseInt(input);
            
            if(num1 == 0)
            {
                zero++;
            }
            else if(num1 > 0)
            {
                pos++;
            }
            else
            {
                neg++;
            }
        }
        JOptionPane.showMessageDialog(null, "Number of Positive Numbers: " + pos+"\n" 
                                            + "Number of Negitive Numbers: "+ neg+"\n"
                                            +  "Number of Zero Numbers: "+zero );
    }
}
