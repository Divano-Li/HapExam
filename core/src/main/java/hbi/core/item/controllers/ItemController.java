package hbi.core.item.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hbi.core.demo.dto.Item;
import hbi.core.item.service.IItemService;



@Controller
public class ItemController extends BaseController{
	@Autowired
	private IItemService itemService;
	
	 	@RequestMapping(value = "/core/item/query")
	    @ResponseBody
	    public ResponseData getTasks(Item item, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
	            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
	        IRequest requestContext = createRequestContext(request);
	        return new ResponseData(itemService.selectByItem(requestContext, item, page, pagesize));
	    }
}
