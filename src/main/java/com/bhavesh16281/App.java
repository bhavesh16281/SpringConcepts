package com.bhavesh16281;

import com.bhavesh16281.applicationContextIOC.ApplicationContextIOC;
import com.bhavesh16281.applicationContextIOC.Mobile;
import com.bhavesh16281.beanFactoryIOC.BeanFactoryIOC;
import com.bhavesh16281.IOC.*;
import com.bhavesh16281.constructorInjection.ConstructorInjection;
import com.bhavesh16281.setterInjection.SetterInjection;
import com.bhavesh16281.springAnnotations.AC;
import com.bhavesh16281.springAnnotations.BeanAnnotation;
import com.bhavesh16281.springAnnotations.Book;
import com.bhavesh16281.springAnnotations.Cat;
import com.bhavesh16281.springAnnotations.ComponentAnnotation;
import com.bhavesh16281.springAnnotations.ComponentScanAnnotation;
import com.bhavesh16281.springAnnotations.ConfigurationAnnotation;
import com.bhavesh16281.springAnnotations.ControllerAnnotation;
import com.bhavesh16281.springAnnotations.Dog;
import com.bhavesh16281.springAnnotations.Gym;
import com.bhavesh16281.springAnnotations.Heart;
import com.bhavesh16281.springAnnotations.House;
import com.bhavesh16281.springAnnotations.MobilePhone;
import com.bhavesh16281.springAnnotations.Pen;
import com.bhavesh16281.springAnnotations.Pencil;
import com.bhavesh16281.springAnnotations.QualifierAnnotation;
import com.bhavesh16281.springAnnotations.QualifierTest;
import com.bhavesh16281.springAnnotations.RepositoryAnnotation;
import com.bhavesh16281.springAnnotations.ServiceAnnotation;
import com.bhavesh16281.springAnnotations.Sky;
import com.bhavesh16281.springAnnotations.Student;
import com.bhavesh16281.springAnnotations.TV;
import com.bhavesh16281.springAnnotations.Teacher;
import com.bhavesh16281.springAnnotations.autowiredAnnotation;
import com.bhavesh16281.springAnnotations.valueAnnotation;
import com.bhavesh16281.springAnnotations.withScopeAnnotation;
import com.bhavesh16281.springAnnotations.withoutScopeAnnotation;
import com.bhavesh16281.springExpressionLanguage.Employee;
import com.bhavesh16281.springExpressionLanguage.Shirt;
import com.bhavesh16281.springExpressionLanguage.SpELConfig;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
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
      /* XmlBeanFactory is depricated, hence the below code will not work instead of that use ClassPathXmlApplicationContext
       Resource resource = new ClassPathResource("com/bhavesh16281/constructorConfig.xml");
       BeanFactory factory = new XmlBeanFactory(resource);
       ConstructorInjection ci2 = (ConstructorInjection) factory.getBean("constructorInjection");
		*/
       BeanFactory factory = new ClassPathXmlApplicationContext("com/bhavesh16281/beanFactoryIOC.xml");
       BeanFactoryIOC ci2 = (BeanFactoryIOC) factory.getBean("beanFactory");
       System.out.println("2. Application Context: ");
       ApplicationContext context3 = new ClassPathXmlApplicationContext("com/bhavesh16281/applicationContextIOC.xml");
       ApplicationContextIOC ci3 = (ApplicationContextIOC) context3.getBean("appContext");
       
       System.out.println();
       
       
       
       
       System.out.println("---------------------IOC Container Example: ---------------------");
       
       System.out.println("1. Calling Sim Methods without Spring");
       Sim sim = new Jio();
       sim.calling();
       sim.internet();
       Sim sim2 = new Airtel();
       sim2.calling();
       sim2.internet();
       System.out.println();
       System.out.println("        Explaination: Without Spring IoC, we would manually create instances of the Sim implementation "
       		+ "in the main method. This approach tightly couples the App class to the Jio and Airtel implementation. "
       		+ "In Future If we want to switch to BSNL implementation, we need to modify the source code.");
       
       
       
       
       System.out.println("2. Using Spring IOC - XML Configuration");
       ApplicationContext appContext = new ClassPathXmlApplicationContext("com/bhavesh16281/beans.xml");
       Sim sim3 = (Sim) appContext.getBean("jio");
       sim3.calling();
       sim3.internet();
       ApplicationContext appContext2 = new ClassPathXmlApplicationContext("com/bhavesh16281/beans.xml");
       Sim sim4 = (Sim) appContext2.getBean("airtel");
       sim4.calling();
       sim4.internet();
       System.out.println();
       System.out.println("        Explaination: To avoid tight coupling, we can use the Spring IoC container. "
       		+ "First, we create an XML configuration file (beans.xml) to define the beans. In the beans.xml file, we define beans by giving each a unique id and specifying the class name. "
       		+ "Later, in the main method, we can use these beans ");
       
       
       
       
       System.out.println("3. Using Java based COnfiguration");
       ApplicationContext appContext3 = new AnnotationConfigApplicationContext(AppConfig.class);
       Sim sim5 = (Sim) appContext3.getBean("jio");
       sim5.calling();
       sim5.internet();
       ApplicationContext appContext4 = new AnnotationConfigApplicationContext(AppConfig.class);
       Sim sim6 = (Sim) appContext3.getBean("airtel");
       sim6.calling();
       sim6.internet();
       System.out.println();
       System.out.println("        Explaination: In Java based configuration we have to create a config class with @Configuration annotation and @Bean annotation to define beans."
       		+ "In App class we use AnnotationConfigApplicationContext('Configuration class name') to create an application context object."
       		+ "Now when we try to get the bean using the bean name, Spring will search for beans in the config class and return the requested beans");
       
       
       
       
       
       System.out.println("4. Using Annotations for DI");
       ApplicationContext context4 = new AnnotationConfigApplicationContext(com.bhavesh16281.IOC.AppConfigAnnotation.class);
       MobileSim mobileSim = context4.getBean(com.bhavesh16281.IOC.MobileSim.class);
       mobileSim.useSim();
       System.out.println();
       System.out.println("        Explaination: In Annotation based DI we have to create a config class with @Configuration annotation along with "
       		+ "@ComponentScan inside which we mention the package which the config file has to scan."
       		+ "Now inside the mentioned package, use @Component in all the classes which spring has to create ean and use @Autowired annotation"
       		+ "where there are dependencies inside a class. ");
       System.out.println();
       
       System.out.println("        Note: Here we have Sim interface which is implemented by Jio and Airtel, Suppose if we autowire both Jio and Airtel references inside MobileSim.class, we will get No Unique Bean Found Exception."
       		+ "To overcode this we use @Primary annotation or @Qualifier Annotation");
       System.out.println("        @Primary Annotation: ");
       System.out.println("                Make one of the beans primary by using @Primary annotation in one of the class.");
       System.out.println("        @Qualifier: ");
       System.out.println("                Use Qualifier annotation with a name and use the same name as component name.");
       ApplicationContext context5 = new AnnotationConfigApplicationContext(AppConfig2.class);
       MobileSim2 mobSim = context5.getBean(MobileSim2.class);
       mobSim.getSim();
       System.out.println();
       
       
       
       
       System.out.println("---------------------Bean Life Cycle ---------------------");
       System.out.println("1. Container Started");
       System.out.println("2. Bean Instantiated");
       System.out.println("3. Dependencies Injected");
       System.out.println("4. Custom init() method");
       System.out.println("5. Bean is Ready");
       System.out.println("6. Custom utility method");
       System.out.println("7. Custom destroy() method");
       System.out.println();
       
       
       
       
       System.out.println("---------------------Ways to Implement Bean Life Cycle ---------------------");
       ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("com/bhavesh16281/spring.xml");
       cap.close();
       
       ConfigurableApplicationContext cap2 = new ClassPathXmlApplicationContext("com/bhavesh16281/spring2.xml");
       cap2.close();
       
       ConfigurableApplicationContext cap3 = new ClassPathXmlApplicationContext("com/bhavesh16281/spring3.xml");
       cap3.close();
       System.out.println();

       
       
       System.out.println("---------------------Spring Expression Language(SpEL)---------------------");
       ApplicationContext con = new ClassPathXmlApplicationContext("com/bhavesh16281/expressionLanguage.xml");
       Shirt shirt  = (Shirt) con.getBean("shirt");
       shirt.getSize();
       
       ApplicationContext con2 = new AnnotationConfigApplicationContext(SpELConfig.class);
       Employee employee = (Employee) con2.getBean("employee");
       employee.getSalary();
       System.out.println();
       
       
       System.out.println("---------------------Spring Annotations---------------------");
       ApplicationContext annotation = new AnnotationConfigApplicationContext(ConfigurationAnnotation.class);
       Book book = (Book) annotation.getBean("bookBean");
       book.bookMethod();
       
       ApplicationContext annotation2 = new AnnotationConfigApplicationContext(ComponentScanAnnotation.class);
       Pen pen = (Pen) annotation2.getBean("pen");
       pen.penMethod();
       
       ApplicationContext annotation3 = new AnnotationConfigApplicationContext(BeanAnnotation.class);
       House house = (House) annotation3.getBean("houseBean");
       house.houseMethod();
       
       ApplicationContext annotation4 = new AnnotationConfigApplicationContext(ControllerAnnotation.class);
       Pencil pencil = (Pencil) annotation4.getBean("pencil");
       pencil.pencilMethod();
       
       ApplicationContext annotation5 = new ClassPathXmlApplicationContext("com/bhavesh16281/valueAnnotation.xml");
       Dog dog = (Dog) annotation5.getBean("dog");
       dog.display();
       ApplicationContext annotation6 = new AnnotationConfigApplicationContext(valueAnnotation.class);
       Cat cat = (Cat) annotation6.getBean("cat");
       cat.display();
       
       ApplicationContext annotation7 = new AnnotationConfigApplicationContext(QualifierAnnotation.class);
       QualifierTest qualifier = (QualifierTest) annotation7.getBean("qualifierTest");
       qualifier.getMethod();
       
       ApplicationContext annotation8 = new AnnotationConfigApplicationContext(ServiceAnnotation.class);
       TV tv = (TV) annotation8.getBean("tv");
       tv.tvMethod();
       
       ApplicationContext annotation9 = new AnnotationConfigApplicationContext(RepositoryAnnotation.class);
       Student student = (Student) annotation9.getBean("student");
       student.studentMethod();
       
       ApplicationContext annotation10 = new AnnotationConfigApplicationContext(ComponentAnnotation.class);
       Teacher teacher = (Teacher) annotation10.getBean("teacher");
       teacher.teacherMethod();
       
       ApplicationContext annotation11 = new ClassPathXmlApplicationContext("com/bhavesh16281/autowiredAnnotation.xml");
       Sky sky = (Sky) annotation11.getBean("sky");
       sky.skyMethod();
       
       ApplicationContext annotation12 = new AnnotationConfigApplicationContext(autowiredAnnotation.class);
       Gym gym = (Gym) annotation12.getBean("gym");
       gym.gymMethod();
       
       ApplicationContext annotation13 = new AnnotationConfigApplicationContext(withoutScopeAnnotation.class);
       System.out.println("11. @Scope Annotation: ");
       System.out.println("        Without @Scope: ");
       MobilePhone mobile = (MobilePhone) annotation13.getBean("mobile");
       mobile.setMessage("Setting message for Mobile Phone..");
       mobile.getMessage();
       
       MobilePhone mobile2 = (MobilePhone) annotation13.getBean("mobile");
       mobile2.getMessage();
       System.out.println("            Here eventhough we are trying to get 2 different beans, the default scope of spring bean is singleton."
       		+ " Hence Spring returned the same object when we use getBean() with two diferent references.");
       System.out.println("        With @Scope: ");
       ApplicationContext annotation14 = new AnnotationConfigApplicationContext(withScopeAnnotation.class);
       AC ac = (AC) annotation14.getBean("ac");
       ac.setMessage("AC is turned ON");
       ac.getMessage();
       AC ac2 = (AC) annotation14.getBean("ac");
       ac2.getMessage();
       System.out.println("            Here we have used @Scope as prototype instead of singleton in AC.java so when we tried to get the beans using different references Spring IOC container"
       		+ " returned two different beans.That is the reason second bean is printed as null.");
      
    }

}
