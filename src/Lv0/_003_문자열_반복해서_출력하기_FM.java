package Lv0;

import java.util.Scanner;

public class _003_���ڿ�_�ݺ��ؼ�_����ϱ�_FM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        // ���ڿ� str�� n�� �ݺ��Ѵ�.
        System.out.println(str.repeat(n));
	}
}
