package Lv0;

import java.util.Scanner;

public class _001_문자열_출력하기_dongso {
	/*
		문제 설명
		문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
		
		제한사항
		1 ≤ str의 길이 ≤ 1,000,000
		str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
		
		공부내용
		next(), nextLine() 차이점
		공통점은 둘다 문자열로 반환을 시켜준다는 점이고 차이점은 개행문자를 무시하냐 안하냐의 차이라고 할 수 있다.
		next()는 개행문자를 무시하고 입력을 받고, nextLine()은 한줄 단위로 입력을 받기 때문에 개행문자로 포함한다.
		next()로 입력을 받으면 입력받은 문자를 제외 하고 버퍼에 \n이 남아 있는데 그 다음 nextLine()으로 입력받으면
		\n만 가져오고 프로그램이 종료되서 입력을 추가적으로 받을 수 없다.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        System.out.println(a);
	}
}