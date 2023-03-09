package classic.classicawning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {
	//견적신청하기
	@GetMapping("/insertEstimate")
	public String insertEstimate() {
		return "/estimate/insertEstimate";
	}
	
	//나의 견적 신청 내역
	@GetMapping("/mypage/myEstimateList")
	public String estimateList() {
		return "/mypage/myEstimateList";
	}
	
	
	//나의 문의내역
	@GetMapping("/mypage/myInquiryList")
	public String inquiryList() {
		return "/mypae/myInquiryList";
	}
}