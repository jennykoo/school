
public class Ex03_문자형 {
	public static void main(String[] args) {
		
		int a = 1;
		char b = 'A';
//		char b = 'xy'; 나 "xy"; 는 안됨. 무조건 한 문자만 가능
//		char b = '' 는 불가능하지만, ' '는 가능
		System.out.println("b="+b);
		System.out.println(b+1);
		System.out.println('A'+1); // char+int=int
		System.out.println((char)('A'+1)); //A+1을 강제로 문자로 바꾸겠다.
//		모든 문자는 고유숫자를 가져서(아스키코드값)  A(65)라서 66이라는 결과가 나온것임
		System.out.println("A"+1);
		

		
		boolean x = true; // 참 이라는 형태. ""에 넣지 x
		
		System.out.println("x="+x);
		
		boolean y = 10 < 5;
		System.out.println("y="+y);
		
	}

}





