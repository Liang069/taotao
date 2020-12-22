package cn.edu.sziit.service.Impl;

import cn.edu.sziit.service.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 75741
 */
@Service
public class TestServiceImpl implements TestService {
    public void sayHello() {
        System.out.println("sayHello执行了！");
    }
}
