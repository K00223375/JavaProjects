
public class WhileLoopEx1 
{
    public static void main(String[] args)
    {
        int num = 1000, count = 1;
        
        while(count <=1000)
        {
            System.out.println(count);
            count++;
        }
        
        count =1;
        while(count <=1000)
        {
            System.out.println(num);
            num--;
            count++;
        }
        
        count =1;
        while(count <=1000)
        {
           if(count%2 ==0)
           {
               System.out.println(count);
           }
            count++;
        }
        
        
        count=1;
        while(count <=1000)
        {
           if(count%4 ==0)
           {
               System.out.println(count);
           }
           else if(count%6==0)
           {
               System.out.println(count);
           }
            count++;
        }
    }
}
