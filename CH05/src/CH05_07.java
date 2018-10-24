import java.io.*;
import java.util.*;

public class CH05_07
{
	public static void main(String[] args)throws IOException
	{
		long t1,t2,tot_t;
		Date date_time1 = new Date();
		Calendar date_time2 = Calendar.getInstance();
		t1 = System.currentTimeMillis();
		System.out.println("\nStart : "+t1+"millisecound\n");
		System.out.println(date_time1);
		System.out.println(date_time2);
		System.out.println(date_time2.get(Calendar.YEAR)+"年");
		System.out.println(date_time2.get(Calendar.MONTH)+1+"月");
		System.out.println(date_time2.get(Calendar.DAY_OF_MONTH)+"日");
		System.out.println(date_time2.get(Calendar.HOUR_OF_DAY)+"時");
		System.out.println(date_time2.get(Calendar.MINUTE)+"分");
		System.out.println(date_time2.get(Calendar.SECOND)+"秒");
		System.out.println(date_time2.get(Calendar.MILLISECOND)+"毫秒");
		
		System.out.println("\nPush<<Enter>>to end the test time");
		int p = System.in.read();
		t2 = System.currentTimeMillis();
		System.out.println("\nEnd: "+t2+"millsecond");
		tot_t=t2-t1;
		System.out.println("\nAll: "+(double)tot_t/1000+"second");
	}
	
}
