
public class Ex04_�Ǽ��� {
	public static void main(String[] args) {
		
		//float f1 = 1.234; // �Ǽ��� �⺻������ double�� ������
		float f1 = 1.234f; //���� f�� �ٿ���ߵ� (��,�빮�� ����)
		
		double d1 = 1.234; //�Ⱦ��� double���� ��, 1.234d �� �ٿ��� ����
		double d2 = 1.234f;// ������->ū�Ϳ� �ִ°� ����

		System.out.println("f1="+f1);
		System.out.println("d1="+d1);
		System.out.println("d2="+d2); // ������-> ū�Ϳ� �������� ������� �ణ�� ������ �߻��ϱ� ������ �ǵ��� �����ϰ� ��Ȯ�ϰ� ����
		
		float f2 = 123; //float:4btye, int 123:4btye
		System.out.println("f2="+f2);
//		int i1 = 123.4f; //���� 4����Ʈ���� int�� float�� ���� �������� float �� �� ũ�ٰ� �ν��ؼ� ������ ��.
		int i1 = (int)123.4f; //������ int�� �ٲ۰���, �� ��츦 ĳ�����ߴٰ� ǥ����
		System.out.println("i1="+i1); 
		
		double d3 = .789E3; //0.789*10�� 3��
		System.out.println("d3="+d3); //
		
		d3 = .789E-3;
		System.out.println("d3="+d3);
		
		
		int a = 100;
		char b = 'A';
		float c = 123.456f;
		String d = "������"; //ū ����ǥ�� �ѷ��� ���ڿ��� String ���� . (�⺻ ���ڿ����� ����x)
		
		/*
		 ���Ĺ���
		 * ����: %d 
		 * char: %c
		 * string: %s
		 * �Ǽ�: %f
		 */
		
		System.out.printf("a="+a); //f�� ����, ������ �����ϰ������ ���
		System.out.println();
		System.out.printf("a=%d",a); //��ǥ, a��� ���� =������ ��µǴ°���
		System.out.println();
		System.out.printf("a=%d�Դϴ�.\n",a); //��ǥ, a��� ���� =������ ��µǴ°��� , \n�� ����
		System.out.printf("a=%5d�Դϴ�.\n",a); //5�ڸ����� ����϶�¶� -> 100�̶� �տ� ���� 2���� ����
		System.out.printf("b=%c�Դϴ�.\n",b);
		System.out.printf("b=%d�Դϴ�.\n",(int)b);
		System.out.printf("c=%f�Դϴ�.\n",c);
		System.out.printf("c=%.2f�Դϴ�.\n",c); //�Ҽ��� �� 2�ڸ������� ����϶�� �� (�ݿø���)
		System.out.printf("c=%8.2f�Դϴ�.\n",c); //8�ڸ��� ����ض�, �Ҽ����� 2�ڸ����� ����ض�. (���ݸ��⶧ ���)
		System.out.printf("d=%s�Դϴ�.\n",d);
		
	
	}
	

	    
}
