package guo.spring.aopdemo;

public class Tank implements Fireable {
    public int attack(Object obj){
        System.out.println("坦克开火：伤害100点。");
        return 100;
    }
}
