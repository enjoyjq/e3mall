package com.e3mall.manager.utils;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable{

	private Long Total;
	private List<?> rows;
	public Long getTotal() {
		return Total;
	}
	public void setTotal(Long total) {
		Total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
