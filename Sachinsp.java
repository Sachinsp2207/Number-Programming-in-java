package numberprog;
import java.util.*;
public class Sachinsp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int ip=s.nextInt();
		int temp=ip;
		int size=0;
		while(ip!=0)
		{
			ip/=10;
			size++;
		}
		int[]a=new int[size];
		
		for (int i = a.length-1; i>=0; i--) {
			a[i]=temp%10;
			temp/=10;
		}
		
		int fl=a[0]+a[a.length-1];
		int med=0;
		for (int i = 1; i < a.length-1; i++) {
			med+=a[i];
		}
		
		if (fl==med) {
			System.out.println("Xylum number");
		}
		else {
			System.out.println("not a xylum no");
		}		
	}
}
