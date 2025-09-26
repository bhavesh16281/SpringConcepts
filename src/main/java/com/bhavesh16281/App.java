package com.bhavesh16281;

import com.bhavesh16281.constructorInjection.ConstructorInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       System.out.println("---------------------Dependency Injection---------------------");

       ApplicationContext context = new ClassPathXmlApplicationContext("com/bhavesh16281/constructorConfig.xml");
       ConstructorInjection ci = (ConstructorInjection) context.getBean("constructorInjection");
       ci.print();
    }
}
