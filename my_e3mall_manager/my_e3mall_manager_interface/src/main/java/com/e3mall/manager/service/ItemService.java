package com.e3mall.manager.service;


import com.e3mall.manager.pojo.TbItem;
import com.e3mall.manager.utils.PageResult;


public interface ItemService {
	
  public TbItem findItemById(Long itemId);
	public PageResult findItemByPage(Integer page,Integer pageSize);
}
