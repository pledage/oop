package thread;

public class ThreadStateExam {

	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();

	}

}
