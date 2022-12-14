package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

	@GetMapping("/login")
	public String login() {
		return "/member/login";
	}
	
	@GetMapping("/insertMember")
	public String insertMember() {
		return "/member/insertMember";
	}
	
	@GetMapping("/deleteMember")
	public String deleteMember() {
		return "/member/deleteMember";
	}

}