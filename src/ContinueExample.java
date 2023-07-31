/*
 * 이동문 Continue
 */
public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i == 50) {
				continue;		//반복문에서 특정조건에만 실행하고싶지 않을때
			}
			System.out.println("출력 =" + i);
			}
		
//		홀수만 출력
		for (int i = 1; i <= 30; i++) {
			if (i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		for (int i = 1; i <= 30; i+=2) {
				System.out.println(i);
			}
		
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
