import com.jcven.spring.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-Anno.xml");
        UserDao userDao = ac.getBean("userDao1", UserDao.class);
        userDao.delete();
        userDao.insert();
        userDao.select();
        userDao.update();
    }
}
