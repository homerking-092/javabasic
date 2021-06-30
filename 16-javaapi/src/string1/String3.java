package string1;

import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		//Scanner를 통해서 전체 문장을 입력받아라
		//다음으로 문장 내에서 찾고싶은 단어를 입력받아라
		//문장내에 있는 단어들의 인덱스 번호와 몇 개가 검출되었는지
		//출력해주는 코드를 ㄱㄱ
		Scanner scan = new Scanner(System.in);
		System.out.print("전체 문장을 입력해주세요: ");
		String all = scan.nextLine();
		System.out.print("문장 내에서 카운트 할 단어를 입력해주세요: ");
		String voca = scan.nextLine();
		
		//길이가 정해지지 않았을 때 for보다 while
		//갯수 카운팅
		int cnt = 0;
		boolean bool = true;	//반복문 추가 실행 여부
		int fidx = -1;			//마지막으로 발견된 지점
		while (bool) {	
			int get = all.indexOf(voca, fidx + 1);
			if (get == -1) {	//더 이상 검출이 안되는 조건	////////////////
				bool = false;
			}else {
				fidx = get;	//이번에 얻은 번지수 저장
				cnt++; 		
				System.out.println(get + "번에서 " + cnt + "번째 " + voca + "가 검출되었습니다"  );
			}
		}
		System.out.println(voca + "의 총 출현 횟수는 " + cnt + "회입니다");
		
		
//		int getAll = all.indexOf("so", 1);
//		System.out.println(getAll);
//		
//		int getVoca = voca.indexOf("ds");
//		System.out.println(getVoca);
//		
	}
}
