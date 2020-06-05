
public class Ex04_실수형 {
	public static void main(String[] args) {
		
		//float f1 = 1.234; // 실수는 기본적으로 double의 형태임
		float f1 = 1.234f; //끝에 f를 붙여줘야됨 (소,대문자 가능)
		
		double d1 = 1.234; //안쓰면 double인줄 앎, 1.234d 를 붙여도 무방
		double d2 = 1.234f;// 작은것->큰것에 넣는건 가능

		System.out.println("f1="+f1);
		System.out.println("d1="+d1);
		System.out.println("d2="+d2); // 작은것-> 큰것에 넣은것은 결과값에 약간의 오차가 발생하기 때문에 되도록 동일하고 정확하게 기입
		
		float f2 = 123; //float:4btye, int 123:4btye
		System.out.println("f2="+f2);
//		int i1 = 123.4f; //같은 4바이트지만 int와 float이 같이 있을때는 float 이 더 크다고 인식해서 오류가 남.
		int i1 = (int)123.4f; //강제로 int로 바꾼거임, 이 경우를 캐스팅했다고 표현함
		System.out.println("i1="+i1); 
		
		double d3 = .789E3; //0.789*10의 3승
		System.out.println("d3="+d3); //
		
		d3 = .789E-3;
		System.out.println("d3="+d3);
		
		
		int a = 100;
		char b = 'A';
		float c = 123.456f;
		String d = "아이유"; //큰 따옴표로 둘러싼 문자열은 String 으로 . (기본 문자열에는 포함x)
		
		/*
		 서식문자
		 * 정수: %d 
		 * char: %c
		 * string: %s
		 * 실수: %f
		 */
		
		System.out.printf("a="+a); //f는 포멧, 형식을 지정하고싶을때 사용
		System.out.println();
		System.out.printf("a=%d",a); //쉼표, a라는 값이 =다음에 출력되는거임
		System.out.println();
		System.out.printf("a=%d입니다.\n",a); //쉼표, a라는 값이 =다음에 출력되는거임 , \n은 엔터
		System.out.printf("a=%5d입니다.\n",a); //5자리까지 출력하라는뜻 -> 100이라서 앞에 공백 2개가 생김
		System.out.printf("b=%c입니다.\n",b);
		System.out.printf("b=%d입니다.\n",(int)b);
		System.out.printf("c=%f입니다.\n",c);
		System.out.printf("c=%.2f입니다.\n",c); //소숫점 밑 2자리까지만 출력하라는 뜻 (반올림됨)
		System.out.printf("c=%8.2f입니다.\n",c); //8자리를 출력해라, 소숫점은 2자리까지 출력해라. (간격맞출때 사용)
		System.out.printf("d=%s입니다.\n",d);
		
	
	}
	

	    
}
