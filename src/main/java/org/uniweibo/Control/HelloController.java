package org.uniweibo.Control;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message","test model bill");
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy年MM月dd日");
		model.addAttribute("date", dateformat.format(new Date()));
		return "hello";
	}
	
}
