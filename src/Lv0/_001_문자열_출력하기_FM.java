package Lv0;

import java.util.Scanner;

public class _001_문자열_출력하기_FM {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int a = str.length();

        if(a >= 1 && a <= 1000000) {
            System.out.println(str);
        }
        
        //  System.out.print(new java.util.Scanner(System.in).next());
        
        /*
        if (str.length() > 1 && str.length() < 1000000 && !str.contains(" ")) {
            System.out.println(str);
        }
        */
	}
}