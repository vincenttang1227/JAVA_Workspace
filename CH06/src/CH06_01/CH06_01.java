package CH06_01;

class Triangle
{
	int base;
	int height;
	double ans;
	
	void Area()
	{
		ans = (base * height)/2;
		System.out.println("在Area中，底="+base+"，高="+height+"，三角形面積="+ans+'\n');
	}
	
	double Area_2(int i)
	{
		System.out.print("在Area_2中，底="+ i +"，高="+height+"，");
		return ans =(i*height)/2;
	}
	
	double Area_3(int i,int j)
	{
		System.out.print("在Area_3中，底="+ i +"，高="+j+"，");
		return ans =(i*j)/2;
	}
}

public class CH06_01
{

	public static void main(String[] args)
	{
		Triangle triangle = new Triangle();
		
		triangle.base=2;
		triangle.height=8;
		
		System.out.println("在main中，底="+triangle.base+"，高="+triangle.height+'\n');
		
		System.out.println("不具回傳值的方法，沒有引數：");
		triangle.Area();
		
		System.out.println("從main中，傳入單一引數base，且具有回傳值：");
		System.out.println("從三角形面積="+triangle.Area_2(4)+'\n');
		
		System.out.println("從main中，傳入2個引數base及height，且具有回傳值：");
		System.out.println("從三角形面積="+triangle.Area_3(4,10));

	}

}
