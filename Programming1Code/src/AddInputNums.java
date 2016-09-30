import javax.swing.JOptionPane;

class AddInputNums
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int answer;
        
        String input1 = JOptionPane.showInputDialog("Enter Your First Number:");
        num1 = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Enter Your Second Number:");
        num2 = Integer.parseInt(input2);
        
        answer = num1 + num2;
        
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + answer);
        
    }
    
}