package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.entity.Notice;

/**
 * NoticeService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年11月19日 下午12:10:33
 * @version 1.0
 */
public interface NoticeService {

	List<Notice> findAll();

}
