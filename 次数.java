
	import java.util.Scanner;
	public class ´ÎÊý {   public static void main(String[] args) {       Scanner sc = new Scanner(System.in);       int n = sc.nextInt();       int a[] = new int[n];       int b[] = new int[n];       for(int i = 0;i<n;i++){        
	   b[i] = 0;           a[i] = sc.nextInt();       }       sc.close();       for(int i = 0;i<n;i++)        
	for(int j = 0;j<n;j++)        
	{        
	if(a[j]==a[i])        
	b[i]++;        
	}       int max = 0,c = 0;       for(int i = 0;i<n;i++)        
	if(b[i]>max)        
	{        
	max = b[i];        
	c = i;        
	}       int min = a[c];       for(int i = 0;i<n;i++)        
	if(b[i] == max)        
	if(a[i]<a[c])        
	min = a[i];       System.out.println(min);   }
	}


