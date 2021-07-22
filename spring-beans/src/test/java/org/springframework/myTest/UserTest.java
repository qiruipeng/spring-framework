package org.springframework.myTest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author qirp
 * @version 1.0
 * @date 2020/5/24 1:40 下午
 */
@Component
public class UserTest implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("加载必要的东西...");
	}
}
