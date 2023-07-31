/*
 * 조건문(분기문) Switch
 */
public class SwitchExample {

	public static void main(String[] args) {
		int num = 1;
		switch (num) {
		case 1: System.out.println("1입니다..");
			break;
		case 2: System.out.println("2입니다..");
			break;
		case 3: System.out.println("3입니다..");
			break;
		case 4: System.out.println("4입니다..");
			break;
		case 5: System.out.println("5입니다..");
			break;
		default: System.out.println("일치하는 값이 없습니다.."); 
		}
		//break 제어문,이동문 중괄호{}밖으로 이동하세요
//		실수(소수점)는 비교못함, 숫자랑 문자는가능
		
		char some = 'a';
		switch (some) {
		case 'a': System.out.println("1입니다..");
			break;
		case 'b': System.out.println("2입니다..");
			break;
		case 'c': System.out.println("3입니다..");
			break;
		case 'd': System.out.println("4입니다..");
			break;
		case 'e': System.out.println("5입니다..");
			break;
		default: System.out.println("일치하는 값이 없습니다.."); 
		}
		
		String name = "김기정";
		switch (name) {
		case "김기정": System.out.println("1입니다..");
			break;
		case "이기정": System.out.println("2입니다..");
			break;
		default: System.out.println("일치하는 값이 없습니다.."); 
		}
		

		int test = 88;
		switch (test/10) {
		case 10: 
		case 9: System.out.println('수');
			break;
		case 8: 
		case 7: System.out.println('우');
			break;
		case 6: System.out.println('양');
			break;
		default: System.out.println('가');
		}
		
		int x = 50, y = 30;
		char operator = '+';
		switch (operator) {
		case '+': System.out.println("합 = " + (x + y)); break;
		case '-': System.out.println("차 = " + (x - y)); break;
		case '*': System.out.println("곱 = " +(x * y)); break;
		case '/': System.out.println("나누기 = " + (x / y)); break;
		default:
		}
		
		
	
		
		
	}

}
