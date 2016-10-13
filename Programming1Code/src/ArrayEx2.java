import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class ArrayEx2 {

    public static void main(String[] args) 
    {
        double[] arr1 = new double[10];
        for(int i=0; i<arr1.length;i++)
        {
            String input = JOptionPane.showInputDialog("Enter a number: ");
            arr1[i]= Double.parseDouble(input);
        }
        
        double avg =0;
        for(int i=0;i<arr1.length;i++)
        {
            avg += arr1[i];
        }  
        avg /= arr1.length;
        
        JOptionPane.showMessageDialog(null, "Average value of the Array is "+avg);
    }
}
