/**
 */
package cn.vanlian.cacti.modules.sys.dao;

import cn.vanlian.cacti.common.persistence.TreeDao;
import cn.vanlian.cacti.common.persistence.annotation.MyBatisDao;
import cn.vanlian.cacti.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author Liul
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
