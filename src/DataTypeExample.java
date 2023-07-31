class DataTypeExample {
	public static void main(String[] args) {

		char ch1 = '가';
		char ch2 = 0xAC00;
		char ch3 = '\uAC00';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		//이스케이프 문자 처리- 문법오류회피하는 역슬러시\
		String message = "\"자바\"는 웹애플리케이션 개발 \'최강\' 언어 입니다..";
		System.out.println(message);
		
		String path = "C:\\a\\b\\c\\some.txt";
		System.out.println(path);
		
//		제어문자
		String message2 = "안녕하세요. \n김기정입니다..";
		System.out.println(message2);
		
		String header = "번호\t이름\t나이";
		System.out.println(header);
		
//		boolean 참거짓
		boolean isMan = true;
//		boolean flag = 0; 컴파일에러
		System.out.println(isMan);
//		기본 데이터타입-int, double, boolean 제일많이사용
		
		
	}
}
