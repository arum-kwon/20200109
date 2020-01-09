package methodExam;

public class MethodCall {
	
	public void run() {
		ExamMethod exam = new ExamMethod();
		exam.exam01();
		System.out.println("안녕하세요. 반가워요. exam.exam01는 리턴 타입이 없는 메소드입니다.");
		
		int a = 6;
		int b = 9;
		int x = exam.sum(a, b);
		int y = exam.sum(10, 5);
		System.out.println("x와 y의 값은 각각 " + x + ", " + y + "입니다.");
		
		int resultMethod = exam.sum(x , y);
		System.out.println("그 결과를 한 번 더 exam.sum의 매개 변수로 메서드를 실행합니다. " + resultMethod);
		
		String hello = exam.str();
		System.out.println("exam.str는 매개 변수 없이 정해진 동작만 실행하고 값을 반환합니다. " + hello);
	}
}
