package CH07_12;

class CTruck
{
	int HIGH = 100;
	int LOW = 60;
	private int speed;

	CTruck(int speed)
	{
		this.speed = speed;
	}

	public String Drive()
	{
		if (speed > HIGH)
			return "超速";
		else if (speed < LOW)
			return "龜速";
		else
			return "速度正常";
	}

	public void Process(int min)
	{
		System.out.println("已行駛" + (double) (speed * min / 60) + "公里");
	}
}

	class CCar
	{
		int HIGH = 120;
		int LOW = 60;
		private int speed;

		CCar(int speed)
		{
			this.speed = speed;
		}

		public String Drive()
		{
			if (speed > HIGH)
				return "Speed:" + speed + "km/hr,請減速";
			else if (speed < LOW)
				return "Speed:" + speed + "km/hr,請加速";
			else
				return "Speed:" + speed + "km/hr,請保持";
		}

		public void Process(int min)
		{
			double leng = speed * min / 60;
			System.out.println("已行駛" + min + "分，跑了" + leng + "公里");
		}
		
		public void Keep()
		{
			System.out.println("請與前車保持"+(int)(speed/2)+"公尺以上距離");			
		}

	}

public class CH07_12
{
	public static void main(String[] args)
	{
		CTruck t1=new CTruck(50);
		System.out.println("t1大型車:");
		System.out.println(t1.Drive());
		t1.Process(15);
		
		System.out.println();
		
		CCar c1=new CCar(120);
		System.out.println("c1小型車:");
		System.out.println(c1.Drive());
		c1.Process(10);
		c1.Keep();
	}
}
