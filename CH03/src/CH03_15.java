
public class CH03_15
{
	public static void main(String[ ] args)
	{
		int ans;
		ans=sum(10);
		System.out.println("1~10ªº¥[Á`");
		System.out.println("ans="+ans);
	}
	
	static int sum(int n)
	{
		int sum=0;
		for(int i=1 ; i<=n ; i++)
			sum += i;
		return sum;
	}
}