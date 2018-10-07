import java.util.Scanner;
public class CCF_Ïà·´Êý {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	int N=sc.nextInt();
	int []a=new int [N];
	for(int i=0;i<N;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<N;i++)
		for(int j=i+1;j<N;j++)
		{
			if(a[i]+a[j]==0)
				count++;
		}
	System.out.println(count);
	
	
	}	
}
