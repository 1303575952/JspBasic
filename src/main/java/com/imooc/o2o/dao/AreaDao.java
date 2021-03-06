package com.imooc.o2o.dao;

import java.util.List;

import com.imooc.o2o.entity.Area;

/**
 * @Description: 区域数据接口
 */
public interface AreaDao {

	/**
	 * 查询区域信息
	 * 
	 * @return
	 */
	List<Area> selectArea();

}
