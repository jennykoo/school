
public class Ex02_������_ {
	public static void main(String[] args) {

		System.out.println(10);

		int a; //����
		int b;
		a = 1; //�ʱ�ȭ
		b = 2;
		// ����� �ʱ�ȭ�� ������ �ٲٸ� �ȵ�. 1.���� 2. �ʱ�ȭ	
		int c = 3; //�ѹ��� ����
		// int a,b;
		// int b; -> �ߺ����� �����ϸ� ���� ��

		System.out.println('a');
		System.out.println("a");
		System.out.println(a);
		System.out.println(a+a+a);
		System.out.println(a+10);
		System.out.println("a="+a); //���ڿ�+����, a=1 �� ��µ� "a="a �� �ƴ�
		System.out.println("a+b="+(a+b)); 		


		System.out.println();

		byte b1 = 10;
		byte b2 = 20;
		byte b3; //-128~127

		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		//		System.out.println("b3="+b3);

		//b3 = b1 + b2; //b3 = 30; -> b+b =int�� ��ȯ�ǹǷ� �ȵ�
		int result;
		result = b1 + b2;
		System.out.println("result="+result);
		
		int i1 = 1000000;
		int i2 = 2000000;
		//int i3 = i1*i2; //2�� (long)
		//System.out.println("i3="+i3); //-> �߸��ƴµ� ������ �ȳ��� �����Ѱ��� ���� -> ������
		// long i3 = i1*i2; //int*int ->����
		long i3 = (long)i1 * i2; //-> ��� long���� �ٲٴ� ����
		System.out.println("i3="+i3);
		
		


	}	
}
