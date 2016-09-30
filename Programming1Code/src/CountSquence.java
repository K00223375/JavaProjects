import javax.swing.JOptionPane;

public class CountSquence 
{
    public static void main(String[] args)
    {
        boolean correctNum = false;
        String input = JOptionPane.showInputDialog("Input Number less than a Million: ");
        int inVal = Integer.parseInt(input);
        while(correctNum !=true)
        {
            if(inVal <= 1000000)
            {
                correctNum = true;
            }
            else
            {
                input = JOptionPane.showInputDialog("Input Number less than a Million: ");
                inVal = Integer.parseInt(input);
            }
        }
        int i=0, j=0;
        int longestChain=0, longestChainNum = 0;
        
        //System.out.println("Next code");
        while(i<1000000)
        {
            
            
            
            
            i++;
        }
    }
}
