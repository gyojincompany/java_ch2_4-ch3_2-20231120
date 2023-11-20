package ch2_4;

import java.util.Scanner;

public class InputTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // 파이썬 클래스 선언 객체이름 scan = Scanner();
		
//		int keyCode1 = scanner.nextInt();//키보드로부터 정수 받아오기
//		double keyCode2 = scanner.nextDouble();//키보드로부터 실수 받아오기
//		String keyCode3 = scanner.nextLine();//키보드로부터 문자열 받아오기(엔터키 누르기 전까지 입력된 문자열 받음)
//		String keyCode4 = scanner.next();//키보드로부터 문자열 받아오기(공백을 만나면 공백전까지만 입력된 문자열 받음)
		char keyCode5 = scanner.next().charAt(5);//문자열을 입력받아서 원하는 인덱스의 한글자만 입력받을때
		 
//		System.out.println(keyCode1);
//		System.out.println(keyCode2);
//		System.out.println(keyCode3);
//		System.out.println(keyCode4);
		System.out.println(keyCode5);
		
		
	}

}
