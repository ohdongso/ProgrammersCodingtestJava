package Lv0;

import java.util.Arrays;

public class _013_���ڿ�_���ϱ�_FM {
	/*
		���ڿ� my_string�� ���� k�� �־��� ��, my_string�� k�� �ݺ��� 
		���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
	*/ 
	public static void main(String[] args) {
		solution("string", 3);
	}
	
	public static String solution(String my_string, int k) {
		StringBuilder sb = new StringBuilder();
        for (int i=0; i<k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
	}
}