package cn.itcast.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.springboot.dao.NoticeDao;
import cn.itcast.springboot.entity.Notice;
import cn.itcast.springboot.service.NoticeService;

/**
 * NoticeServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年11月19日 下午12:10:57
 * @version 1.0
 */
@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	
	/** 注入数据访问接口代理对象 */
	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}
}
