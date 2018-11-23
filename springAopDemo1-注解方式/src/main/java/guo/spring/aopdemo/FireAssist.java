package guo.spring.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 第二步：通过注解为FireAssist类配置横切逻辑
 * 在@Aspect声明该类是一个切面；@Before表示方法为前置before通知，
 * 在@After表示后置After通知，通过参数execution声明一个切点。
 *
 */
@Component
@Aspect
public class FireAssist {

    /*记录开火时间*/
    @Before("execution(* *.attack(..))")
    public void actionLog() throws Throwable{
        System.out.println("开火时间："
                + (new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(new Date())));
    }

    @After("execution(* *.attack(..))")
    /*汇报开火完成*/
    public void reportComplete() throws Throwable{
        System.out.println("报告长官，开火完成。");
    }

}
