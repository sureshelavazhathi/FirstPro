import java.io.*;
import java.util.*;
public class Amst
{
	public static void main(String[] args)
	{
		int a,b,c[],i=0,j,m=0,k=0;
		c=new int[100];
		Scanner q=new Scanner(System.in);
		System.out.println("\n\nENTER ANY NO.:\t");
		a=q.nextInt();
		b=a;
		while(b!=0)
		{
			c[i]=b%10;
			b=b/10;
			i++;
		}
		for(j=0;j<i;j++)
		{
			m=c[j]*c[j]*c[j];
			k=k+m;
		}
		if(k==a)
		System.out.println("\n\nGIVEN NO. IS AMSTRONG");
		else
		System.out.println("\n\nGIVEN NO. IS NOT A AMSTRONG NO.");
	}
}