package cn.vanlian.cacti.modules.sys.dao;

import cn.vanlian.cacti.common.persistence.TreeDao;
import cn.vanlian.cacti.common.persistence.annotation.MyBatisDao;
import cn.vanlian.cacti.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author Liul
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
