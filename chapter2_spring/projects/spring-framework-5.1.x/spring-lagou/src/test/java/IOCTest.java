import com.lagou.edu.LagouBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
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
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		LagouBean bean = ac.getBean(LagouBean.class);
		bean.print();


	}

	public static void main(String[] args) {
		// ApplicationContext是容器的高级接口,BeanFactory-顶级容器,根容器
		//spring应用上下文 BeanFactory,BeanProcessor,单例池
		/**
		 * ioc容器创建管理bean对象,ioc容器是有生命周期的
		 * 构造器执行,初始化方法执行,bean后置处理器的before和after方法:AbstractApplicationContext#finishBeanFactoryInitialization
		 * bean工厂后置处理器的初始化,方法执行 AbstractApplicationContext#invokeBeanFactoryPostProcessors
		 * bean后置处理器初始化:AbstractApplicationContext#refresh#registerBeanPostProcessors
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object lagouBean = ac.getBean("lagouBean");
		System.out.println(lagouBean);
	}


}
