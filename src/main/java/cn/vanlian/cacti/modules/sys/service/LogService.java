/**
 */
package cn.vanlian.cacti.modules.sys.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.vanlian.cacti.common.persistence.Page;
import cn.vanlian.cacti.common.service.CrudService;
import cn.vanlian.cacti.common.utils.DateUtils;
import cn.vanlian.cacti.modules.sys.dao.LogDao;
import cn.vanlian.cacti.modules.sys.entity.Log;

/**
 * 日志Service
 * @author Liul
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class LogService extends CrudService<LogDao, Log> {

	public Page<Log> findPage(Page<Log> page, Log log) {
		
		// 设置默认时间范围，默认当前月
		if (log.getBeginDate() == null){
			log.setBeginDate(DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1));
		}
		if (log.getEndDate() == null){
			log.setEndDate(DateUtils.addMonths(log.getBeginDate(), 1));
		}
		
		return super.findPage(page, log);
		
	}
	
}
