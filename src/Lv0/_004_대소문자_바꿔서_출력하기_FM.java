package Lv0;

import java.util.Scanner;

public class _004_��ҹ���_�ٲ㼭_����ϱ�_FM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        //Stack <Character> stack = new Stack <> ();
        
        // CharacterŬ������ ���� �����Ϳ� ���� �پ��� ó���� ���� ��� �� �޼��带 ����
        /*
	        ch �� �빮���ΰ�? " + Character.isUpperCase(ch)
	        ch �� �ҹ����ΰ�? " + Character.isLowerCase(ch)
	        "ch �� �����ΰ�? " + Character.isLetter(ch)
	        "ch �� �����ΰ�? " + Character.isDigit(ch)
	        "ch �� ���鹮���ΰ�? " + Character.isWhitespace(ch)
	        "ch �� ���鹮���ΰ�? " + Character.isSpace(ch)
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