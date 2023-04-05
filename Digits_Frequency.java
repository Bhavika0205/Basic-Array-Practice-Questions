package arrays_basic;
import java.util.*;
public class FrequecyOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num = scn.nextInt();
		int freq = digitFreq(n,num);
		System.out.println(freq);

	}
	public static int digitFreq(int n, int num)
	{
		int count = 0;
		while(num>0) {
			int ans = num%10;
			if(ans==n)
			{
				count++;
			}
			num = num/10;
		}
		return count;
	}

}
