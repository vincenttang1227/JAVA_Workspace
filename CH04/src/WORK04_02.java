import java.io.*;
import java.util.Arrays;

public class WORK04_02
{
	public static void main(String[] args)throws IOException
	{
	  int grade_array[]=new int[5];
	  
	  BufferedReader keyin;
	  keyin = new BufferedReader(new InputStreamReader(System.in));
	  
	  for (int i=0;i<5;i++)
	  {
	    System.out.print("Input the grade: ");
	    int grade = Integer.parseInt(keyin.readLine());
	    if (grade<0 || grade>100)
	    {
	      System.out.println("Wrong grade, Input again: ");
	      grade = Integer.parseInt(keyin.readLine());
	    }
	    grade_array[i] = grade;
	  }
	  for (int i=0;i<5;i++)
		    System.out.print(grade_array[i]+"\t");
	  
	}
}
