package main;

/*
 * 정수 자료형
 * */
public class Ex4 {

	public static void main(String[] args) {
		
		short s =10;
		byte b = 10;
		int i = 10;
		long l = 10; //int형 기준으로 식별하기 때문에 int범위 안에서는 밑줄 없음
		
		// long타입에 값을 담을 때, int형 범위를 벗어나면 식별자를 붙여주어야 함. 누락하면 밑줄
		l = 12345678900l;
		
		System.out.println(s + b);  //서로 다른 타입의 변수끼리 계산 가능
		
		b = 200; //범위에 벗어나는 갑을 대입하면 에러 발생
		

	}

}
