package com.bhavesh16281;

import com.bhavesh16281.constructorInjection.ConstructorInjection;
import com.bhavesh16281.fieldInjection.FieldInjection;
import com.bhavesh16281.setterInjection.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
       System.out.println("---------------------Dependency Injection---------------------");

       ApplicationContext context = new ClassPathXmlApplicationContext("com/bhavesh16281/constructorConfig.xml");
       ConstructorInjection ci = (ConstructorInjection) context.getBean("constructorInjection");
       
       ApplicationContext context2 = new ClassPathXmlApplicationContext("com/bhavesh16281/setterConfig.xml");
       SetterInjection si = (SetterInjection) context2.getBean("setterInjection");
       
       ApplicationContext context3 = new ClassPathXmlApplicationContext("com/bhavesh16281/fieldInjection.xml");
       FieldInjection fi = (FieldInjection) context3.getBean("fieldInjection");
       fi.getCycleMethod();
    }
}
