package Lv0;

public class _010_���ڿ�_���ľ���_dongso {
	/*
		���ڿ� my_string, overwrite_string�� ���� s�� �־����ϴ�. 
		���ڿ� my_string�� �ε��� s���� overwrite_string�� ���̸�ŭ�� 
		���ڿ� overwrite_string���� �ٲ� ���ڿ��� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
		
		subString() �Լ� �����
		substring(1, 3) �� �Է��ϸ� �ε����� 1���� 3�������� ���ڸ� �ڸ��� �Ǵµ� B���� C���� �߶� "BC"�� ������ �ȴ�.
		==> beginIndex��ġ���� �����Ͽ� endIndex �� ��ġ������ ���� �����Ѵ�.
		substring(5) �� �Է��ϸ� �ε��� 5���� ���ڿ� ������ �߶� "3de"�� ���ϵȴ�.
		
		StringBuffer Ŭ���������� Ư�� ��ġ�� ���ڿ��� �ٸ� ���ڿ��� �����ϴ� replace �Լ��� �����մϴ�.
		�Ű����ڴ� ���۰� �� ��ġ�� ��ü ���ڿ��̸� ��ȯ���� StringBuffer �Դϴ�.
		���� �ε������� �����ؼ� �� �� �ε��������� ���ڿ��� ġȯ�մϴ�.
	*/
	    
	public static void main(String[] args) {
		// System.out.println(solution("He11oWor1d", "lloWorl", 2));
		// System.out.println(solution("Program29b8UYP", "merS123", 7));
	}
	
    public static String solution(String my_string, String overwrite_string, int s) {
    	StringBuffer sb = new StringBuffer();
    	sb.append(my_string);
        int overwrite_string_length = overwrite_string.length(); // ġȯ�ؾ��� ���ڿ� ����
        sb.replace(s, s + overwrite_string_length, overwrite_string); // �������ڿ����� �����Ǿ���� ���ڿ� ġȯ
        String answer = sb.toString();
        return answer;
    }
}