package SpringIOC.Xiao.Demo3;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = (ProductService)applicationContext.getBean("productService");

        productService.save();
    }
}
