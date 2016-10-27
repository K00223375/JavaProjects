import javax.swing.JOptionPane;

/**
 *
 * @author K00223375
 */
public class MethodsEx6 {

    public static void main(String[] args) 
    {
        String input = JOptionPane.showInputDialog("Enter in Gross Pay: ");
        double gPay = Double.parseDouble(input);
        double totalTax;
        if(gPay<=7500)
        {
            System.out.println("There is no tax due on earnings of " + gPay);
        }
        else if(gPay<=20000)
        {
            totalTax = taxAt23(gPay);
            System.out.println(totalTax + " tax is due on earnings of " + gPay);
        }
        else
        {
            totalTax = taxAt43(gPay);
            System.out.println(totalTax + " tax is due on earnings of " + gPay);
        }
    }
    
    public static double taxAt23(double grossPay)
    {
        double tax=12500;
        grossPay -=7500;
        if(grossPay<=12500)
        {
            grossPay *=0.23;
            tax=grossPay;
        }
        else
        {
            tax*=0.23;
        }
        return tax;
    }
    
    public static double taxAt43(double grossPay)
    {
        double tax = taxAt23(grossPay);
        grossPay -=20000;
        grossPay *=0.45;
        tax += grossPay;
        return tax;
    }
    
    
    
}
