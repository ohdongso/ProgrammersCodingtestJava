package Lv0;

import java.util.Scanner;

public class _008_���ڿ�_������_dongso {
	/*
		���ڿ� str�� �־����ϴ�.
		���ڿ��� �ð�������� 90�� ������ �Ʒ� ����� ���� ���� ����ϴ� �ڵ带 �ۼ��� ������.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        int wordsLength = a.length();
        if(wordsLength >= 1 && wordsLength <= 10) {
            for (char word : a.toCharArray()) {
            	System.out.println(word);
            }
        }
	}
}