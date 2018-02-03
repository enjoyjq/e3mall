package com.e3mall.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.e3mall.manager.pojo.TbItem;
import com.e3mall.manager.service.ItemService;
import com.e3mall.manager.utils.PageResult;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId){
		TbItem item=itemService.findItemById(itemId);
		return item;
	}
	@RequestMapping("/item/list")
	public PageResult findItemByPage(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="1")Integer rows){
		
		PageResult pageResult=itemService.findItemByPage(page,rows);
		return pageResult;
	}
}
