package numberprog;

public class CheckFibonci {
public static void main(String[] args) {
	int n1=0;
	int n2=1;
	int n3;
	int temp=0;
	for (int i = 0; i<=temp; i++) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		if (n1==temp) {
			System.out.println("fibonci no");
			break;
		}
	}
}
}
