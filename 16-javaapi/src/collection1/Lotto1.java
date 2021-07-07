package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto1 {
	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보자
		// 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑는다
		// 순서를 정렬해서 출력하도록 만들어라
		// ArrayList의 정렬은 .sort() 대신
		// Collections.sort(리스트);를 이용해 정렬한다

		List<Integer> list = new ArrayList<Integer>();
		int num = 0;
		while (list.size() < 6) {
			num = (int) (Math.random() * 45) + 1;
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		Collections.sort(list);
		System.out.println(list);
//		num = 0;
		boolean bl = true;
		while (bl) {
			num = (int) (Math.random() * 45) + 1;
			if (!list.contains(num)) {
				System.out.println("2등 번호: " + num);
				bl = false;
			}
		}

//		for (int i = 0; i <= 5; i++) {
//			int lottoNum = (int)(Math.random() * 46) + 1;
//			for (int j = 0; j <= 5; j++) {
//				
//			}
//		}
	}// end main
}// end class
