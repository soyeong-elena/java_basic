/*
 * 조건문(분기문) if
 */
public class IFExample {

	public static void main(String[] args) {
		int score = 88;
//		단순 if문 한줄이면 {}생략되도 실행되긴함, true일때 실행
		if(score >= 60) {
			System.out.println("참 잘했어요...");
		}
		
//		if ~ else ~ 문
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		String result = score>= 60 ? "합격": "불합격";
		System.out.println(result);
		
//		다중 if문
		if (score >=90) {
			System.out.println("수");
		} else if(score >= 80){
			System.out.println("우");
		}else if(score >= 60){
			System.out.println("미");
		} else if(score >= 40){
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
//		홀짝수 판별
		int num = 56;
		if ((num %2) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		
	}

}
