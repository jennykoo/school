import java.util.Scanner;

public class Ex05_�Է¹� {
	public static void main(String[] args) {
		int a;
		a = 10;
		System.out.println("a="+a);
		
		a = 20;
		System.out.println("a="+a); //����.a�ȿ� ����Ⱑ �Ȱ�. syso20���� ���� �������� a��10,
		
		  Scanner sc= new Scanner(System.in); //Scanner�� ����� �۾�. �ѹ��� �Է��ϸ� ��.Scanner�� ����° java Ŭ�� Ȥ�� 1���� import java.util.Scanner;�� �� 
		  
		  System.out.print("�̸� �Է�:");
		  String name = sc.next(); //���ڿ� �Է�
//		  char�� �ѱ��ڸ� ���������
		  System.out.println("name="+name);
		  
		  System.out.print("�������� �Է�:"); //�̰��� ���� �� ��ĳ�ʰ� �� ���ִ��� Ȯ�� ������
		  int kor = sc.nextInt(); // �Է��� ������ scanner�� ���� �о����
		  System.out.println("kor="+kor); //������ �簢���� �������϶� ���� ������ ��µ�
		  
		  System.out.print("�������� �Է�:");
		  int eng = sc.nextInt();
		  System.out.println("eng="+eng);
		  
		  System.out.print("�������� �Է�:");
		  int math = sc.nextInt();
		  //		  double math = sc.nextDouble(); //Ÿ�Ժ��� �����ؼ� ����
		  System.out.println("math="+math);
		  
		  
		  int total = kor + eng + math;
		 
		  
//		  ������ ���� ��� ���ϱ�
		  double avg = (double)total/3; //int ������ int = ���� -> ���߿� �ϳ��� double�� ����� �۾��� �ؾ���. double(8byte) ������ int(4byte) �ϸ� ū����Ʈ(double)�� �ٲ�
//		  avg = total/0.3;  ���� �ص� �� .. double avg = total/3; ���� ���� �ʰ� ����
		  System.out.printf("avg=%f\n",avg);
//		  ��� �Ҽ��� �Ʒ� 2�ڸ� ���
		  System.out.printf("avg=%.2f",avg);
		  
		  
		 
	}

}
