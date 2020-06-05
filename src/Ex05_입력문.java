import java.util.Scanner;

public class Ex05_입력문 {
	public static void main(String[] args) {
		int a;
		a = 10;
		System.out.println("a="+a);
		
		a = 20;
		System.out.println("a="+a); //변수.a안에 덮어쓰기가 된것. syso20식을 쓰기 전까지는 a는10,
		
		  Scanner sc= new Scanner(System.in); //Scanner를 만드는 작업. 한번만 입력하면 됨.Scanner의 세번째 java 클릭 혹은 1번에 import java.util.Scanner;을 씀 
		  
		  System.out.print("이름 입력:");
		  String name = sc.next(); //문자열 입력
//		  char는 한글자를 넣을때사용
		  System.out.println("name="+name);
		  
		  System.out.print("국어점수 입력:"); //이것을 삽입 해 스캐너가 잘 돼있는지 확인 가능함
		  int kor = sc.nextInt(); // 입력한 정수를 scanner를 통해 읽어들임
		  System.out.println("kor="+kor); //오른쪽 사각형이 빨간색일때 값을 넣으면 출력됨
		  
		  System.out.print("영어점수 입력:");
		  int eng = sc.nextInt();
		  System.out.println("eng="+eng);
		  
		  System.out.print("수학점수 입력:");
		  int math = sc.nextInt();
		  //		  double math = sc.nextDouble(); //타입별로 선택해서 기입
		  System.out.println("math="+math);
		  
		  
		  int total = kor + eng + math;
		 
		  
//		  세개의 합의 평균 구하기
		  double avg = (double)total/3; //int 나누기 int = 정수 -> 둘중에 하나를 double로 만드는 작업을 해야함. double(8byte) 나누기 int(4byte) 하면 큰바이트(double)로 바뀜
//		  avg = total/0.3;  으로 해도 됨 .. double avg = total/3; 으로 하지 않게 주의
		  System.out.printf("avg=%f\n",avg);
//		  평균 소수점 아래 2자리 출력
		  System.out.printf("avg=%.2f",avg);
		  
		  
		 
	}

}
