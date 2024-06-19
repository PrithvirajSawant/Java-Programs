package Arrays;
//Cegues InfoTech
public class Sum13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {13,3,13};
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=13)
			{
				sum+=arr[i];
			}
		}
		System.out.println(sum);

	}

}
