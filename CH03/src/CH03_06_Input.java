import java.io.*;

public class CH03_06_Input
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader keyin;
		keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入等第：");
		String math_score = keyin.readLine();
		System.out.println("Michael數學成績："+math_score);
		switch (math_score)
		{
			case "A":
				System.out.println("師長評語：非常好！真是優秀"+"\n");
				break;
			case "B":
				System.out.println("師長評語：也不錯，但還可以更好"+"\n");
				break;
			case "C":
				System.out.println("師長評語：真的要多用功"+"\n");
				break;
			default:
				System.out.println("師長評語：不要貪玩，為自己多讀書"+"\n");
		}
	}
}