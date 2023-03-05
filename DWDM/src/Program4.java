import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number of elements: ");
		  int n=sc.nextInt();
		  System.out.println("enter of values of data: ");
		  int[] a=new int[n];
		  int sum=0;
		  double d=0,sd=0,ans=0;
		  for(int i=0;i<n;i++)
		  {
			a[i]=sc.nextInt();
			sum+=a[i];
		  }
		  double mean=(double)sum/n;
		  System.out.println("Mean is: "+mean);
		  for(int i=0;i<n;i++)
			  d+=(a[i]-mean)*(a[i]-mean);
		  sd=Math.sqrt(d/n);
		  System.out.println("Standard deviation is: "+sd);
		  for(int i=0;i<n;i++)
		  {
			  ans=(a[i]-mean)/sd;
			  System.out.println(a[i]+" is mapped to "+ans);
		  }
	}

}
