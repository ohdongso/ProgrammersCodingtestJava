package Lv0;

import java.util.Scanner;

public class _008_���ڿ�_������_FM {
	/*
		���ڿ� str�� �־����ϴ�.
		���ڿ��� �ð�������� 90�� ������ �Ʒ� ����� ���� ���� ����ϴ� �ڵ带 �ۼ��� ������.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int n = a.length();
        
        for(int i = 0; i<n; i++){
        	System.out.println(a.charAt(i));
        }
	}
}