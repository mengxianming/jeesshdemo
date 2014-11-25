/**
 *  Copyright(C) 2013 Suntec Software(Shanghai) Co., Ltd.
 *  All Right Reserved.
 */
package my.study.dynaweb.controller;

import java.util.Date;
import java.util.List;

import my.study.dynaweb.common.CommonErrorCodes;
import my.study.dynaweb.entity.Route;
import my.study.dynaweb.service.RouteService;
import my.study.dynaweb.vo.APIResult;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Descriptions
 *
 * @version 2014年11月21日
 * @author SUNTEC
 * @since JDK1.6
 *
 */
@Controller
public class RouteController {
	@Autowired
	RouteService routeService;
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	public String upload(){		
		return "upload";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public @ResponseBody APIResult upload(@RequestPart("file") MultipartFile file) throws Exception{
		APIResult ret = null;
		if(file != null){			
			Route r = new Route();
			r.setCreateTime(new Date());
			r.setContentType("text/plain");
			r.setContent(IOUtils.toString(file.getInputStream(), "UTF-8"));
			routeService.insert(r);
			ret = APIResult.okResult(r.getId());			
		}else{
			ret = APIResult.errorResult("E001", "file upload failed");
		}
		return ret;
	}
	
	@RequestMapping(value={"/", "/index"}, method=RequestMethod.GET)
	public @ResponseBody String index(){
		return "welcome to dynaweb";		
	}
	
	
	@RequestMapping(value="/routes/{id}", method=RequestMethod.GET)
	public @ResponseBody APIResult getById(@PathVariable(value="id") Long id) throws Exception{
		APIResult ret = null;
		if(id == null){			
			ret = APIResult.errorResult(CommonErrorCodes.E_PARAM_EMPTY.code,
					CommonErrorCodes.E_PARAM_EMPTY.getLocalizedMessage("id"));
		}else{
			Route r = routeService.selectOne(id);
			ret = APIResult.okResult(r);
			
		}
		return ret;
	}
	
	@RequestMapping(value="/routes", method=RequestMethod.GET)
	public @ResponseBody APIResult getAll(Integer start, Integer limit) throws Exception{
		APIResult ret = null;
		List<Route> routes = routeService.selectAll(start, limit);
		ret = APIResult.okResult(routes);
		return ret;
	}

}
