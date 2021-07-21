package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto3 {
	public static void main(String[] args) {
		//로또복권 당첨 시뮬레이터를 만들자
		//1. 당첨번호 6개를 뽑는다
		//2. 추첨번호 6개를 뽑는다
		//3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		//4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
		//이어서 비교해서 일치여부 검사
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		int num = 0;
		///추첨 번호
		while (l1.size() < 6) {
			num = (int) (Math.random() * 45) + 1;
			if (!l1.contains(num)) {
				l1.add(num);
			}
		}
		Collections.sort(l1);
		
		//당첨 번호
		while (l2.size() < 6) {
			num = (int) (Math.random() * 45) + 1;
			if (!l2.contains(num)) {
				l2.add(num);
			}
		}
		Collections.sort(l2);
		
		
		long cnt = 0;
		int num3 = 0;
		List<Integer> l3 = new ArrayList<Integer>();
		boolean bool = true;
		while (bool) {
			if (l1.equals(l2)) {
				bool = false;
			}else if (!l1.equals(l2)) {
				cnt++;
				num3 = (int) (Math.random() * 45) + 1;
				l3.add(num);
				System.out.println("이번에 뽑힌 번호: " + l3);
			}
		}
		System.out.println("추첨 번호: " + l1);
		System.out.println("당첨 번호: " + l2);
		System.out.println("총 로또복권을 " + cnt * 1000 + "원 사고서야 1등에 당첨되었습니다");
	}//end main
}//end class
