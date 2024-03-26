package main;

public class Ex5 {

	public static void main(String[] args) {
		//char형은 '한글자' 문자 저장 가능 ex) 'a' 'b' 'c' '네' '아' ...
		char ch1 = 'A';	//문자를 작은 따옴표로 감싸야함
		System.out.println(ch1);  //A
		
		//문자를  int형으로 변환하면 그 문자에 해당되는 아스키값이 출력됨 문자형->정수형 형변환
		System.out.println((int)ch1);  //65
		
		char ch2 = 66;	//char형 변수는 숫자도 저장 가능  //코드체계에 의한 문자 출력 
		System.out.println(ch2); //문자가 출력됨
		
		char ch3 = '\n';  //한줄띄기를 의미하는 특수문자
		char ch4 = '\t';  //탭을 의미하는 특수문자
		
		//*특수기호 기능 : \ + 알파벳 -> 필요에 의해 자바특수기호 입력 후 검색요망
		
		System.out.print(ch3);
		System.out.print("안녕하세요");
		System.out.print(ch4);
		System.out.print("저는둘리입니다");
		
		System.out.print("\n안녕하세요\t저는둘리입니다");
		
		//String형은 문자열 저장 가능
		String str = "안녕하세요";	//텍스트를 큰 따옴표로 감싸야함. 작은따옴표 또는 감싸지 않을 시 에러
		System.out.println(str);
		
		//String 참조타입. class처럼 객체로 구성되어있기 때문에 대문자
		//Ctrl 누른 뒤 String에 마우스대고 타입 확인
		
		
		
	}

}
