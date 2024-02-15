package numberprog;

public class Hcf {
public static void main(String[] args) {
	int big=12;
	int small=8;
	   int hcf=big;
	   while (true) {
		if (big%hcf==0 && small%hcf ==0) {
			System.out.println(hcf);
			break;
		}
		hcf--;
	}
}
}
