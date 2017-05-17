package space.isnow.boot_demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import space.isnow.boot_demo.api.dubboInterface.TestInterface;
import space.isnow.boot_demo.api.localInterface.UserService;

/**
 * Created by lxq on 15-11-17.
 */
@RestController
public class Client {

    private static final Logger log = LoggerFactory.getLogger(Client.class);

    /**
     * dubbo注解，远程调用分布
     */
    @Reference
    private TestInterface xmlService;

    @Reference
    private UserService userService;

    /**
     * http://localhost:8082/test
     * mainInterfaceTest2
     *
     * @return Integer
     * @throws
     * @since 1.0.0
     */
    @RequestMapping("/test")
    @ResponseBody
    public Integer mainInterfaceTest2() {
        Integer a = xmlService.test();
        log.info("客户端调用返回结果" + a);
        return a;
    }

    @RequestMapping("/userlist")
    @ResponseBody
    public Object getUserList() {
        Object list = userService.queryUsers();
        return list;

    }

}
