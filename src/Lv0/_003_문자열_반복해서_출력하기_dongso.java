package Lv0;

import java.util.Scanner;

public class _003_문자열_반복해서_출력하기_dongso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        int strLength = str.length();
        if((strLength >= 1 && strLength <= 10) && (n >= 1 && n <= 5)) {
        	for(int i = 1; i <= n; i++) {
        		System.out.print(str);
        	}
        }

	}
}