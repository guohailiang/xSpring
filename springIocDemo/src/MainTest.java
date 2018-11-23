import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        /**
         * 非spring化的业务代码
         */
//        HelloWorld hw = new HelloWorld();
//        hw.setName("Spring");
//        hw.sayHello();

        /**
         * new一个xml解释类对象，指定xml文件路径
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        /**
         * MainTest类需要调用HelloWorld类对象时，并不是直接通过new创建，
         * 而是通过xml中声明的“类id（字符串）”从Spring容器中获取HelloWorld类的对象，实现spring的控制反转（IOC）思想
         */
        HelloWorld hw = (HelloWorld) context.getBean("hw");
        hw.sayHello();

    }
}
