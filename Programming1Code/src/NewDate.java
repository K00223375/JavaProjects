import javax.swing.JOptionPane;

public class NewDate 
{
    public static void main(String[] args)
    {        
        int day, month, year;
        int nDays=0;
        String input0 = JOptionPane.showInputDialog("Enter Day by number!");
        day = Integer.parseInt(input0);
        
        String input1 = JOptionPane.showInputDialog("Enter Month by number!");
        month = Integer.parseInt(input1);
        
        String input2 = JOptionPane.showInputDialog("Enter Year by number!");
        year = Integer.parseInt(input2);
        
        if( month == 4 || month == 6 || month == 9 || month == 11)
        {
            nDays=30;
        }
        else if(month==2)
        {
            if(year % 4 == 0 && (year % 100 !=0 || year % 100 == 0))
            {
               nDays=29; 
            }
            else
            {
               nDays=28;
            }
        }
        else
        {
            nDays=31;
        }
        
        if(day < nDays)
        {
            day++;
        }
        else if(day==nDays)
        {
            day = 1;
            
            if(month<12)
            {
               month++; 
            }
            else if(month==12)
            {
                month = 1;
                year++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "The successor date for " 
                                            + input0 + "/" + input1 + "/" + input2 +
                                            " is " + day + "/" + month + "/" + year);
        
    }
    
}
