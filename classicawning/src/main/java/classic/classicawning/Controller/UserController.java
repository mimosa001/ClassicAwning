package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

	@GetMapping("/user/idinquiry")
	public String idInquiry() {
		return "/user/idinquiry";
	}

}
