import javax.swing.JOptionPane;

public class PerfectNumber 
{
    public static void main(String[] args)
    {
       long i=1, maxVal, inVal, perfNum=0;
       
       String input = JOptionPane.showInputDialog("Enter a number: ");
       inVal=Long.parseLong(input);
       
       maxVal=inVal/2;
       while(i<=maxVal)
       {
           if(inVal%i==0)
           {
               perfNum +=i;
               System.out.println(perfNum);
           }
           i++;
       }
       
       if(perfNum == inVal)
       {
           JOptionPane.showMessageDialog(null, "It's a Perfect Number!");
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Not a Perfect Number!");
       }
    
    }
}
