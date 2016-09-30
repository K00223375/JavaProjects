import javax.swing.JOptionPane;

class AddNumbers
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int answer;
        
        num1 = 7;
        num2 = 4;
        
        answer = num1+ num2;
        
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + answer);
    }
    
}