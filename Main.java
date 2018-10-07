import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag;
		int n=sc.nextInt();
		int L=sc.nextInt();
		int t=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<t;i++)
		{
			while(a[i]<0||a[i]>L)
			{
				while(a[i]<0)
					a[i]=-a[i];
				while(a[i]>L)
					a[i]=2*L-a[i];	
			}
		}
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
	}

}
