package part3.ex6.인터페이스;

public class A {
	
	private X x; // 이때 변수 x가 참조하는 객체는 null 생성자 메소드가 default 상태이기 때문이다.
	
	
	public void setX(X x) {
		this.x = x; // 비로소 변수 x가 구체화되는 시점.
	}


 
	public void print() {
		 int total = x.total();
		 System.out.printf("total is %d",total);
		
	}
	 
} 
