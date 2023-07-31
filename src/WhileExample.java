/*
 * 반복문 While
 */
public class WhileExample {

	public static void main(String[] args) {
//		0부터 100까지 합
		int index = 0;
		while (index < 5) {
			System.out.println("으앗");
			index ++;
		}
	
	int result = 0;	
	index = 1;
	while ( index <= 100) {
		result += index;
//		result = result + index;
		index ++ ;				
	}
	System.out.println("누적합 : " + result);

//	even짝수합 odd홀수합
	int num1 = 0;
	int num2 = 0;
	
	int ant = 0;
	while (ant<= 100) {
		if ((ant%2) == 0) { num2 += ant;
			
		} else { num1 += ant;

		}
			ant ++;
	}		
	System.out.println("홀수합 : " + num1);		
	System.out.println("짝수합 : " + num2);		
	System.out.println("누적합 : " + (num1+num2));		

//	do while문 한번실행하고 조건체크	
	
	int ami = 0;
	do {
		System.out.println("자바 풀스택 웹 개발자과정 화이팅");
		ami ++;
		} while (ami <= 10) ;
	

	
	
	}		
}
