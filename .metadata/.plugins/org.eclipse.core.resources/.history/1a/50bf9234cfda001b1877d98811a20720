import part3.ex4.UI코드분류하기.Exam;

public class NewlecExam extends Exam {
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}
	
	
	
	public int getCom() { 
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	@Override
	
	public int total () {
		return super.total() + com;
	}
	public float avg () {
		return (float)((total())/4.0); // 같은 클래스에서 메소드 서로 호출 가능.
	}
	
} 
