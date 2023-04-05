package arrays_basic;
import java.util.*;
import java.util.Scanner;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int base = scn.nextInt();
		int num = scn.nextInt();
		int ans  = convert(num,base);
		System.out.println(ans);
	}
	public static int convert(int num, int base)
	{
		int ans = 0;
		int count = 1;
		while(num>0)
		{
      //finding the remainder
			int rem = num % base;
      //actually dividing it or preparing it for the next itertion
			num = num/base;
      //adding the place value of remainder to the ans;
			ans += rem*count;
      //finding the place value
			count = count*10;
			
		}
		return ans;
	}
}
