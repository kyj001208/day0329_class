package object;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ExamTest01 {

	public static void main(String[] args) {
		// 5명 시험 정보
		//Exam[] exam=new Exam[5];
		
		Exam ex=new Exam();//클래스로부터 객체 생성

		
		System.out.println("번호"+ ex.no); //. 멤버 접근 연산자
		System.out.println("이름"+ ex.name);
		System.out.println("국어"+ ex.kor);
		System.out.println("영어"+ ex.eng);
		System.out.println("자바"+ ex.java);
		System.out.println("총점"+ ex.tot);
		System.out.println("평균"+ ex.avg);
		System.out.println("순위"+ ex.rank);
		
		
		System.out.println();
		ex.no=1;
		ex.name="몽여름";
		ex.kor=100;
		ex.eng=95;
		ex.java=80;
		ex.tot=ex.kor+ex.eng+ex.java;
		ex.avg=ex.tot/3.0;
		ex.rank=1;
		
		System.out.println("번호: "+ ex.no); //. 멤버 접근 연산자
		System.out.println("이름: "+ ex.name);
		System.out.println("국어: "+ ex.kor);
		System.out.println("영어: "+ ex.eng);
		System.out.println("자바: "+ ex.java);
		System.out.println("총점: "+ ex.tot);
		System.out.println("평균: "+ ex.avg);
		System.out.println("순위: "+ ex.rank);
		
	}
	
}
