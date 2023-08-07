package Lv0;

import java.util.Scanner;

public class _004_대소문자_바꿔서_출력하기_FM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        //Stack <Character> stack = new Stack <> ();
        
        // Character클래스는 문자 데이터에 대한 다양한 처리를 위한 상수 및 메서드를 제공
        /*
	        ch 는 대문자인가? " + Character.isUpperCase(ch)
	        ch 는 소문자인가? " + Character.isLowerCase(ch)
	        "ch 는 문자인가? " + Character.isLetter(ch)
	        "ch 는 숫자인가? " + Character.isDigit(ch)
	        "ch 는 공백문자인가? " + Character.isWhitespace(ch)
	        "ch 는 공백문자인가? " + Character.isSpace(ch)
        */
        
        for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                //stack.push(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                //stack.push(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            }
        } 
        System.out.println(answer);
	}
}