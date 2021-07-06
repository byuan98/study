package exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionHandler implements HandlerExceptionResolver{
    public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse resp, Object obj, Exception e) {
        System.out.println(obj+"::"+obj.getClass());//obj为出现异常的方法对象
        if(e instanceof LoginException || e instanceof RegistrException) {
            ModelAndView mav=new ModelAndView();
            mav.addObject("errorMessage", e.getMessage());
            mav.addObject("error", e);
            
            mav.setViewName("error");//设置view的名字(要跳转的页面名)
            return mav;
        }
        return null;
    }

}
