package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("title", "클래식어닝");
		return "main";
	}
	
	@GetMapping("/mypage/myEstimateList")
	public String estimateList() {
		return "/mypage/myEstimateList";
	}

}
