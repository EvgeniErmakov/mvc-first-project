package by.htp.webpr.command;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginationCommand {
	
	@RequestMapping("/")
	public String execute(){
		return "login-page";
		
	}

}
