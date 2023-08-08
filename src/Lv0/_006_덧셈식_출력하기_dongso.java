package Lv0;

import java.util.Scanner;

public class _006_덧셈식_출력하기_dongso {
	/*
		두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if((a >= 1 && b <= 100) && (b >= 1 && b <= 100)) {
        	System.out.println(a + " + " + b + " = " + (a + b));
        }    
	}
}
