package chengy.spring5.demo;

import chengy.spring5.demo.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

    /**
     *     通过xml获取并创建bean对象
     */
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/Bean1.xml");
        User user = context.getBean("user", User.class);
        user.get();
    }
}
