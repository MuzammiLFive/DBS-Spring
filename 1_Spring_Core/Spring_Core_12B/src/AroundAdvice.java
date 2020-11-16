import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		Object obj;
		System.out.println("Before logic");
		obj = mi.proceed();
		System.out.println("After logic");
		return obj;
	}

}
