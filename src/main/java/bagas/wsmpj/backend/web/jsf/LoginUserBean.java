package bagas.wsmpj.backend.web.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SessionScoped
@ManagedBean
public class LoginUserBean {

	Logger logger = LoggerFactory.getLogger(LoginUserBean.class);
	
	public String getText() {
		logger.info("LoginUserBean.getText() start");
		return "TEST BEAN";
	}

}