import javax.swing.JOptionPane;
/**
 *
 * @author K00223375
 */
public class MethodsEx4 {

    public static void main(String[] args) {
        
        int[] studentMarks = new int[10];
        
        for(int i=0; i<studentMarks.length;i++)
        {
            String input = JOptionPane.showInputDialog("Enter in Mark for student: ");
            studentMarks[i]= Integer.parseInt(input);
        }
       
        grade(studentMarks);
    }
    
    public static void grade(int[] x)
    {
        for(int i=0; i<x.length;i++)
        {
            if(x[i]<40&&x[i]>0)
            {
                System.out.println("Fail");
            }
            else if(x[i]<50&&x[i]>=40)
            {
                System.out.println("Pass");
            }
            else if(x[i]<60&&x[i]>=50)
            {
                System.out.println("Merit");
            }
            else if(x[i]>=60&&x[i]<=100)
            {
                System.out.println("Distinction");
            }
            else
            {
                System.out.println("Mark is outside of allowed range");
            }
        }
    }
}
