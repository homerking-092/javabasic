package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		//List는 생성 자료형으로 ArrayList와 LinkedList를 받을 수 있고
		//기본적으로는 ArrayList를 쓰게 된다
		//java.util의 List나 ArrayList를 사용할 수 있다
		
		//정수 자료를 받을 수 있는 리스트 생성
		List<Integer> list1 = new ArrayList<>();	//제네릭(< >)클래스에는 참조형
													//제네릭 활용하는것(List)을 A.K.A collection
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		
		//1번 인덱스 이후로 다 한 칸씩 뒤로 밀고 빈 공간에 자료 저장
		list1.add(1, 100);
		System.out.println(list1);
		
		//1번 인덱스에 든 자료를 99로 교체
		list1.set(1, 99);
		System.out.println(list1);
		
		
	}
}
