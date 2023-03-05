import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter x-axis elements: ");
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++)
		   x[i]=sc.nextInt();
		System.out.println("Enter y-axis elements: ");
		for(int i=0;i<n;i++)
			y[i]=sc.nextInt();
		double x1=x[0],y1=y[0];
	    double x2=x[1],y2=y[1];
		double k1=0,k2=0;
		List<Integer> l1=new ArrayList<Integer>(); 
		List<Integer> l2=new ArrayList<Integer>(); 

		
	   for(int i=0;i<n;i++)
	   {
		   double a=(x[i]-x1)*(x[i]-x1)+(y[i]-y1)*(y[i]-y1);
		   k1=Math.sqrt(a);
		   double b=(x[i]-x2)*(x[i]-x2)+(y[i]-y2)*(y[i]-y2);
		   k2=Math.sqrt(b);
		   if(a<b) 
			   {
			     l1.add(i+1);
			     x1=(x1+x[i])/2;
			     y1=(y1+y[i])/2;  
			   }
		   else if(b<a) 
			   {
			     l2.add(i+1);
			     x2=(x2+x[i])/2;
			     y2=(y2+y[i])/2;
			   }
	   }
	   System.out.println("One cluster contains: "+l1);
	   System.out.println("other cluster contains: "+l2);
	
		
		
	}

}
