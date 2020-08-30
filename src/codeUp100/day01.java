package codeUp100;

//codeUp 기본 100제 day01
import java.util.Scanner;
public class day01 {

	//public class Main{
	public static void main(String[] args) {
		
		//int n;
		//int n, m;
		//char x,y;
		//float x;
		//String now;
		String jumin;
		
		Scanner scan = new Scanner(System.in);
		
		
		//n= scan.nextInt();
//		m = scan.nextInt();
		//x = scan.next().charAt(0);
		//y = scan.next().charAt(0);
		//x = scan.nextFloat();
		//System.out.println(String.format("%.2f", x));
		
		//now = scan.nextLine();
		
		//String[] str = now.split("\\.");

//		int year = Integer.parseInt(str[0]);
//		int month = Integer.parseInt(str[1]);
//		int day = Integer.parseInt(str[2]);
//		
//		System.out.println(String.format("%04d", year)+"." +String.format("%02d", month)+"."+String.format("%02d", day));			
		
		jumin = scan.nextLine();
		String[] str = jumin.split("-");
		
		
		
		System.out.println(String.format("%06d", Integer.parseInt(str[0]))+String.format("%07d",Integer.parseInt(str[1])));		
	}
}

/* 유니코드 출력법
 * System.out.println("\u250C\u252C\u2510");
 * System.out.println("\u251C\u253C\u2524");
 * System.out.println("\u2514\u2534\u2518");
 */