package stringbuilder1;

public class Builder3 {
	public static void main(String[] args) {
		//Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제한다
		//Delete(시작인덱스, 끝인덱스)를 입력하면
		//시작지점부터 끝지점 사이를 삭제해준다
		StringBuilder a = new StringBuilder("qwertrasdsa");
		System.out.println(a);
		a.delete(3, 10);	//앞은 포함 뒤는 불포함
		System.out.println(a);
	}
}
