package com.zmyuan.blog.controller;

import com.zmyuan.blog.mapper.PhoneStatusMapper;
import com.zmyuan.blog.model.PhoneStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/phoneStatus")
public class PhoneStatusController {

	@Autowired
	private PhoneStatusMapper phoneStatusMapper;
	
	@RequestMapping("/test")
	public String testGet() {
		PhoneStatus ps = phoneStatusMapper.getById(1);
		Assert.notNull(ps);
		return "1";
	}
	
	@RequestMapping("/testPaginate")
	public @ResponseBody String testPaginate() {
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("status", "正常");
//		PageQuery pq = new PageQuery();
//		pq.setPage(1);
//		pq.setLimit(10);
//		pq.addSortInfo("phone.desc",null);
//		Paginator paginator = phoneStatusMapper.queryPaginator(paraMap, pq);
//		System.out.println(paginator);
		return "1";
	}
}
