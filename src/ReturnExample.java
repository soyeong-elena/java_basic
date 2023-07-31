/*
 * return 
 */
public class ReturnExample {

	public static void main(String[] args) {
		System.out.println("자바프로그램 시작됨");
	
			for (int i = 0; i < 10; i++) {
				if (i == 5) {
//					break;
//					continue;
					return;
				}
				System.out.println(i);
					}
					System.out.println("자바프로그램 종료됨");
		
					
					
	}

}
