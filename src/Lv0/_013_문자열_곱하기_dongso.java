package Lv0;

public class _013_���ڿ�_���ϱ�_dongso {
	/*
		���ڿ� my_string�� ���� k�� �־��� ��, my_string�� k�� �ݺ��� 
		���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
	*/
	public static void main(String[] args) {
		solution("string", 3);
	}
	
	public static String solution(String my_string, int k) {
		String answer = "";
		answer = my_string.repeat(k);
		return answer;
	}
}