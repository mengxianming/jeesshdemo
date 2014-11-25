/**
 *  Copyright(C) 2013 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package my.study.dynaweb.service.impl;

import java.util.List;

import my.study.dynaweb.dao.CrudDAO;
import my.study.dynaweb.dao.RouteDAO;
import my.study.dynaweb.entity.Route;
import my.study.dynaweb.service.RouteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Descriptions
 *
 * @version 2014-11-24
 * @author SUNTEC
 * @since JDK1.6
 *
 */
@Service
public class RouteServiceImpl extends CrudServiceImpl<Route> implements RouteService{

	private RouteDAO routeDAO;

	/* (non-Javadoc)
	 * @see my.study.dynaweb.service.impl.CrudServiceImpl#getCrudDAO()
	 */
	@Override
	public CrudDAO<Route> getCrudDAO() {		
		return this.routeDAO;
	}
	/**
	 * @param routeDAO the routeDAO to set
	 */
	@Autowired
	public void setRouteDAO(RouteDAO routeDAO) {
		this.routeDAO = routeDAO;
	}
	/* (non-Javadoc)
	 * @see my.study.dynaweb.service.RouteService#selectAll(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<Route> selectAll(Integer start, Integer limit) throws Exception {		
		return routeDAO.selectAll(start, limit);
	}

}
