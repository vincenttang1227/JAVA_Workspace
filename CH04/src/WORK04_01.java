import java.util.Arrays;

public class WORK04_01
{
	public static void main(String[] args)
	{
		int num_array[] = new int[6];
		System.out.println("¼Ö³z¸¹½X¬°¡G");
		for (int i=0;i<num_array.length;i++)
			num_array[i] = (int)(Math.random()*42+1);
		
		for (int i=0;i<num_array.length;i++)
			System.out.print(num_array[i]+"\t");
	}
}
