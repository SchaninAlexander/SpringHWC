import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());


        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getMessage());


        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getMessage());

        HelloWorld helloWorld = applicationContext.getBean("helloworld",HelloWorld.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);

        System.out.println("Ссылки hw равны? - " + (bean == bean1));
        System.out.println("Ссылки cat равны? - " + (bean2 == bean3));



    }
}