package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto33 {
	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들자
		// 1. 당첨번호 6개를 뽑는다
		// 2. 추첨번호 6개를 뽑는다
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> lottoList = new ArrayList<Integer>();
		int num = 0;
		while (list.size() < 6) {
			num = (int) (Math.random() * 45) + 1;
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		Collections.sort(list);
		System.out.println("추첨된 번호: " + list);

		long cnt = 0;
		num = 0;
		while (!list.equals(lottoList)) {
			cnt++;
			lottoList.clear(); // 2번째부터 필요
			while (lottoList.size() < 6) {
				num = (int) (Math.random() * 45) + 1;
				if (!lottoList.contains(num)) {
					lottoList.add(num);
				}
			}
			Collections.sort(lottoList);
			System.out.println("이번에 뽑힌 번호: " + lottoList);
		}
		System.out.println("추첨번호: " + list);
		System.out.println("당첨번호: " + lottoList);
		System.out.println("총 로또복권을 " + cnt * 1000 + "원 사고서야 1등에 당첨되었습니다");
	}// end main
}// end class
