package Lv0;

public class _010_���ڿ�_���ľ���_FM {
	/*
		���ڿ� my_string, overwrite_string�� ���� s�� �־����ϴ�. 
		���ڿ� my_string�� �ε��� s���� overwrite_string�� ���̸�ŭ�� 
		���ڿ� overwrite_string���� �ٲ� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
    */
	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d", "lloWorl", 2));
	}
	    public static String solution(String my_string, String overwrite_string, int s) {
	        String before = my_string.substring(0, s); // index0���� 2���ڸ� �߶󳽴�.
	        System.out.println("before : " + before);
	        String after = my_string.substring(s + overwrite_string.length()); // index 2+7 = 9���� ������ ©�󳽴�.
	        System.out.println("after : " + after);
	        return before + overwrite_string + after; // ġȯ�ؾ��� ���ڿ��� ������ (��, ��)�� �߶󳻰� �������� ģȯ�ؾ��� ���ڿ��� ���ļ� ����Ѵ�.
	    }
	    /*
		    String answer = my_string.substring(0, s) + overwrite_string;
	
	        if(my_string.length() > answer.length()) {
	            answer += my_string.substring(answer.length());
	        }
	        return answer;
	    */
}
