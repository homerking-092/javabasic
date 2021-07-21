package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto18 {
	public static void main(String[] args) {
		//로또복권 추첨기
		//로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑는다
		
		 List<Integer> list = new ArrayList<Integer>();
		 int num = 0;
		 while (list.size() < 6) {
			num = (int)(Math.random() * 45) + 1;
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		 Collections.sort(list);
		 System.out.println(list);
		 
		 
		 boolean bl = true;
		 while (bl) {
			 num = (int)(Math.random() * 45) + 1;
			 if (!list.contains(num)) {
				System.out.println("2등 추첨번호: " + num);
				bl = false;
			}
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}//end main
}//end class
