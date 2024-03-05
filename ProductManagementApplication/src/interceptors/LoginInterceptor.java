package interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import action.LoginAction;
import action.SignInAction;
import action.WelcomeAction;

public class LoginInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor destroy() called.");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor init() called.");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor intercept() called.");
		
		Object user = ServletActionContext.getRequest().getSession().getAttribute("loggedinUser");
		Class currentClass = ai.getAction().getClass();
		System.out.println("user = "+user+" Class = "+currentClass.getName());
		if(null == user)
		{
			if(currentClass.equals(LoginAction.class))
				{
					return ai.invoke();
				}
			else if(currentClass.equals(WelcomeAction.class))
				{
					return ai.invoke();
				}
			else if(currentClass.equals(SignInAction.class))
				{
					return ai.invoke();
				}
				
			return "input";
		}
		return ai.invoke();
	}

}
