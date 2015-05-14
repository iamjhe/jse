package cmm03.flow;

import java.util.Scanner;

public class No06_SimpleGugudan {
	public static void main(String[] args) {
		int dan = 1;
		int a=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요.");
		dan = scanner.nextInt();
		for(int i=1; i<10; i++){
			a=dan*i;
			System.out.println(dan+ "x" +i+ "=" + a); 
		}
	}
}
