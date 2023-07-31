/*
 * method 메소드(함수) 정의 및 사용
 */
public class MethodExample {
	
/*
 * 	구구단을 출력하는 메소드 정의, 클래스 위쪽 선언부 주석
*/
 
	
	static void printGugudan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j +"=" + (i*j) +"\t");
			}
			System.out.println();
		}
	}
	
/* 
 * 단을 입력받아 해당 단을 출력하는 기능
 * void printdan(매개변수 parameter, 지역변수일종)
 * 반환데이터타입=리턴타입return
 */
	static void printDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.print(dan + "*" + i + "=" + dan * i +"\t");
		}
		System.out.println();
	}
	
//	2개의 정수를 전달받아 해당정수의 합을 반환하는 기능
	static int sum(int x, int y) {
		return x + y;		//반환할때 사용 return, x+y결과값을 호출한쪽에 반환함
	}
	
	 
	

	public static void main(String[] args) {
		System.out.println("구구단 출력하기");
//		구구단 출력 메소드 호출(사용)
//		여러번 재사용가능, 코드 수정에 용이
		printGugudan();
		printGugudan();
		
//		5단 출력
		printDan(5);  //5를 전달인자(Argument)
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		printDan(7);
		
		int a = 500, b = 302999; //변수선언해도 sum의 method안에 x와 y는 별개
		int result = sum(a, b);
		System.out.println(result);
		
		System.out.println(sum(5, 10));
		
	}

}
