package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	public static void main(String[] args) {
		//식당 메뉴판을 만들어보자
		//key는 음식이름, value는 가격(정수)로 저장
		//메뉴는 5개 이상
		//메뉴를 3개 조회해서 화면에 출력
		
		Map<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("제육", 7000);
		menu.put("김밥", 2000);
		menu.put("라면", 3000);
		menu.put("비냉", 6000);
		menu.put("물냉", 6000);
		System.out.println(menu);
		
		System.out.println(menu.get("제육"));
		System.out.println(menu.get("김밥"));
		System.out.println(menu.get("라면"));
	}
}
