package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {
	@GetMapping("/insertEstimate")
	public String insertEstimate() {
		return "/estimate/insertEstimate";
	}
}