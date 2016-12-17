/**
 */
package cn.vanlian.cacti.modules.sys.dao;

import cn.vanlian.cacti.common.persistence.CrudDao;
import cn.vanlian.cacti.common.persistence.annotation.MyBatisDao;
import cn.vanlian.cacti.modules.sys.entity.Log;

/**
 * 日志DAO接口
 * @author Liul
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
