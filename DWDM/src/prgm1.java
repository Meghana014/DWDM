import java.util.*;
public class prgm1 {
	public static void bins(int[] a,int bin,int len)
	{   //binning
		int n=(int)len/bin;
		double[][] b=new double[bin][n];
		for(int i=0;i<bin;i++)
		{
			for(int j=i*n,k=0;j<(i+1)*n;k++,j++)
			{
				if(j>=len)  break;
				b[i][k]=a[j];
			}	
		}
		System.out.println("The bins are: ");
		display(bin,b,n);
		//mean
		double[][] c=new double[bin][n];
		for(int i=0;i<bin;i++)
		{   double sum=0;
			for(int j=0;j<n;j++)
			{
				sum=sum+b[i][j];
			}
			double ans=(double)sum/n;
			for(int j=0;j<n;j++)
			{
				c[i][j]=ans;
			}
		}
		System.out.println("The mean of the bins are: ");
		display(bin,c,n);
		//boundries
		double[][] d=new double[bin][n];
		
		for(int i=0;i<bin;i++)
		{   double res = 0;
			for(int j=0;j<n;j++)
			{
				double min=b[i][0];
				double max=b[i][n-1];
				double ans=Math.abs(b[i][j]-min);
				double ans1=Math.abs(b[i][j]-max);
				if(ans<ans1)   res=min;
				else res=max;	
				d[i][j]=res;
			}
			
		}
		System.out.println("the boundries of the bins are: ");
		display(bin,d,n);
			
	}
	public static void display(int bin,double[][] b,int n)
	{
		for(int i=0;i<bin;i++)
		{    System.out.print('[');
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.print(']');
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements: ");
		int n=sc.nextInt();
		System.out.println("enter the elements in increasing order: ");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter number of bins: ");
		int bin=sc.nextInt();
		bins(a,bin,n);
		
		
	}

}
