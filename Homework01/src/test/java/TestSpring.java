import com.jcven.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        boolean flag = userService.login("张三", "123");
        if (flag) System.out.println("恭喜你登录成功");
        else System.out.println("很遗憾，登录失败");
    }
}
