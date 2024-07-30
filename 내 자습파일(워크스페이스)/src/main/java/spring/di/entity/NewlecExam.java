package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewlecExam implements Exam {

	@Value("20")
	private int kor;
	
	@Value("30")
	private int eng;
	private int math;
	private int com;


	// 기본 생성자 => property, p태그 : 내부적으로 setter 메서드를 사용해 속성 값을 설정
	public NewlecExam() {
		
	}
	
	// 매개변수를 받는 생성자, 생성자 Overload => constructor-arg
//	public NewlecExam(int kor, int eng, int math, int com) {
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.com = com;
//	}

	
	// getter & setter  => property(setter메서드), p태그(setter메서드)
///////////////////////////////////////////////
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
///////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}


	@Override
	public int total() {

		System.out.println("Current kor value: " + kor);  // 추가된 로그
		int result = kor + eng + math + com;
		
		if (kor > 100) {
			throw new IllegalArgumentException("유효하지 않은 국어점수");
			
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public float avg() {

		return total() / 4.0f;
	}

}



/*

기본 생성자가 없어도 에러가 나지 않는 이유:
Java에서는 클래스에 명시적으로 생성자를 정의하지 않으면, 
컴파일러가 자동으로 기본 생성자(매개변수가 없는 생성자)를 생성합니다. 
이를 "암시적 기본 생성자(Implicit Default Constructor)"라고 합니다.

따라서, 만약 당신이 NewlecExam 클래스에 어떤 생성자도 명시적으로 정의하지 않았다면, 
Java 컴파일러가 자동으로 기본 생성자를 추가해줍니다. 이 때문에 property 방식을 사용할 때 에러가 발생하지 않은 것입니다.

주의할 점:
하지만 클래스에 매개변수를 가진 생성자를 하나라도 명시적으로 정의하면, 
컴파일러는 더 이상 기본 생성자를 자동으로 생성하지 않습니다. 이 경우에는 기본 생성자를 직접 작성해야 합니다.
*/
