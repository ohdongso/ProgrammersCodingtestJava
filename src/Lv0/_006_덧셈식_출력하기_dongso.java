package Lv0;

import java.util.Scanner;

public class _006_������_����ϱ�_dongso {
	/*
		�� ���� a, b�� �־��� �� ������ ���� ������ ������ ����ϴ� �ڵ带 �ۼ��� ������.
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
