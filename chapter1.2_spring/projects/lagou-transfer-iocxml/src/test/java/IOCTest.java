import com.lagou.edu.dao.AccountDao;
import com.lagou.edu.utils.ConnectionUtils;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //不推荐使用
//        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("文件系统绝对路径");
        AccountDao accountDao = (AccountDao) ac.getBean("accountDao");
        AccountDao accountDao1 = (AccountDao) ac.getBean("accountDao");
        //默认singleton
        System.out.println(accountDao == accountDao1);
        ConnectionUtils connectionUtils = (ConnectionUtils) ac.getBean("connectionUtils");
        System.out.println(connectionUtils);
        ac.close();


    }


}
