/**
 *  Copyright(C) 2013 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package my.study.dynaweb.service;

import java.util.List;

import my.study.dynaweb.entity.Route;

/**
 * Descriptions
 *
 * @version 2014-11-24
 * @author SUNTEC
 * @since JDK1.6
 *
 */
public interface RouteService extends CrudService<Route>{
	List<Route> selectAll(Integer start, Integer limit) throws Exception;

}
