package Lv0;

import java.util.Scanner;

public class _002_a와_b_출력하기_dongso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// nextInt는 공백 또는 줄로 구분하여 입력을 받는다.
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a >= -100000 && a <= 100000) && (b >= -100000 && b <= 100000)) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		
	}
}