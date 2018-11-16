package CH07_07;
import java.io.*;

class CPlayer
{
	public void Show()
	{

	}
}

class CCD extends CPlayer
{
	public void Show()
	{
		System.out.println("CD Playing...");
	}
}

class CDVD extends CPlayer
{
	public void Show()
	{
		System.out.println("DVD Playing...");
	}
}

public class CH07_07
{

	public static void main(String[] args) throws IOException
	{
		CPlayer play = new CPlayer();
		CCD cd = new CCD();
		CDVD dvd = new CDVD();

		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));

		while (true)
		{
			System.out.println("Input CD or DVD...");
			String item = keyin.readLine();
			if (item.equals("CD") || item.equals("cd"))
				play = cd;
			else if (item.equals("DVD") || item.equals("dvd"))
				play = dvd;
			else
				continue;
			play.Show();
			break;
		}
	}
}
