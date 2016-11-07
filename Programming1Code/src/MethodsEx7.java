import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class MethodsEx7 {

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter in hours parked (E.g. 3hrs 30mins = 3.5): ");
        double hoursParked = Double.parseDouble(input);
        double amountDue;
        if(hoursParked<=3)
        {
            System.out.println("Amount Due: €2.00");
        }
        else if(hoursParked<20)
        {
            amountDue=calcParking(hoursParked);
            System.out.println("Amount Due: €" + amountDue);
        }
        else
        {
            System.out.println("Amount Due: €10.00");
        }
    }
    
    
    public static double calcParking(double x)
    {
        double totalPay=2.00;
        x=Math.ceil(x);
        
        for(int i=3;i<x;i++)
        {
            totalPay +=0.50;
        }
        return totalPay;
    }
    
}
