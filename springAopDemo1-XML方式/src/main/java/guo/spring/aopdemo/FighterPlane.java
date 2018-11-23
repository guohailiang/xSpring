package guo.spring.aopdemo;

public class FighterPlane implements Fireable {
    public int attack(Object obj) {
        System.out.println("飞机开火：伤害200点。");
        return 200;
    }
}
