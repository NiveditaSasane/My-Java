/*
 Addition of two matrices.
 Name = Nivedita sasane
 Date = 17/10/22
 */
package addition_matrix;
import java.util.Scanner;
public class multi_dimentional {
	public static void main(String []args){
		
        int a;
        int b;
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        a= sc.nextInt();

        System.out.println("Enter number columns");
        b= sc.nextInt();

        int x[][] = new int[a][b];
        int y[][] = new int[a][b];
        int add[][] = new int[a][b];

        System.out.println("Enter the elements of array1");

        for (i=0;i<a;i++)
        { 
        for (j=0;j<b;j++)
        x[i][j] = sc.nextInt();
        }
        System.out.println("Enter the elements of array2");

        for (i=0;i<a;i++)
        {
        for (j=0;j<b;j++)
        y[i][j] = sc.nextInt();
        }

         for (i=0;i<a;i++)
         for (j=0;j<b;j++)
         add[i][j] = x[i][j] + y[i][j] ; 

         System.out.println("Sum of matrix:");

           for (i=0;i<a;i++)
          { 
           for (j=0;j<b;j++)
           System.out.print(add[i][j]+" ");

           System.out.println();
}

}
}
	

