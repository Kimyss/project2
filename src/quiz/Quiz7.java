package quiz;

public class Quiz7 {

	public static void main(String[] args) {
		
		double d = 1.2;
		float f = 0.9f;
		
		int i = (int)d;  //
		int i2 = (int)f;  // 반올림이 안되네?
		int i3 = (int)d + (int)f; // 형변환을 각각 한 후에 합
		int i4 = (int)(d+f);  // 더한 후에 형변환 1.2+ 0.9 = 2.1  -> 2
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

	}

}
