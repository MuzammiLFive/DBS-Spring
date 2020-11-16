import org.springframework.aop.ThrowsAdvice;

public class ThrowsMethod implements ThrowsAdvice{
	public void afterThrowing(Exception Ex) {
		System.out.println("Additional concern if exception occurs");
	}
}
