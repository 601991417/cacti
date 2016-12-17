/**
 */
package cn.vanlian.cacti.modules.sys.dao;

import java.util.List;

import cn.vanlian.cacti.common.persistence.CrudDao;
import cn.vanlian.cacti.common.persistence.annotation.MyBatisDao;
import cn.vanlian.cacti.modules.sys.entity.Menu;

/**
 * 菜单DAO接口
 * @author Liul
 * @version 2014-05-16
 */
@MyBatisDao
public interface MenuDao extends CrudDao<Menu> {

	public List<Menu> findByParentIdsLike(Menu menu);

	public List<Menu> findByUserId(Menu menu);
	
	public int updateParentIds(Menu menu);
	
	public int updateSort(Menu menu);
	
}
