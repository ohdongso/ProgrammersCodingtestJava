package Lv0;

public class _017_�����_FM {
	/*
		���� number�� n, m�� �־����ϴ�. number�� n�� ����̸鼭 m�� 
		����̸� 1�� �ƴ϶�� 0�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	*/
	public static void main(String[] args) {
		System.out.println(solution(55, 10, 5));
	}
	public static int solution(int number, int n, int m) {
		return number % n == 0 && number % m == 0 ? 1 : 0;
	}
}