package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	
	@GetMapping("/join")
	public String insertMember() {
		return "/member/insertMember";
	}
	
	@GetMapping("/deleteMember")
	public String deleteMember() {
		return "/member/deleteMember";
	}
	
	//아이디찾기
	@GetMapping("/findId")
	public String findId() {
		return "/member/findId";
	}
	
	//비밀번호찾기
	@GetMapping("/findPassword")
	public String findPassword() {
		return "/member/findPassword";
	}
}
