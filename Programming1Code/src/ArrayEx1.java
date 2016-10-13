import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class ArrayEx1 
{

    public static void main(String[] args) 
    {
        int[] arr1 = new int[10];
        for(int i=0; i<10;i++)
        {
            String input = JOptionPane.showInputDialog("Enter a number: ");
            arr1[i]= Integer.parseInt(input);
        }
        
        for(int i=arr1.length-1;i>=0;i--)
        {
            System.out.println(arr1[i]);
        }   
    }
}
