package com.e3mall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("{page}")
	public String page(@PathVariable(value="page") String page){
		return page;
	}
}
