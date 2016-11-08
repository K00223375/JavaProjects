/**
 *
 * @author K00223375
 */
public class StringExercises {

   
    public static void main(String[] args) 
    {
        String s1 = "Everybody likes a compliment";
        String s2 = "I Am Rather Inclined To Silence";
        String s3 = "You have to do your own growing no matter how tall your grandfather was";
        String s4 = "A stitch in time saves nine";
        String s5 = "Happy days are here again";
        
        //Q1
        if(s1.equals(s2))
        {
            System.out.println("Q1 True");
        }
        else
        {
            System.out.println("Q2 False");
        }
        
        //Q2
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        
        //Q3
        if(s3.startsWith("You")&& s3.endsWith("was"))
        {
            System.out.println("Q3 True");
        }
        else
        {
            System.out.println("Q3 False");
        }
        
        //Q4
        
        int q4Count=0;
        for(int i=0; i<s3.length();i++)
        {
            if(s3.charAt(i)=='a')
            {
                q4Count++;
            }
        }
        System.out.println("Number of A's: " + q4Count);
        
        //Q5
        char[] vowels= {'a','e','i','o','u','A','E','I','O','U'};
        int vowelCount=0;
        for(int i=0; i<vowels.length;i++)
        {
            for(int j=0; j<s3.length();j++)
            {
                if(s3.charAt(j)==vowels[i])
                {
                    vowelCount++;
                }
            }
        }
        System.out.println("Number of Vowels: "+ vowelCount);
        
        //Q6
        s4=s4.replace('t', '!');
        s4=s4.replace('s', '#');
        System.out.println(s4);  
        
        
        //Q7
        for(int i=0;i<s5.length();i++)
        {
            if(s5.charAt(i)=='a')
            {
                System.out.println("Index of A in S5: "+i);
            }
        }
        
        //Q8
        for(int i=0;i<s5.length();i++)
        {
            System.out.println(s5.charAt(i));   
        }
        
        
        //Q9
        String extract="";
        for(int i=0; i<s5.length(); i++)
        {
            if(s5.charAt(i)=='d' && s5.charAt(i+3)=='s')
            {
                extract=s5.substring(i, i+4);
            }
        }
        System.out.println(extract);
        
        
        //Q10
        System.out.println("Last index of A: "+s5.lastIndexOf('a'));
    }
    
}
