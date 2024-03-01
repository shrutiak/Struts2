package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AgeGroupInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("AgeGroupInterceptor destroy() called.");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("AgeGroupInterceptor init() called.");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("AgeGroupInterceptor Pre processing");
		
		ValueStack stack = ai.getStack();
		Integer age = (Integer) stack.findValue("age");
		System.out.println("age = "+age);
		String ageGroup = "";
		
		if(age<18 && age>0)
			ageGroup = "Child";
		else if(age>=18 && age<50)
			ageGroup = "Adult";
		else
			ageGroup = "Senior";

		stack.set("age", age+" ("+ageGroup+") ");
		System.out.println("ageGroup added as "+ageGroup);
		
		String result = ai.invoke();
		System.out.println("AgeGroupInterceptor Post processing result = "+result);
		return result;
	}

}
