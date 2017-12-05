package assignment.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentDemoController {
	@RequestMapping(value = "/app/", method = RequestMethod.GET)
	public String app() throws Exception {
		return "Success";
	}
}
