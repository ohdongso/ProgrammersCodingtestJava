package Lv0;

public class _011_���ڿ�_����_FM {
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

			 
		        for(int i = 0; i < str1.length(); i++){
		            answer+= str1.charAt(i);
		            answer+= str2.charAt(i);
		        }

		        return answer;
		}
	}