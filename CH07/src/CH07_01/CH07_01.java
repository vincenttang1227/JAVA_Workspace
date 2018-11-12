package CH07_01;

class CPenScore
{
	protected String name;
	protected int pen_score;

	public void SetPenData(String name, int score)
	{
		this.name = name;
		pen_score = score;
	}
	public void ShowPenScore()
	{
		System.out.println("\n筆試成績：");
		System.out.println("姓名：" + name);
		System.out.println("筆試分數：" + pen_score);
	}
}

class CTotalScore extends CPenScore
{
	private int oral_score;
	private int tot_score;

	public void SetOralData(int score)
	{
		oral_score = score;
	}

	public void ShowTotScore()
	{
		System.out.println("\n筆試成績：");
		System.out.println("姓名：" + name);
		System.out.println("筆試分數：" + pen_score);
		System.out.println("口試分數：" + oral_score);
		System.out.println("================");
		tot_score = pen_score + oral_score;
		System.out.println("總分：" + tot_score);
	}
}

public class CH07_01
{

	public static void main(String[] args)
	{
		CPenScore p1 = new CPenScore();
		p1.SetPenData("張三", 50);
		p1.ShowPenScore();

		CTotalScore p2 = new CTotalScore();
		p2.SetPenData("李四", 60);
		p2.SetOralData(20);
		p2.ShowTotScore();
	}

}
