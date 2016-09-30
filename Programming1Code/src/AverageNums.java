import javax.swing.JOptionPane;

public class AverageNums 
{
    public static void main(String[] args)
    {
        double average;
        int sum=0;
        
        String input = JOptionPane.showInputDialog("Enter Your First Number:");
        int num1 = Integer.parseInt(input);
        
         input = JOptionPane.showInputDialog("Enter Your Second Number:");
       int num2 = Integer.parseInt(input);
        
         input = JOptionPane.showInputDialog("Enter Your Third Number:");
       int num3 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter Your Fourth Number:");
       int num4 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter Your Fifth Number:");
       int num5 = Integer.parseInt(input);
        
        sum = num1 + num2 +num3 +num4 +num5;
        average = (double)sum/5;
        
        JOptionPane.showMessageDialog(null, "The avaerage of " + num1 + " " + num2 + " " + num3 + " " + num4 + " "+ num5 + " is " + average );
        
        
        /*for(int i=1; i<6; i++)
        {
            String input6 = JOptionPane.showInputDialog("Enter Your " + i + " Number:");
            num1 = Integer.parseInt(input6);
            sum += num1;
        }
        
        answer = sum/5;
        JOptionPane.showMessageDialog(null, answer);*/
    }
}
