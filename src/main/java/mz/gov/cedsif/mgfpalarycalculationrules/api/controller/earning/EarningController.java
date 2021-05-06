package mz.gov.cedsif.mgfpalarycalculationrules.api.controller.earning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/earnings")
public class EarningController {
	
	@GetMapping
	public String all() {
		return "Alo Abonos com Live Reload com API";
	}

}
