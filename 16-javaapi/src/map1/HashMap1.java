package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		//Map 자료형의 대표 자료형은 HashMap이다
		//제네릭 내부에는 <Key 자료형, value 자료형>으로 작성한다
		Map<String, String> map = new HashMap<String, String>();
		map.put("김영훈", "자바");
		map.put("손흥민", "JSP");
		map.put("음바페", "축신");
		System.out.println(map);
		
		//자료조회시는 .get(키값)으로 조회한다
		System.out.println(map.get("음바페"));
		//map은 키로 벨류를 조회하는건 가능하지만 역은 불가능
		System.out.println(map.get("축신"));
		System.out.println(map.get(0));	//인덱스번호 존재 X
		
		//기본적으로 map 자료형은 조회도 key 중심으로 이뤄진다
		// .containsKey()는 해당 키값이 자료내에 존재하는지 확인
		System.out.println(map.containsKey("음바페"));
		System.out.println(map.containsKey("황가드"));
		
		//remove는 key를 이용해서 key = value 전체를 삭제한다
		map.remove("음바페");
		System.out.println(map);
		
		// .size()는 크기를 알려준다 정수로 몇 개의 key = value
		//쌍이 저장되어 있는지 확인할 수 있다
		System.out.println(map.size());
		
		
		
	}
}
