package ch2_4;

public class equalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 100; 
		
		// num1이 100과 같은지 if문으로 작성
		if(num1 == num2) {//if 조건: 들여쓰기
			System.out.println("num1은 100입니다!");
			System.out.println("num2은 100입니다!");
			
		}
		
		String str1 = "Korea";
//		String str2 = "Korea";
		String str2 = new String("Korea");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1.equals(str2)) {//equals 메서드는 문자열의 내용이 같은지를 비교
			//일반 변수는 == 로 같은지 비교하고, 문자열을 비교할때는 .equals() 라는 메서드를 사용해라!
			System.out.println("equals비교 : str1과 str2은 Korea 입니다!");
		}
		
		if(str1 == str2) {//== 연산자는 메모리 주소가 같은지를 비교
			System.out.println("==비교 : str1과 str2은 Korea 입니다!");
		}
		
	}

}
