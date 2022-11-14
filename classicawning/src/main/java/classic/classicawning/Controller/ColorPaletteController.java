package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("colorPalette")
public class ColorPaletteController {

	@GetMapping("/colorPalette")
	public String main(Model model) {
		model.addAttribute("title", "원단 색상표");
		return "colorPalette/colorPalette";
	}
}
