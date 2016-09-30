import javax.swing.JOptionPane;

public class AreaAndPerimeter 
{
    public static void main(String[] args)
    {
       int area;
       int perimeter;
       
       String input = JOptionPane.showInputDialog("Enter Length:");
       int len = Integer.parseInt(input); 
       
       input = JOptionPane.showInputDialog("Enter Width:");
       int wid = Integer.parseInt(input);
       
       
       area = len * wid;
       perimeter = 2*(len+wid);
       
       JOptionPane.showMessageDialog(null, "The Area is " + area );
       JOptionPane.showMessageDialog(null, "The Perimeter is " + perimeter);
       
        
    }
}
