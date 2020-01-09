package methodExam;

public class ExamMethod {
	public void exam01() {
		System.out.println("리턴 타입이 없는 기본 메소드 입니다.");
	}
	public int sum(int n, int m) {
		System.out.println("perameter 2, Add to each other, return int");
		int result = n+m;
		return result;
	}
	public String str() {
		System.out.println("only return");
		String msg = "return Message";
		return msg;
	}
}
