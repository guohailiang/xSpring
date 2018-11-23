package guo.spring.aopdemo;

import org.springframework.stereotype.Component;

/**
 * 第一步：用注解方式将Fireable的实现类注册到容器
 */
@Component
public class Tank implements Fireable {
    public int attack(Object obj){
        System.out.println("坦克开火：伤害100点。");
        return 100;
    }
}
