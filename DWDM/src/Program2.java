import java.util.Scanner;

public class Program2 {
      public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the size of the variable a and b: ");
	   int n=sc.nextInt();
	   int[] a=new int[n];
	   int[] b=new int[n];
	   double asum=0;
	   double bsum=0;
	   double d1=0,d2=0,value = 0;
	   System.out.println("enter the elements of a: ");
	   for(int i=0;i<n;i++)
	   {
		   a[i]=sc.nextInt();
	       asum+=a[i];
	   }
	   for(int i=0;i<n;i++)
	   {
		   b[i]=sc.nextInt();
		   bsum+=b[i];
	   }
	   double amean=(double)asum/n;
	   double bmean=(double)bsum/n;
	   for(int i=0;i<n;i++)
	   {
		   d1+=(a[i]-amean)*(a[i]-amean);
		   d2+=(b[i]-bmean)*(b[i]-bmean);
		   value+=(a[i]-amean)*(b[i]-bmean);
	   }
	   double sd1=0,sd2=0;
	   sd1=Math.sqrt(d1/n);
	   sd2=Math.sqrt(d2/n);
	   double ans=value/(n*sd1*sd2);
	   System.out.println(ans);
	   if(ans>0) System.out.println(" a and b are positively correlated");
	   else if(ans==0) System.out.println("a and b are independent");
	   else System.out.println("a and b are negatively correlated");
	   
	  
	   
	   
      }
}
