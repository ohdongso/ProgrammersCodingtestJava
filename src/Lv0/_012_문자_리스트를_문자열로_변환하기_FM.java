package Lv0;

public class _012_문자_리스트를_문자열로_변환하기_FM {
	/*
		문자들이 담겨있는 배열 arr가 주어집니다. 
		arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
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