package guo.spring.aopdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FireAssist {

    /*记录开火时间*/
    public void actionLog() throws Throwable{
        System.out.println("开火时间："
                + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));//格式中字母大写表示24进制
    }

    /*汇报开火完成*/
    public void reportComplete() throws Throwable{
        System.out.println("报告长官，开火完成。");
    }

}
