package Lv0;

public class _011_���ڿ�_����_dongso {
	/*
		���̰� ���� �� ���ڿ� str1�� str2�� �־����ϴ�.
		�� ���ڿ��� �� ���ڰ� �տ������� ���� �����ư��鼭 �� ���� �����ϴ� ���ڿ��� 
		����� return �ϴ� solution �Լ��� �ϼ��� �ּ���.
	*/
	    
	public static void main(String[] args) {
		solution("aaaaa", "bbbbb");
	}
	
	public static String solution(String str1, String str2) {
		String answer = "";
		int str1Length = str1.length();
		int str2Length = str2.length();		
		
		if(str1Length == str2Length && (str1Length >= 1 && str1Length <= 10) 
		&& (str2Length >= 1 && str2Length <= 10)) {
			for (int i = 0; i < str1Length; i++) {
				answer += str1.charAt(i);
				answer += str2.charAt(i);
			}
		}

		return answer;
	}
}