
public class CH03_06
{
	public static void main(String[] args)
	{
		char math_score='A';
		System.out.println("Michael數學成績："+math_score);
		switch (math_score)
		{
			case 'A':
				System.out.println("師長評語：非常好！真是優秀"+"\n");
				break;
			case 'B':
				System.out.println("師長評語：也不錯，但還可以更好"+"\n");
				break;
			case 'C':
				System.out.println("師長評語：真的要多用功"+"\n");
				break;
			default:
				System.out.println("師長評語：不要貪玩，為自己多讀書"+"\n");
		}
		
		math_score='C';
		System.out.println("Jane數學成績："+math_score);
		switch (math_score)
		{
			case 'A':
				System.out.println("師長評語：非常好！真是優秀"+"\n");
				break;
			case 'B':
				System.out.println("師長評語：也不錯，但還可以更好"+"\n");
				break;
			case 'C':
				System.out.println("師長評語：真的要多用功"+"\n");
				break;
			default:
				System.out.println("師長評語：不要貪玩，為自己多讀書"+"\n");
		}
	}
}