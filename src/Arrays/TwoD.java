package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//2D-Arrays
//indexing of 2d array starts from 0.
public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the num of columns:");
		int cols = sc.nextInt();
		int [][] num = new int[rows][cols];
		
		//Enter the array 
		System.out.println("Intput:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		//To print an array
//		System.out.println("Output:");
//		for(int i=0;i<rows;i++)
//		{
//			for(int j=0;j<cols;j++)
//			{
//				System.out.print(num[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		//or - To print an array
//		System.out.println("Output:");
//		for(int i=0;i<num.length;i++)
//		{
//			System.out.println(Arrays.toString(num[i]));
//		}
		
		//or - for each loop / enhanced for loop
		System.out.println("Output:");
		for(int[] a: num)
		{
			System.out.println(Arrays.toString(a));
		}
		
		//To find index of x:
//		System.out.println("Enter x:");
//		int x = sc.nextInt();
//		
//		System.out.println("Output:");
//		for(int i=0;i<rows;i++)
//		{
//			for(int j=0;j<cols;j++)
//			{
//				if(num[i][j]==x)
//				{
//					System.out.println("Element present at index "+"("+i+","+j+")");
//				}
//			}
//		}

	}

}
