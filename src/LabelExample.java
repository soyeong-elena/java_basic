/*
 * Label
 */
public class LabelExample {

	public static void main(String[] args) {
//		레이블선언- 다 대문자로 쓰기
//		OUT:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ","+ j);
				if (j == 5) {
					break; 
//					괄호 바깥으로 나감
//					break OUT;
//					레이블이 선언된 for 바깥으로 감
				}
			}
		}
		
		
		
		
		
	}

}
