package Lv0;

import java.util.Scanner;

public class _009_Ȧ¦_�����ϱ�_dongso {
	/*
		�ڿ��� n�� �Է����� �־����� �� ���� n�� ¦���̸� "n is even"��,
		Ȧ���̸� "n is odd"�� ����ϴ� �ڵ带 �ۼ��� ������.
	*/
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();

		 if(n >= 1 && n <= 1000) {
			 if(n % 2 == 0) {
				 System.out.println(n + " is even");
			 } else {
				 System.out.println(n + " is odd");
			 }
		 }
	}
}