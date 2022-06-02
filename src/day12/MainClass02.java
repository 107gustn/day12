package day12;

/*
private
- 정보은닉(외부로부터 정보를 숨김)
- 외부의 접근을 막음
- 내부에서만 접근이 가능
*/
public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		//t.str = "안녕하세요";
		
		t.setting("홍길동");
		String s = t.getter();
		System.out.println( s );

	}

}
