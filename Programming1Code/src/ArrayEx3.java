import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class ArrayEx3 
{

    public static void main(String[] args) 
    {
        double[] arr1 = new double[5];
        double[] arr2 = new double[5];
        double[] temp = new double[5];
        
        for(int i=0; i<arr1.length;i++)
        {
            String input = JOptionPane.showInputDialog("Enter a number for Array1: ");
            arr1[i]= Double.parseDouble(input);
        }
        
        for(int i=0; i<arr2.length;i++)
        {
            String input = JOptionPane.showInputDialog("Enter a number for Array2: ");
            arr2[i]= Double.parseDouble(input);
        }
        
        for(int i=0; i<arr1.length;i++)
        {
            temp[i]=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp[i];
        }
        
        String outArr1="";
        String outArr2="";
        for(int i=0; i<arr1.length;i++)
        {
            outArr1 += arr1[i]+" ";
            outArr2 += arr2[i]+" "; 
        }
        
        JOptionPane.showMessageDialog(null, "New Array1: "+outArr1+"\n"
                                            +"New Array2: "+outArr2);
        
    }
    
}
