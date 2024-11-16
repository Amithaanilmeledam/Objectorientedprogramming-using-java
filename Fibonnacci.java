package javalabexam;
import java.util.Scanner;
class Fibo extends Thread{
	int n;
	Fibo(int n)
	{
		this.n=n;
	}
	public void run() {
		int a[]=new int[n];
		System.out.println("Series:");
		
		a[0]=0;
		a[1]=1;
		System.out.print(a[0]+"\t"+a[1]);
		for(int i=2;i<n;i++)
		{
			a[i]=a[i-1]+a[i-2];
			System.out.print("\t"+a[i]);
		}
		
	}
	
	
	
}
public class Fibonnacci {
public static void main(String[] args)
{   Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of terms you want to print:");
	int n=s.nextInt();
	Fibo f=new Fibo(n);
	f.start();
}
}

