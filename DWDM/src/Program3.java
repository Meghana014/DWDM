import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of elements: ");
	  int n=sc.nextInt();
	  System.out.println("enter of values of data: ");
	  int[] d=new int[n];
	  for(int i=0;i<n;i++)
		d[i]=sc.nextInt();  
	  int min=d[0];
	  int max=d[0];
	  double ans=0;
	  for(int i=0;i<n;i++)
	  {
		  if(d[i]<min) min=d[i];
		  if(d[i]>max) max=d[i];
	  }
	  for(int i=0;i<n;i++)
	  {
		ans=(double)(d[i]-min)/(max-min);
		System.out.println(d[i]+" is mapped to "+ans);
	  }
	
  }
}
