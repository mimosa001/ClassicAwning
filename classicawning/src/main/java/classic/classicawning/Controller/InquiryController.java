package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("inquiry")
public class InquiryController {

	@GetMapping("/insertInquiry")
	public String inquiry() {
		return "/inquiry/insertInquiry";
	}
}
