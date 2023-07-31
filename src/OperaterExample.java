/*
 * 자바에서 지원하는 연산자들
 */
public class OperaterExample {

	public static void main(String[] args) {
		int x = 30, y = 5;
		
//		산술연산자
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y); //나머지연산자..
		
//		+연산자 오버로딩(중복정의)- 양옆이 동일한 type일때만 계산됨, 연산자의 우선순위는 반영됨(왼쪽에서 오른쪽으로)
		System.out.println(10 + 50);
		System.out.println("김기정" + "바보");
		System.out.println("바보" + 30 + 10); 
		System.out.println("바보" + (30 + 10)); 
		//형변환- 숫자10이 문자열10으로 바뀌고 연결기능으로 동작
		
//		복합대입연산자(+=, -=, *=, /=, %=)
//		x = x+5;
		x += 5;
		x -= 5;
		x *= 5;
		x /= 5;
		x %= 5;
		System.out.println(x);
		
//		비교연산자(==, !=, >, >=, <, <=)
		x = 10; 
		y = 5;
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x < y);
		System.out.println(x <= y);
		
//		 증감연산자 (++, --) 순서주의
		//x = x + 1;
		//x += 1;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		x = 10;
//		System.out.println(x++); 출력후 증가
		System.out.println(++x); //출력전 증가
		
//		논리연산자(&& 그리고, || or, !not)
		x = 30; 
		y = 50;
		
		System.out.println(x >=30 && y<=50);
		System.out.println(x >=30 || y>50);
		System.out.println(!true);
		
//		조건삼항연산자 
		int score = 85;
		String result = score >=60 ? "통과":"실패";
		System.out.println(result);
		
//		기본 데이터타입 변환
//		자동형변환(Promotion-upcasting)
		double some = 50.0;
		
//		강제형변환(Demotion-DownCasting) 데이터가 
		double avg = 85.346777;
		System.out.println(avg);
		int avg2 = (int)avg; //소수점뒷자리없어짐
		System.out.println(avg2);
		
		
		
	}

}
