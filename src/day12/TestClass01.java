package day12;

public class TestClass01 {
	public String str="인스턴스";//= this.str
	
	public void setStr() {
		String str;
		str = "문자열";
		//System.out.println(str); //안쪽의 값이 우선시 된다.
		System.out.println(this.str); //자기자신에 대한 정보를 출력
	}
	
	public void func() {
		System.out.println("func 실행");
		System.out.println(this);
		this.func02();//t = this
	}
	
	public void func02() {
		System.out.println("func02 실행");
	}
	
	public void func03() {
		System.out.println(str);
	}
	
	public void func04() {
		this.str = "반갑습니다";
		func03();
	}

}
