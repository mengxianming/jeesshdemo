/**
 *  Copyright(C) 2013 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package my.study.dynaweb.dao.impl;

import org.springframework.stereotype.Repository;

import my.study.dynaweb.dao.RouteDAO;
import my.study.dynaweb.entity.Route;

/**
 * Descriptions
 *
 * @version 2014-11-24
 * @author SUNTEC
 * @since JDK1.6
 *
 */
@Repository
public class RouteDAOImpl extends CrudDAOImpl<Route> implements RouteDAO{

	/**
	 * @param entityClazz
	 */
	public RouteDAOImpl() {
		super(Route.class);		
	}

}
