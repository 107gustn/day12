package day12;

public class TestClass01 {
	public String str="�ν��Ͻ�";//= this.str
	
	public void setStr() {
		String str;
		str = "���ڿ�";
		//System.out.println(str); //������ ���� �켱�� �ȴ�.
		System.out.println(this.str); //�ڱ��ڽſ� ���� ������ ���
	}
	
	public void func() {
		System.out.println("func ����");
		System.out.println(this);
		this.func02();//t = this
	}
	
	public void func02() {
		System.out.println("func02 ����");
	}
	
	public void func03() {
		System.out.println(str);
	}
	
	public void func04() {
		this.str = "�ݰ����ϴ�";
		func03();
	}

}
