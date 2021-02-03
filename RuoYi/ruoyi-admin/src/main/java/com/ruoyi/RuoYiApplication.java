package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author zhangwei
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  MSE系统启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "   __      __ ______  _____     \n" +
                "  |  \\    /  |  ____|/ ____|    \n" +
                "  |   \\  /   | |__  | (___      \n" +
                "  |  | \\/ |  |  __|  \\__  \\     \n" +
                "  |  |    |  | |____ ____) |    \n" +
                "  |__|    |__|______|_____/    "
               );


    }
}