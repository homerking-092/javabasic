package inheritance;

public class Main2 {
	public static void main(String[] args) {
		//Salary, Student 하나씩 만들고 호출 ㄱㄱ
		Student s = new Student();
		s.name = "소능민";
		s.age = 20;
		s.major = "컴공";
		s.getStudentInfo();

		System.out.println("-----------------");
		Salaryman sm = new Salaryman();
		sm.name = "손흥민";
		sm.age = 30;
		sm.salary = 500000000;
		sm.upSalary();		//연봉 추가
		sm.getSalaryInfo();
	}
}//end class
