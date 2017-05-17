package space.isnow.boot_demo.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.github.pagehelper.PageInfo;

import space.isnow.boot_demo.api.localInterface.UserService;
import space.isnow.boot_demo.api.model.User;
import space.isnow.boot_demo.service.base.BaseService;

/**
 * 使用rest协议通信,充当一般的服务
 * http://localhost:9090/users/register
 * Created by lxq on 15-11-17.
 */
@Service
@Path("users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class UserServiceImpl extends BaseService implements UserService {
	
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @GET
    @Path("register")
    @Produces({MediaType.APPLICATION_JSON})
    @Override
    public Object registerUser() {
    	log.info("使用rest方式实现provider");
    	User user = new User();
    	user.setAge("56");
    	user.setUsername("我打几个");
    	return user;
    }
    
    @GET
    @Path("queryUsers")
    @Produces({MediaType.APPLICATION_JSON})
    @Override
    public Object queryUsers() {
    	log.info("使用rest方式实现provider");
    	List<User> users = commExeSqlDAO.queryForPage("nf_user.getUserList", null, new RowBounds(0, 2));
    	return new PageInfo<User>(users);
    }
    
}
