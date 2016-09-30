
public class WhileLoopEx2 
{
    public static void main(String[] args)
    {
        int c=-20;
        double k=0, f=0;
        
        System.out.println("Celsius\t Kelvin\t  Fahrenheit");
        while(c<=50)
        {
            System.out.print(c + "\t");
            k= c+273.15;
            System.out.printf("%.2f",k);
            System.out.print("  ");
            f=(9.0/5.0) * c+32;
            System.out.printf("\t"+"%.2f",f);
            System.out.println();
            c++;
        }
        
    }
}
