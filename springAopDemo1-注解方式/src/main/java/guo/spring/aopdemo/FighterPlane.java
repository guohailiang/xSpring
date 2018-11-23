package guo.spring.aopdemo;

import org.springframework.stereotype.Component;

/**
 * 用注解方式将Fireable的实现类注册到容器
 *
 * @Component注解的解释如下：
 *（把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
 * 泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
 * 案例：
 * <context:component-scan base-package=”com.*”>
 * 上面的这个例子是引入Component组件的例子，其中base-package表示为需要扫描的所有子包。
 * 共同点：被@controller 、@service、@repository 、@component 注解的类，都会把这些类纳入进spring容器中进行管理
 */
@Component
public class FighterPlane implements Fireable {
    public int attack(Object obj) {
        System.out.println("飞机开火：伤害200点。");
        return 200;
    }
}
