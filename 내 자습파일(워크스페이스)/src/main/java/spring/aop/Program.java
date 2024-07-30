package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		
		Exam exam = (Exam) context.getBean("exam"); // 원래 업무  
		
		System.out.printf("total is %d\n", exam.total());
		System.out.printf("avg is %f\n", exam.avg());
		
//		Exam proxy =  (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(),
//				new Class[] {Exam.class}, 
//				new InvocationHandler() {
//
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//
//						// 곁다리 업무 사이에 실제 업무를 호출, 곁다리 업무를 뺐다 꼽았다 느낌으루
//						long start = System.currentTimeMillis();
//						
//						Object result = method.invoke(exam, args);
//						
//						long end = System.currentTimeMillis();
//						String message = (end - start) + "ms 시간이 걸렸습니다.";
//						System.out.println(message);
//						
//						return result;
//					}
//				}); // 곁다리 업무
		
//		System.out.printf("total is %d\n", proxy.total());
//		System.out.printf("avg is %f\n", proxy.avg());

	}

}
