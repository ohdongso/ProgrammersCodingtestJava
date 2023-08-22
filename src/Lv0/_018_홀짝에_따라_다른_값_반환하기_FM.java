package Lv0;

public class _018_홀짝에_따라_다른_값_반환하기_FM {
	/*
		양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 
		양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 
		정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
	*/
	
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
	
	public static int solution(int n) {
		int answer = 0;
	
		// n부터 시작해서 2씩 마이너스해서 내려온다.(n에서 -2씩 하면 홀수, 짝수 숫자만 뽑아올수 있네)
		// 홀수이면 n~1, 짝수이면 n~0 ==> 불필요한 연산을 줄일수 있네
	    for(int i = n; i >= 0; i -= 2)
	     	
	    // for문으로 홀수, 짝수) 값을 들고와서 3항 연산자로 변수에 누적해준다.
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





