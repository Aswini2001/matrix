package myjava;

import java.util.Scanner;

public class MultiArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner ss = new Scanner(System.in);
   //getting input from user//
   
   System.out.println("enter the no.of.rows");
   int r = ss.nextInt();
   System.out.println("enter the no.of.column");
   int c = ss.nextInt();
   int arr1[][] = new int [r][c];
   for (int i=0;i<r;i++)
   {
	   for (int j=0;j<c;j++)
	   {
		   System.out.println("arr1 element["+i+"]["+j+"]  =  ");
		   arr1[i][j]=ss.nextInt();
	   }
   }
   int arr2[][] = new int [r][c];
   for (int i=0;i<r;i++)
   {
	   for (int j=0;j<c;j++)
	   {
		   System.out.println("arr2 element["+i+"]["+j+"]  =  ");
		   arr2[i][j]=ss.nextInt();
	   }
   }
   // printing the addition of matrix
   int sum;
   
   System.out.println("matrix addition: "); 
   for (int i=0;i<r;i++)
   {
	   for (int j=0;j<c;j++)
	   {
		  sum =arr1[i][j]+ arr2[i][j]; 
		//   System.out.print(arr2[i][j]+"  ");
		  System.out.print(sum+"    ");  
	   }
	   System.out.println(); 
   }
   System.out.println(); 
   //  printing the multiplication of matrix//
   
   int[][] multi= new int[r][c];
   System.out.println("matrix multiplication: "); 
   for (int i=0;i<r;i++)
   {
	   for (int j=0;j<c;j++)
		   
	   {
		   multi[i][j]=0;
		   for(int n=0;n<r;n++) {
		   multi[i][j] += (arr1[i][n]* arr2[n][j]);
		  
		   
		   
		   }
		   System.out.print(multi[i][j]+" ");
	   }
	   System.out.println(); 
   }
		
	}

}
