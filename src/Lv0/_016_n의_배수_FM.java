package Lv0;

public class _016_n��_���_FM {
	/*
		���� num�� n�� �Ű� ������ �־��� ��, num�� n�� ����̸� 
		1�� return n�� ����� �ƴ϶�� 0�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
	*/
	public static void main(String[] args) {
		System.out.println(solution(34, 3));
	}
	public static int solution(int num, int n) {
		int answer = num % n == 0 ? 1 : 0;
        return answer;
	}
}