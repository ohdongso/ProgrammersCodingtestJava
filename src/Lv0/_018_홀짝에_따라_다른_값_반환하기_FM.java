package Lv0;

public class _018_Ȧ¦��_����_�ٸ�_��_��ȯ�ϱ�_FM {
	/*
		���� ���� n�� �Ű������� �־��� ��, n�� Ȧ����� n ������ Ȧ���� ��� 
		���� ������ ���� return �ϰ� n�� ¦����� n ������ ¦���� ��� ���� 
		������ ������ ���� return �ϴ� solution �Լ��� �ۼ��� �ּ���.
	*/
	
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	
	public static int solution(int n) {
		int answer = 0;
	
		// n���� �����ؼ� 2�� ���̳ʽ��ؼ� �����´�.(n���� -2�� �ϸ� Ȧ��, ¦�� ���ڸ� �̾ƿü� �ֳ�)
		// Ȧ���̸� n~1, ¦���̸� n~0 ==> ���ʿ��� ������ ���ϼ� �ֳ�
	    for(int i = n; i >= 0; i -= 2)
	     	
	    // for������ Ȧ��, ¦��) ���� ���ͼ� 3�� �����ڷ� ������ �������ش�.
	    answer += (n % 2 == 0) ? i * i : i;
	    
	    /*
		    if(n%2 == 0) {
	           return IntStream.rangeClosed(1,n).filter(i->i%2==0).map(i->(int) Math.pow(i,2)).sum();
	        }
	        return IntStream.rangeClosed(1,n).filter(i->i%2==1).sum();
	    */
	    
	    return answer;
	}
}





