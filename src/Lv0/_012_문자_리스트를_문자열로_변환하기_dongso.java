package Lv0;

import java.util.Arrays;

public class _012_����_����Ʈ��_���ڿ���_��ȯ�ϱ�_dongso {
	/*
		���ڵ��� ����ִ� �迭 arr�� �־����ϴ�. 
		arr�� ���ҵ��� ������� �̾� ���� ���ڿ��� return �ϴ� solution�Լ��� �ۼ��� �ּ���.
	*/ 
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "a";
		arr[1] = "b";
		arr[2] = "c";
		solution(arr);
	}
	
	public static String solution(String[] arr) {
		int arrLength = arr.length;
		String answer = "";
		if(arrLength >= 1 && arrLength <= 200) {
			for(int i = 0; i < arrLength; i++) {
				answer += arr[i];
			}
		}

		return answer;
	}
}