package day12;

public class TestClass02 {
	private String str; //private: 정보은닉 //같은 위치에서는 접근이 가능
	private int num;
	private String name;

	//setter: 값을 설정
	public void setStr() {} //합성어 첫번째 글자는 대문자 //set변수
	public void setNum() {}
	public void setName() {}
	
	//getter: 값을 얻어옴
	public void getStr() {}
	
	public void setting(String s) {
		str = s;
	}
	
	public String getter() {
		return str;
	}

}
