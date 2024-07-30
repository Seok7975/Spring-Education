package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		//Exam exam = new NewlecExam();
		
		// exam을 조립하여 사용 => DI
		
////////////////////////////////////////////////////////////////////////////////////////////		
//		  ExamConsole console = new InlineExamConsole(exam); // exam을 매개변수로 전달해 생성자로
//		  ExamConsole console = new InlineExamConsole();	// 매개변수 없이 생성
		  
		  //ExamConsole console = new GridExamConsole(exam);
//		  console.setExam(exam);
//		  console.print();
////////////////////////////////////////////////////////////////////////////////////////////
		 
		//스프링에게 지시하는 방법으로 코드를 변경		
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
//				new ClassPathXmlApplicationContext("classpath:setting.xml");
		
//		Exam exam = context.getBean(Exam.class);  // 자료형으로 가져오기
//		System.out.println(exam.toString());
		
//		ExamConsole console = (ExamConsole) context.getBean("console"); // 이름으로 가져오기
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams"); // new ArrayList<>();
//		exams.add(new NewlecExam(1,1,1,1));
		
		
//		for(Exam e : exams) {
//			System.out.println(e);
//		}
	}
}



/* 코드로 하면 수정이 여간 귀찮은게 아님. 객체 생성 하는 부분을 비워주고, 대신 해줄 수 있는 작업을 해주는 게 스프링 */