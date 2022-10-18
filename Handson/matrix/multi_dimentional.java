/*
 Addition of two matrices.
 Name = Nivedita sasane
 Date = 17/10/22
 */
package addition_matrix;
import java.util.Scanner;
public class multi_dimentional {
	public static void main(String []args){
		
		int a, b, i, j;
		Scanner sc = new Scanner(System.in);
		
		//Taking input for first matrix row
		System.out.print("Enter first matrix row : ");
		a = sc.nextInt();
		
		//Taking input for first matrix column
		System.out.print("Enter first matrix column : ");
		b = sc.nextInt();
		
		int matrix1[][]=new int[a][b];
		
		System.out.println();
		//Taking input for first matrix from user
		System.out.println("Enter the number of first matrix : ");
		
		//using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of first matrix
		System.out.println("Element of first matrix is : ");
		
		//Using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			} System.out.println();
			
			//System.out.println();
		}
	
		int matrix2[][]=new int[a][b];
		//Taking input for second matrix from user
		
		System.out.println();
		System.out.println("Enter the number of Second matrix : ");
		
		//using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of second matrix
		System.out.println("Element of second matrix is : ");
		
		//using for loop
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				System.out.print(matrix2[i][j]+" ");
			} System.out.println();
			
			//System.out.println();
		}
		//System.out.println();
		
		
			int matrix3[][]=new int[a][b];
		
					//Addition of two numbers
							System.out.println();
							System.out.println("Addition of two matrix is : ");
			
							//Using for loop
								for(i=0;i<a;i++)	
									{
				
										for(j=0;j<b;j++)	
											{
												matrix3[i][j]=matrix1[i][j]+matrix2[i][j];  
												System.out.print(matrix3[i][j]+" "); 
											}
												System.out.println();
									}	
			
			//Subtraction method
			int array4[][]=new int[a][b];
			
					//SUbtraction of two numbers
							System.out.println();
							System.out.println("Subtraction of two matrix is : ");
			
							//Using for loop
								for(i=0;i<a;i++)	
									{
				
										for(j=0;j<b;j++)	
											{
												matrix3[i][j]=matrix1[i][j]-matrix2[i][j]; 
												System.out.print(matrix3[i][j]+" "); 
											}
												System.out.println();
									}	
			
			//Multiplication method
			int array5[][]=new int[a][b];
			
					//Multiplication of two numbers
							System.out.println();
							System.out.println("Multiplication of two matrix is : ");
			
							//Using for loop
								for(i=0;i<a;i++)	
									{
				
										for(j=0;j<b;j++)	
											{
												matrix3[i][j]=matrix1[i][j]*matrix2[i][j];  
												System.out.print(matrix3[i][j]+" "); 
											}
												System.out.println();
									}	
			
			//Division method
			int array6[][]=new int[a][b];
			
					//Division of two numbers
							System.out.println();
							System.out.println("Divional of two matrix is : ");
			
							//Using for loop
								for(i=0;i<a;i++)	
									{
				
										for(j=0;j<b;j++)	
											{
												matrix3[i][j]=matrix1[i][j]/matrix2[i][j];  
												System.out.print(matrix3[i][j]+" "); 
											}
												System.out.println();
									}	

			}
	}
	

