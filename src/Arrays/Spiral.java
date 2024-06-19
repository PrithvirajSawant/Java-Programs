package Arrays;
//Spiral array
public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int r1 = 0 , r2 = n-1;
		int c1 = 0 , c2 = n-1;
		
		int [][] arr = new int[n][n];
		int val = 1;
//		int count = 0;
		
		while(r1<=r2 && c1<=c2)
		{
//			count++;
			//moving left to right
			for(int c=c1;c<=c2;c++)arr[r1][c] = val++;
			
			//moving down
			for(int r=r1+1;r<=r2;r++)arr[r][c2]=val++;
			
			if(r1<r2 && c1<c2) //Optimization
			{
//				count++;
				//moving from right to left
				for(int c=c2-1;c>c1;c--)arr[r2][c]=val++;
				
				//moving top
				for(int r=r2;r>r1;r--)arr[r][c1]=val++;
			}
			r1++;
			r2--;
			c1++;
			c2--;

		}
		//Print 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		System.out.println("count "+count);

	}

}
