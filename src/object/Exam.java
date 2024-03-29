package object;

public class Exam {

	// 멤버 필드
	int no;
	String name;
	int kor;
	int eng;
	int java;
	int tot;
	double avg;
	int rank;
	
	//멤버 메서드 : 필드 출력기능 
	public void display() {
		System.out.println("번호: " +no);
		System.out.println("이름: " +name);
		System.out.println("국어: " +kor);
		System.out.println("영어: " +eng);
		System.out.println("자바: " +java);
		System.out.println("총점: " +tot);
		System.out.printf("평균: %.0f\n " ,avg);
		System.out.println("순위: " +rank);
		System.out.println();
		
	}

	public Exam(int no, String name, int kor, int eng, int java) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.java = java;
		tot = kor + eng + java;
		avg = tot / 3.0;
		rank = 1;
	}

	public Exam() {
		// TODO Auto-generated constructor stub
	}

	// ↓ 생성자 (constructor)
	public Exam(int _no, String _name) {// (매개 변수)
		// 일반적으로 생성자는 멤버필드 초기화 담당

		no = _no;
		name = _name;
		// 위와 같이 대입을 시켜줘야하는데 자동으로 해주는 기능이 있음
	}

}
