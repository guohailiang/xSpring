package guo.spring.aopdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FireAssist {

    /*记录开火时间*/
    public void actionLog() throws Throwable{
        System.out.println("开火时间："
                + (new SimpleDateFormat("yyyy-mm-dd hh:MM:ss").format(new Date())));
    }

    /*汇报开火完成*/
    public void reportComplete() throws Throwable{
        System.out.println("报告长官，开火完成。");
    }

}
