package Lv0;

import java.util.Scanner;

public class _002_a��_b_����ϱ�_dongso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// nextInt�� ���� �Ǵ� �ٷ� �����Ͽ� �Է��� �޴´�.
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a >= -100000 && a <= 100000) && (b >= -100000 && b <= 100000)) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		
	}
}