import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]rect=new int[101][101];
		for(int i=0;i<101;i++)
			for(int j=0;j<101;j++)
				rect[i][j]=1;
		int n=sc.nextInt();
		int count=0;
		for(int k=0;k<n;k++)
		{
			int a[]=new int[4];
			for(int m=0;m<4;m++)
				a[m]=sc.nextInt();
			for(int i=a[0];i<a[2];i++)
				for(int j=a[1];j<a[3];j++)
					if(rect[i][j]==1)
					{
						count++;
						rect[i][j]=0;
					}
			
		}
		sc.close();
		System.out.println(count);
	}

}
