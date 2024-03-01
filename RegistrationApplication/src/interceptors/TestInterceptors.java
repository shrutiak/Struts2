package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptors implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("TestInterceptors destroy() called.");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("TestInterceptors init() called.");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestInterceptors Pre processing");
		String result = ai.invoke();
		System.out.println("TestInterceptors Post processing result = "+result);
		return result;
	}

}
