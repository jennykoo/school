
public class Ex01 {
	public static void main(String[]args) {
		System.out.println(1); //한문장 뒤에는 꼭 ;(세미클론)을 쓴다.
		
		System.out.println("2"); System.out.println("3");
		
		System.out.println("4");
		System.out.println();
		System.out.println("abc");
		System.out.println("abc"+"xyz"); //문자열+문자열 = 문자의 연결
//		System.out.println('abc'); 2글자 이상의 문자는 ""로 둘러쌈
//		System.out.println(abc); 문자 출력 시 ""로 둘러싸야한다
		System.out.println("a");
//		System.out.println('a'); 1글자는 "",'' 둘 다 가능함

		System.out.println();
		System.out.println(1+2);
//		System.out.println('1+2');  작은따옴표는 에러가 남
		System.out.println("1+2"); //따옴표로 감싸면 연산이 아니라 '문자'로 생각함
		System.out.println("1"+"2"); //문자열로 취급이 되어 나열되서 나옴
		System.out.println("1+2=3"); 
		System.out.println("1+2="+1+2); 
		System.out.println("1+2="+(1+2)); 
		
		
		System.out.println();
	}
	
	
	
}
/*
주석문
() : 소괄호
{} : 중괄호
[] : 대괄호

단축키
저장 : Ctrl+s
한줄삭제 : Ctrl+d
되돌리기 : Ctrl+z
복사 : Ctrl+c
붙여넣기 : Ctrl+v
복사와 붙여넣기 : Ctrl+Alt+방향키
잘라내기 : Ctrl+x
잘라내기와 붙여넣기 : Alt+방향키
Run(실행) : ctrl + F11 (오른쪽버튼 run as -> java application)
한 줄 주석 or 주석해지 : Ctrl+/
여러줄 주석  : 범위 블럭처리 +Ctrl+Shift+/ ,  해지: Ctrl+Shift+역슬레쉬
syso+ctrl+space : System.out.println();
줄맞춤 : ctrl+i
전체선택: ctrl+a

에러메세지가 뜨면 꼭 읽어보기
이클립스에서 돌려볼 시 위에 초록색 버튼 눌러보기(간편함)
5번째 줄에서 에러가 났다고 해도 가끔 4-6번째 줄에서 에러난 경우 있음
프린트 문자 출력할 때 반드시 큰따옴표 해야함
*/
