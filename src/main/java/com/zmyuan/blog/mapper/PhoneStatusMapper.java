package com.zmyuan.blog.mapper;

import com.zmyuan.blog.model.PhoneStatus;
import com.zmyuan.common.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
@Repository
public interface PhoneStatusMapper extends BaseMapper<PhoneStatus> {
	PhoneStatus getById(int id);
}
