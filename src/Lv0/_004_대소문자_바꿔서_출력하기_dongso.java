package Lv0;

import java.util.Scanner;

public class _004_대소문자_바꿔서_출력하기_dongso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int strLength = a.length();
        if(strLength >= 1 && strLength <= 20) {
        	char[] arrayChar = a.toCharArray();
        	int charLength = arrayChar.length;
            for(int i = 0; i < charLength; i++) {
            	if(97 <= arrayChar[i] && arrayChar[i] <= 122) {
            		System.out.print((char)(arrayChar[i] - 32));
            	} else if(65 <= arrayChar[i] && arrayChar[i] <= 90) {
            		System.out.print((char)(arrayChar[i] + 32));
            	} else {
            		System.out.print(arrayChar[i]);
            	}
            }
        }
	}
}