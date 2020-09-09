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
        //获取制造出的bean
        Object companyBean = ac.getBean("companyBean");
        //获取factory本身,+&
        Object companyFactoryBean = ac.getBean("&companyBean");
        System.out.println(companyBean);
        System.out.println(companyFactoryBean);

    }

    /**
     * 测试bean的延迟加载
     */
    @Test
    public void testLazyInit() {
        //容器初始化
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //getBean获取bean对象使用
        Object lazyResult = ac.getBean("lazyResult");
        System.out.println(lazyResult);

    }


}
