package javalabexam;
import java.util.Scanner;
class Perfect extends Thread{
	int a,b;
	Perfect(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void run() {
		int i,j;
		for(i=a;i<=b;i++) {
			int sum=0;
			for(j=1;j<=(i/2);j++)
			{
				if((i%j)==0) {
					sum=sum+j;
				}
			}if(sum==i)
			{
				System.out.println(i);
			}
		}
		
	}
	
	
}
public class Perfectnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter 2 limits to find perfect number between them=");
		int a=s.nextInt();
		int b=s.nextInt();
		
		Perfect p=new Perfect(a,b);
		p.start();
		

	}

}
