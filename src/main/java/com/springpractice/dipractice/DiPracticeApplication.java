package com.springpractice.dipractice;

import com.springpractice.dipractice.controller.ConstructorInjectedController;
import com.springpractice.dipractice.controller.MyController;
import com.springpractice.dipractice.controller.PropertyInjectedController;
import com.springpractice.dipractice.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiPracticeApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiPracticeApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();

        System.out.println(myController.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

    }

}
