package CH07_09;

abstract class CEmployee
{
	protected String name;
	protected int base = 25000;
	protected int sale_n;
	protected int prize = 4000;

	CEmployee(String name)
	{
		this.name = name;
	}
	public abstract int Salary();
}

class CManager extends CEmployee
{
	private int bonus;
	CManager(String name, int sale_n, int bonus)
	{
		super(name);
		this.sale_n = sale_n;
		this.bonus = bonus;
	}

	public int Salary()
	{
		return base + prize * sale_n + bonus;
	}

	public String GetName()
	{
		return name;
	}
}

class CSales extends CEmployee
{
	CSales(String name, int sale_n)
	{
		super(name);
		this.sale_n = sale_n;
	}

	public int Salary()
	{
		return base + prize * sale_n;
	}

	public String GetName()
	{
		return name;
	}
}

public class CH07_09
{

	public static void main(String[] args)
	{
		CManager m1 = new CManager("Mount Lin", 2, 20000);
		CManager m2 = new CManager("Mary Wu", 4, 15000);
		CSales s1 = new CSales("Three Chang", 3);
		CSales s2 = new CSales("Four Lee", 3);

		System.out.println("姓名\t薪水");
		System.out.println("========================");
		System.out.println(m1.GetName() + "\t" + m1.Salary() + "元");
		System.out.println(m2.GetName() + "\t" + m2.Salary() + "元");
		System.out.println(s1.GetName() + "\t" + s1.Salary() + "元");
		System.out.println(s2.GetName() + "\t" + s2.Salary() + "元");
	}

}
