package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/portfolio")
@Controller
public class PortfolioController {
	
	//시공
	@GetMapping("/portfolioList")
	public String getPortfolioList(Model model) {
		
		model.addAttribute("title", "시공 목록");
		return "/portfolio/portfolio_list";
	}

}
