/**
 */
package cn.vanlian.cacti.modules.sys.dao;

import java.util.List;

import cn.vanlian.cacti.common.persistence.CrudDao;
import cn.vanlian.cacti.common.persistence.annotation.MyBatisDao;
import cn.vanlian.cacti.modules.sys.entity.Dict;

/**
 * 字典DAO接口
 * @author Liul
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
