package com.bhavesh16281;

import com.bhavesh16281.applicationContextIOC.ApplicationContextIOC;
import com.bhavesh16281.constructorInjection.ConstructorInjection;
import com.bhavesh16281.setterInjection.SetterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App
{
    public static void main( String[] args )
    {
       System.out.println("---------------------Dependency Injection---------------------");

       ApplicationContext context = new ClassPathXmlApplicationContext("com/bhavesh16281/constructorConfig.xml");
       ConstructorInjection ci = (ConstructorInjection) context.getBean("constructorInjection");
       
       ApplicationContext context2 = new ClassPathXmlApplicationContext("com/bhavesh16281/setterConfig.xml");
       SetterInjection si = (SetterInjection) context2.getBean("setterInjection");
       
       System.out.println();
       System.out.println("---------------------Inversion of Control (IOC) container---------------------");
       System.out.println("1. Bean Factory: ");
       System.out.println("        Bean Factory is the siple container used to create and manage spring beans lazily(i.e only when needed.)");
       System.out.println("        This is depiricated and we have to use ApplicationContext instead of BeanFactory.");
       /* BeanFactory is depricated, hence the below code will not work
       Resource resource = new ClassPathResource("com/bhavesh16281/constructorConfig.xml");
       BeanFactory factory = new XmlBeanFactory(resource);
       ConstructorInjection ci2 = (ConstructorInjection) factory.getBean("constructorInjection");
		*/
       System.out.println("2. Application Context: ");
       ApplicationContext context3 = new ClassPathXmlApplicationContext("com/bhavesh16281/applicationContextIOC.xml");
       ApplicationContextIOC ci2 = (ApplicationContextIOC) context3.getBean("appContext");
       
    }
}
