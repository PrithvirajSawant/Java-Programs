package Arrays;
//Cegues InfoTech
public class RemoveDuplicateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,1,3};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j] = 0;
					count++;
				}
			}
			if(count!=0)
			{
				arr[i] = 0;
			}
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
