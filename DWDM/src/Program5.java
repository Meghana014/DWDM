import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		  int n=sc.nextInt();
		  System.out.println("enter of values of data: ");
		  int[] a=new int[n];
		  for(int i=0;i<n;i++)
		  {
			a[i]=sc.nextInt();
		  }
		  for(int i=0;i<n;i++)
		  {
			  int count=0;
			  int power=1;
			 int b=a[i];
			  while(b!=0)
			  {
				  b/=10;
				  count+=1;
			  }
			  for(int j=0;j<count;j++)
			  {
				 power*=10;
			  }
			  //System.out.println(power);
			  double ans=(double)a[i]/power;
			  System.out.println(a[i]+" is mapped to "+ans);
			  
		  }
	}

}
