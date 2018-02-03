package com.e3mall.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mall.manager.mapper.TbItemMapper;
import com.e3mall.manager.pojo.TbItem;
import com.e3mall.manager.pojo.TbItemExample;
import com.e3mall.manager.service.ItemService;
import com.e3mall.manager.utils.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	public TbItem findItemById(Long itemId) {
		return itemMapper.selectByPrimaryKey(itemId);
	}

	public PageResult findItemByPage(Integer page ,Integer pageSize){
		TbItemExample example=new TbItemExample();
		PageHelper.startPage(page, pageSize);
		List<TbItem> list = itemMapper.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		PageResult pageResult = new PageResult();
		pageResult.setTotal(pageInfo.getTotal());
		pageResult.setRows(list);
		return pageResult;
	}
}
