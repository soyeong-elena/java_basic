/*
 * for 반복문
 */
public class ForExample {

	public static void main(String[] args) {
		for (int index = 0; index < 10; index++) {
			System.out.println("실행");
		}

//		블럭요소 안에 변수index선언은 안에서만 움직임 scope
//		for(변수초기화; 조건; 변수업데이트){명령문;}
		int result = 0;
		for (int index = 1; index <= 100; index++) {
			result += index;
		}
		System.out.println(result);

//		중첩for문을 이용한 사각형 출력
		for (int i = 0; i < 5; i++) { // 행반복
			for (int j = 0; j < 5; j++) { // 열반복
				System.out.print('*'); // print는 한줄에 나열됨
			}
			System.out.println(); // 아무것도 안넣으면 줄바뀜 println
		}

//		중첩for문 숫자출력
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j + " " );		//+연산자와 공백(' '문자)는 숫자로 계산됨, 문자열("")은 다름
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 10; i <= j ; j--) {
				System.out.print(j + " " );		
			}
			System.out.println();
		}
		
//		중첩for문을 활용한 구구단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j +"=" + (i*j) +"\t");
			}
			System.out.println();
		}
		
	}

}
