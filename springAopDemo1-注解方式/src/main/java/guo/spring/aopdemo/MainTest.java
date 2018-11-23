/*
 **********************************************************
 * Time    : 2018/11/23
 * Author  : Michael Guo
 * Project : springAopDemo-annotation
 * Class   : MainTest
 * Contact : XXXXXX@gmail.com
 * Software: Idea
 * Version : V1.0
 * Desc    : 基于注解方式实现Spring AOP
 * Logs    :
 ***********************************************************
 */
package guo.spring.aopdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        /**
         * new一个xml解释类对象，指定xml文件路径
         * maven项目时，需要把xml文件放在resources文件夹下面
         */
        Object tempTarget = new Object();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        /**
         * 1.通过xml中声明的类id获取该类的对象，实现spring的控制反转（IOC）思想
         * 2.如果通过FighterPlane，Tank类的类型定义，在AOP编程时会报接口已经被用户实现了的
         * 错误；因此需要用Fireable接口类型定义。
         */
        //FighterPlane fighterPlane = (FighterPlane) context.getBean("fighterPlane");
        //Tank tank = (Tank) context.getBean("tank");

        /*"接口名.class"表示类加载器的一个方法，加载指定的类名，属于接口的反射机制*/
        Fireable fighterPlane = context.getBean("fighterPlane",Fireable.class);
        Fireable tank = context.getBean("tank",Fireable.class);

        fighterPlane.attack(tempTarget);
        tank.attack(tempTarget);
    }
}
