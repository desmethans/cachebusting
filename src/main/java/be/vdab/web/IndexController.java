package be.vdab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
class IndexController {
	@RequestMapping(method = RequestMethod.GET)
	String index() {
		return "/WEB-INF/JSP/index.jsp"	;
	}
}