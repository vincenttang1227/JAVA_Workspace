package CH07_10;

interface ILimit
{
	int HIGH=110;
	int LOW=60;
	
	String Drive();
}

interface IDistance
{
	void Process(int min);
}

class CTruck implements ILimit
{
	private int speed;
	CTruck(int speed)
	{
		this.speed=speed;
	}
	
	public String Drive()
	{
		if (speed>HIGH)
			return"超速";
		else if (speed<LOW)
			return"龜速";
		else
			return"速度正常";
	}
}

class CCar implements ILimit, IDistance
{
	private int speed;
	
	CCar(int speed)
	{
		this.speed=speed;
	}
	
	public String Drive()
	{
		if (speed>HIGH)
			return "Speed:"+speed+"km/hr,請減速";
		else if (speed<LOW)
			return "Speed:"+speed+"km/hr,請加速";
		else
			return "Speed:"+speed+"km/hr,請保持";
	}
	
	public void Process(int min)
	{
		double leng=speed*min/60;
		System.out.println("已行駛"+min+"分，跑了"+leng+"公里");
	}
}

public class CH07_10
{
	public static void main(String[] args)
	{
		CTruck t1=new CTruck(50);
		System.out.println("t1大型車:");
		System.out.println(t1.Drive());
		
		System.out.println();
		
		CCar c1=new CCar(120);
		System.out.println("c1小型車:");
		System.out.println(c1.Drive());
		c1.Process(2);
	}
}
