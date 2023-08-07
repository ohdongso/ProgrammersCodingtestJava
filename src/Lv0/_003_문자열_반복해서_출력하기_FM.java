package Lv0;

import java.util.Scanner;

public class _003_문자열_반복해서_출력하기_FM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        // 문자열 str을 n번 반복한다.
        System.out.println(str.repeat(n));
	}
}
