package garbage;

public class Item {
	public int num;
	
	public Item(int n) {	//생성자	
		num = n;
		System.out.println(num + "번 객체 생성");
	}
	
	//소멸자 finallize()
	//생성자는 객체가 생성될 때 반드시 호출되고
	//소멸자는 객체가 소멸될 때 호출된다
	protected void finalize() {		//소멸자
		System.out.println(num + "객체 삭제");
	}
}//end class
