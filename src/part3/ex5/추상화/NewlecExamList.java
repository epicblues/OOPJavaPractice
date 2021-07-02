package part3.ex5.추상화;

public class NewlecExamList extends ExamList{

	@Override
	protected Exam[] makeExams(int size) {
			return new NewlecExam[size];
	}

	@Override
	public void add(Exam exam) {
		if(super.exams.length == current) { // 공간 늘리기 작업 3단위.
			Exam[] tempExams = new NewlecExam[current+3];
			for (int i=0; i<current;i++) {
				tempExams[i] = exams[i];
			}
			exams = tempExams; //참조하지 않는 값 기존의 exams는 garbage화.
		}	
		exams[current] = exam;
		current++;
		
	} 

}
