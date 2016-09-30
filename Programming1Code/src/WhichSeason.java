import javax.swing.JOptionPane;

public class WhichSeason 
{
    public static void main(String[] args)
    {
        int num;
        
        String input = JOptionPane.showInputDialog("Enter Month by number!");
        num = Integer.parseInt(input);
        
        if(num <= 4 && num >1)
        {
            JOptionPane.showMessageDialog(null, "Spring");
        }
        else if(num>4 && num<=7)
        {
            JOptionPane.showMessageDialog(null, "Summer");
        }
        else if(num>7&& num<=10)
        {
            JOptionPane.showMessageDialog(null, "Autumn");
        }
        else if(num == 11 || num == 12 || num == 1)
        {
            JOptionPane.showMessageDialog(null, "Winter");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Invaild Month");
        }
    }
}
