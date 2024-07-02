import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Cat 1: " + cat1);

        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Cat 2: " + cat2);

        System.out.println("HelloWorld beans equality: " + (bean == bean2));

        System.out.println("Cat beans equality: " + (cat1 == cat2));

    }
}