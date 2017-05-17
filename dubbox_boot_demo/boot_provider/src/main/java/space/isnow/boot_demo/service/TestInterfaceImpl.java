package space.isnow.boot_demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;

import space.isnow.boot_demo.api.dubboInterface.TestInterface;

/**
 *
 * 使用dubbo协议方式通信
 * Created by lxq on 15-11-17.
 */
@Service(protocol = "dubbo")
public class TestInterfaceImpl implements TestInterface {
	
	private static final Logger log = LoggerFactory.getLogger(TestInterfaceImpl.class);
    @Override
    public Integer test() {
       log.info("boot---服务实现");
       return 1;
    }
}
