package numberprog;
import java.util.*;
public class CountOfNumInArray {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int size=s.nextInt();
	
	 int a[]=new int[size];
	 int ans[] = new int[size];
	 for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();
	}
	 int k=0;
	 int ct=0;
	for (int i = 0; i < a.length; i++) {
	
		
		for (int j = 0; j < a.length; j++) {
			if(a[i]==a[j])
			{
				ct++;
			}
		
		}
		ans[k]=ct;
		k++;
	}
	
	
	for (int i = 0; i < ans.length; i++) {
		System.out.println(ans[i]);
	}
}
}
