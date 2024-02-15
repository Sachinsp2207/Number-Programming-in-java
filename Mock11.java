package numberprog;

public class Mock11 {
	public static void main(String[] args) {
		int num=34567;
		String s=String.valueOf(num);
		for (int i = s.length()-1; i>=0;i --) {
			System.out.println(s.charAt(i));
		}
	}
}
