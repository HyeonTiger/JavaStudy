
public class PersonInfo {

	public static void showPersonInfo() {
		/*
	    �������� ��� ����.
	    
	    �̸�(����)  String"����"
	    ����(����)  int 25
	    ����(����)  char"��"
	    ����(�Ǽ�)  double"183.2"
	    ������(�Ǽ�) double"80.56"
	    ��ȥ����(�Ǻ�) boolean"false"
	    ��ȭ��ȣ(����) String"010-5099-2133"
	    �ּ�(����) String"���������� �߱� ��ε� �񿵺���"

	    */
	    String name = "����";
	    int age = 25;
	    char gender = '��';
	    double higher = 183.2;
	    float weight = 80.56F;
	    boolean married = false;
	    String phone = "010-5099-2133";
	    String address = "���������� �߱� ��ε� �񿵺���";

	    System.out.println("�̸�: " + name + "\n����: " + age + "\n����: " + gender+"\nŰ: " + higher +"\n������: " + weight + "\n��ȥ����: "+ married + "\n��ȭ��ȣ: " +phone+"\n�ּ�: " + address);
	    /*System.out.println("����: " + age);
	    System.out.println("����: " + gender);
	    System.out.println("Ű: " + higher);
	    System.out.println("����: " + weight);
	    System.out.println("��ȥ����: " + married);
	    System.out.println("��ȭ��ȣ: " + phone);
	    System.out.println("�ּ�: " + address);
	*/
	}

}
