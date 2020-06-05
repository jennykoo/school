
public class Ex02_정수형_ {
	public static void main(String[] args) {

		System.out.println(10);

		int a; //선언
		int b;
		a = 1; //초기화
		b = 2;
		// 선언과 초기화의 순서를 바꾸면 안됨. 1.선언 2. 초기화	
		int c = 3; //한번에 가능
		// int a,b;
		// int b; -> 중복으로 선언하면 오류 뜸

		System.out.println('a');
		System.out.println("a");
		System.out.println(a);
		System.out.println(a+a+a);
		System.out.println(a+10);
		System.out.println("a="+a); //문자열+변수, a=1 로 출력됨 "a="a 가 아님
		System.out.println("a+b="+(a+b)); 		


		System.out.println();

		byte b1 = 10;
		byte b2 = 20;
		byte b3; //-128~127

		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		//		System.out.println("b3="+b3);

		//b3 = b1 + b2; //b3 = 30; -> b+b =int로 변환되므로 안됨
		int result;
		result = b1 + b2;
		System.out.println("result="+result);
		
		int i1 = 1000000;
		int i2 = 2000000;
		//int i3 = i1*i2; //2조 (long)
		//System.out.println("i3="+i3); //-> 잘못됐는데 에러가 안나고 엉뚱한것이 나옴 -> 위험함
		// long i3 = i1*i2; //int*int ->오류
		long i3 = (long)i1 * i2; //-> 잠깐 long으로 바꾸는 행위
		System.out.println("i3="+i3);
		
		


	}	
}
