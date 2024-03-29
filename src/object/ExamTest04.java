package object;

public class ExamTest04 {

	public static void main(String[] args) {
	 //
	
		Exam[]ex=new Exam[3]; //Exam타입의 배열 변수 ex
		ex[0]=new Exam(1, "김종민", 80, 85, 88);
		ex[0].display(); //메서드를 사용하면 매번만드는것이 아닌 한번만 만들어 사용가능 
		
		ex[1]=new Exam(2,"여름",100,90,98);
		ex[1].display();
		
		ex[2]=new Exam(3,"몽여름",98,90,100);
		ex[2].display();
		
		
	}

}
