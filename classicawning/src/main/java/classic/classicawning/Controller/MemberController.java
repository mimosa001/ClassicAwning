package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "클래식어닝");
		return "member/login";
	}
	
	@GetMapping("/join")
	public String insertMember(Model model) {
		model.addAttribute("title", "클래식어닝");
		return "/member/insertMember";
	}
	
	@GetMapping("/deleteMember")
	public String deleteMember(Model model) {
		model.addAttribute("title", "클래식어닝");
		return "/member/deleteMember";
	}
	
	//아이디찾기
	@GetMapping("/findId")
	public String findId(Model model) {
		model.addAttribute("title", "클래식어닝");
		return "/member/findId";
	}
	
	//비밀번호찾기
	@GetMapping("/findPassword")
	public String findPassword(Model model) {
		model.addAttribute("title", "클래식어닝");
		return "/member/findPassword";
	}
}
