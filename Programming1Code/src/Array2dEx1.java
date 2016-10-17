/**
 *
 * @author K00223375
 */
public class Array2dEx1 {

    public static void main(String[] args) 
    {
        int row = 3;
        int col = 4;
        
        int [][] matrix = new int [row][col];
        
        for(int i=0; i<row;i++)
        {
            for(int j=0; j<col; j++)
            {
                matrix[i][j] = (int) (Math.random()*110+1);
            }
        }    
        
        int largest;
        int smallest; 
        
        System.out.println("Smallest Numbers:");
        for(int i=0; i<row;i++)
        {
            smallest=matrix[i][0];
            for(int j=0; j<col; j++)
            {
                if(matrix[i][j]<smallest)
                {
                    smallest = matrix[i][j];
                }
            }
            System.out.println("The Smallest number in row "+ i+ " is "+ smallest);
        }

        System.out.println("Largest Numbers:");
        for(int i=0; i<row;i++)
        {
            largest = matrix[i][0];
            for(int j=0; j<col; j++)
            {
                if(matrix[i][j]>largest)
                {
                    largest = matrix[i][j];
                }
            }
            System.out.println("The Largest number in row "+ i+ " is "+ largest);
        }    
    }
}
