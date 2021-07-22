package qirp.study;

import org.junit.Test;
import org.springframework.context.annotation.Bean;

/**
 * @author qirp
 * @version 1.0
 * @date 2021/7/7 3:21 下午
 */
public class BeanTest {

	@Test
	public void testJavaObj(){
		Student stu = new Student("lihua",16);
		System.out.print(stu.toString());
	}

	@Bean
	public SetInjection getSetInst(){
		return null;
	}
}
