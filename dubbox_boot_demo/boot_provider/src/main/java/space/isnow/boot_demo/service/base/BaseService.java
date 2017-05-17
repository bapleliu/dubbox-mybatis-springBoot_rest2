package space.isnow.boot_demo.service.base;

import javax.annotation.Resource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import space.isnow.boot_demo.dao.CommExeSqlDAO;

@Component
public class BaseService {
	protected static Logger log = LogManager.getLogger(BaseService.class);
	@Resource(name = "commExeSqlDAOImpl")
	public CommExeSqlDAO commExeSqlDAO;
	
	public CommExeSqlDAO getCommExeSqlDAO() {
		return commExeSqlDAO;
	}
	
	public void setCommExeSqlDAO(CommExeSqlDAO commExeSqlDAO) {
		this.commExeSqlDAO = commExeSqlDAO;
	}
	

}
