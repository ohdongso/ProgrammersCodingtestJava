package Lv0;

import java.util.Scanner;

public class _009_Ȧ¦_�����ϱ�_FM {
	/*
		�ڿ��� n�� �Է����� �־����� �� ���� n�� ¦���̸� "n is even"��,
		Ȧ���̸� "n is odd"�� ����ϴ� �ڵ带 �ۼ��� ������.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
	}
}