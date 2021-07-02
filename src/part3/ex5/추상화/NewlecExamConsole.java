package part3.ex5.추상화;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	@Override
	protected ExamList makeList() {
		return new NewlecExamList();
	}

	@Override
	protected void onInput(int size,Exam exam) {
		Scanner scan = new Scanner(System.in);
		NewlecExam newlecExam = (NewlecExam)exam;
		// 같은 객체를 가리키는 것. 형식만 비뀌었을 뿐.
		int com;
		do {
			System.out.printf("학생%d 컴퓨터 성적 입력 :",size+1);
			com = scan.nextInt();
			if (com>100 || com<0) {
				System.out.println("입력 범위 초과");
		}
		} while (com>100 || com<0);
		newlecExam.setCom(com); 
		
	}


	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam; //자료 형식 변환.
		int com = newlecExam.getCom();
		System.out.printf("Computer : %d\n", com );
		
		
	}

	
}
 