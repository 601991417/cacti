/**
 */
package cn.vanlian.cacti.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.vanlian.cacti.common.service.TreeService;
import cn.vanlian.cacti.modules.sys.dao.AreaDao;
import cn.vanlian.cacti.modules.sys.entity.Area;
import cn.vanlian.cacti.modules.sys.utils.UserUtils;

/**
 * 区域Service
 * @author Liul
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class AreaService extends TreeService<AreaDao, Area> {

	public List<Area> findAll(){
		return UserUtils.getAreaList();
	}

	@Transactional(readOnly = false)
	public void save(Area area) {
		super.save(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
	@Transactional(readOnly = false)
	public void delete(Area area) {
		super.delete(area);
		UserUtils.removeCache(UserUtils.CACHE_AREA_LIST);
	}
	
}
