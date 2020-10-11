import com.lagou.edu.SpringConfig;
import com.lagou.edu.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: kevliu3
 * Date: 2020/9/6
 * Time: 5:11 PM
 */
public class IOCTest {

    @Test
    public void testIOC() {
        // 通过读取classpath下的xml文件来启动容器(xml模式SE应用下推荐使用)
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        //不推荐使用
        AccountDao accountDao = (AccountDao) ac.getBean("accountDao");
        System.out.println(accountDao);

    }

}
