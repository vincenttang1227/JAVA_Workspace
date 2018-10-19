import java.io.*;

public class CH04_12
{
	public static void main(String[] args) throws IOException
	{
		int[] account = { 18, 14, 12, 16, 10 };
		String[] name = { "王五", "張三", "陳二", "李四", "鄭一" };
		
		int i,j,account_t;
		String name_t;
		
		System.out.println("List before sort:\n");
		System.out.println("Number\tName");
		for(i=0;i<account.length;i++)
			System.out.println(" "+account[i]+"\t\t"+name[i]);
		
		for(i=3;i>=0;i--)
			for(j=0;j<=i;j++)
				if(account[j]>account[j+1])
				{
					account_t=account[j+1];
					account[j+1]=account[j];
					account[j]=account_t;
					name_t=name[j+1];
					name[j+1]=name[j];
					name[j]=name_t;
				}


		System.out.print("\nBubble sort，Input the employee number：");
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		int search_account = Integer.parseInt(keyin.readLine());
		
		int low=0,high=account.length-1,mid_num=(low+high)/2,num=-1;
		
		while (true)
		{
			System.out.println("low="+low+" high="+" mid_num"+mid_num);
			if(account[mid_num]==search_account)
			{
				num=mid_num;
				break;
			}
			if(low==high ||mid_num<low||mid_num>high)
			{
				num=-1;
				break;
			}
			if(account[mid_num]>search_account)
				high=mid_num-1;
			else
				low=mid_num+1;
			
			mid_num=(low+high)/2;
		}


		if (num == -1)
			System.out.println("\n 查無此編號");
		else
		{
			System.out.println("\n員工編號\t姓名");
			System.out.println(" "+account[num] + "\t\t" + name[num]);
		}
	}
}