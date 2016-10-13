/**
 *
 * @author K00223375
 */
public class StringCompactor 
{
    public static void main(String[] args) 
    {
        String input ="aaaaabbbbccckuyt";
        
        char[] chArr = input.toCharArray();
        int count=1;
        String output = "";
        int i=0;
        while(i<chArr.length)
        {
            char a = chArr[i];
            //System.out.print(a);
            if((i+1)<chArr.length)
            {
                if(a==chArr[i+1])
                {
                    count++;
                }
                else if(i==chArr.length-1)
                {
                    output += chArr[chArr.length-1];
                }
                else
                {
                    if(count>1)
                    {
                        output += a+""+count;
                        count=1;
                    }
                    else
                    {
                        output += a;
                    }
                } 
            }
            else
            {
                output += chArr[chArr.length-1];
            }
            i++;
        }
        System.out.println(output);
    } 
}
