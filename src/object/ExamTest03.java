package object;

public class ExamTest03 {

	public static void main(String[] args) {
	 //
	
		Exam[]ex=new Exam[3]; //Exam타입의 배열 변수 ex
		ex[0]=new Exam(1, "김종민", 80, 85, 88);
		System.out.println(ex[0].no);
		System.out.println(ex[0].name);
		System.out.println(ex[0].kor);
		System.out.println(ex[0].eng);
		System.out.println(ex[0].java);
		System.out.println(ex[0].tot);
		System.out.println(ex[0].avg);
		System.out.println(ex[0].rank);
		
		ex[1]=new Exam(2,"여름");
		
		ex[2]=new Exam(3,"몽여름",98,90,100);
		System.out.println(ex[2].toString());
		System.out.println(ex[2]);
		
		
		
	}

}
