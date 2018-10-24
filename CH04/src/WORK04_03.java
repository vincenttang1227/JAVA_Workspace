import java.io.*;
import java.util.Arrays;

public class WORK04_03
{
	public static void main(String[] args)throws IOException
	{
	  int array1[]={75,24,98,76,55,13};
	  
	  BufferedReader keyin;
	  keyin = new BufferedReader(new InputStreamReader(System.in));
	  
	  System.out.println("How many value you wanna add? ");
	  int new_array = Integer.parseInt(keyin.readLine());
	  int array2[]=new int[array1.length+new_array];
	  
	  for (int i=0;i<array1.length;i++)
		array2[i]=array1[i];
	  
	  for(int i=array1.length+1;i<new_array;i++)
	  {
		System.out.print("Input the new value: ");
	    int new_value = Integer.parseInt(keyin.readLine());
		array2[i]=new_value;
	  }
	  
	  Arrays.sort(array2);
	  
	  for(int i=0;i<array2.length;i++)
		System.out.print(array2[i]+" ");
	}
}