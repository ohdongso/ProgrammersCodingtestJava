package Lv0;

public class _012_����_����Ʈ��_���ڿ���_��ȯ�ϱ�_FM {
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
		return String.join("", arr);
	}
}