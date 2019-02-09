import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Lab7_1 
{
	public int getSorted(int a[])
	{
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		int rev = 0;
		Arrays.sort(a);
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			n=a[i];
			while(n>0)
			{
				int digit = n%10;
				rev = rev * 10 + digit;
				n=n/10;
			}
			newArray.add(rev);
			rev=0;
			n=0;
		}
		System.out.println(newArray);
		return 0;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Lab7_1 l = new Lab7_1();
		System.out.println("Enter the number of elements:");
		int num = sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		l.getSorted(a);

	}

}