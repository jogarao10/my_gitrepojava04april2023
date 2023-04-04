import com.durgasoft.beans.Hello;
import com.durgasoft.beans.Welcome;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");

        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello.sayHello());

        Welcome welcome = (Welcome) applicationContext.getBean("welcome");
        System.out.println(welcome.sayWelcome());
    }
}