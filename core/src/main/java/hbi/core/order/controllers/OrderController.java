package hbi.core.order.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hbi.core.demo.dto.OrderHeader;
import hbi.core.order.service.IOrderService;


@Controller
public class OrderController extends BaseController{
	@Autowired
	private IOrderService orderrService;
	
	 	@RequestMapping(value = "/core/order/query")
	    @ResponseBody
	    public ResponseData getTasks(OrderHeader orderHeader, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
	            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
	        IRequest requestContext = createRequestContext(request);
	        return new ResponseData(orderrService.selectByOrder(requestContext, orderHeader, page, pagesize));
	    }

}
