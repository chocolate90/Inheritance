package quiz05;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		
		/*
		ArrayPrint클래스는
		배열을 매개변수로 받아 배열의 내부를 문자열 형태의 [값, 값, 값...] 리턴해주는 메서드를 가집니다.
		스트링 배열, int 배열, double 배열을 받아 출력하는 printArray() 를 오버로딩 하세요.
		
		Main에서 각각 배열들을 전달해 결과를 확인하세요
		*/

		ArrayPrint ap = new ArrayPrint();
		
		String[] ar = {"가", "나", "다"};
		System.out.println(ap.printArray(ar));
		
		int[] ar1 = {1, 2, 3};
		System.out.println(ap.printArray(ar1));
		
		double[] ar2 = {1.1, 1.2, 1.3};
		System.out.println(ap.printArray(ar2));
		
		// 일반적인 변수는 값이 복사되서 전달되는 형태
		String a = "홍길동";
		ap.test(a);
		System.out.println(a);
		
		// 배열이나 객체는 주소값이 전달되는 형태
		String[] a2 = {"가", "나", "다"};
		ap.test(a2);
		System.out.println(Arrays.toString(a2));
		
		// call by reference
	}
}
