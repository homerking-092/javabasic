package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Memo {
	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보자
		// 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑는다
		// 순서를 정렬해서 출력하도록 만들어라
		// ArrayList의 정렬은 .sort() 대신
		// Collections.sort(리스트);를 이용해 정렬한다

		System.out.println("<로또 번호>");
		int number = 0;
		List<Integer> lotto = new ArrayList<Integer>();
		while (lotto.size() < 6) {
			number = (int) (Math.random() * 46) + 1;
			if (!lotto.contains(number)) {
				lotto.add(number);
			}
		}
		Collections.sort(lotto);
		System.out.println(lotto);
		number = 0;
		boolean bool = true;
		while (bool) {
			number = (int) (Math.random() * 46) + 1;
			if (!lotto.contains(number)) {
				System.out.printf("<2등 당첨 번호>\n%d", number);
				bool = false;
			}
		}
	}// end main
}// end class
