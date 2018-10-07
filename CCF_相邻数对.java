import java.util.Scanner;
public class CCF_ÏàÁÚÊı¶Ô {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]-a[j]==1||a[i]-a[j]==-1)
					count++;
		System.out.println(count);
	}
}
