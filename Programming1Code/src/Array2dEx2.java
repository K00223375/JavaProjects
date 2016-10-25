/**
 * @author K00223375
 */
public class Array2dEx2 {

    public static void main(String[] args) 
    {
        int row=20;
        int col=10;
        int[][] arr1= new int[row][col];
        int [] numChecker=new int[10];
        boolean inArr = false;
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<col;j++)
            {
                int randNum=(int)(Math.random()*31);
                arr1[i][j]=randNum;
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
