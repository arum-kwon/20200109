package methodExam;

public class MainApp {

	public static void main(String[] args) {
		MethodCall callbycall = new MethodCall();
		callbycall.run();
		int a = 5;
		double b = 1.5;
		double x = sum(a, b);
		System.out.println(x);
	}
	
	static double sum(double a, double b) {
		return a+b;
	}

}
