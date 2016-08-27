package hbi.core.customer.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;

import hbi.core.customer.service.ICustomerService;
import hbi.core.demo.dto.Customer;

@Controller
public class CustomerController extends BaseController{
	
	
	@Autowired
	private ICustomerService customerService;
	
	 	@RequestMapping(value = "/core/customer/query")
	    @ResponseBody
	    public ResponseData getTasks(Customer customer, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
	            @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
	        IRequest requestContext = createRequestContext(request);
	        return new ResponseData(customerService.selectByCustomer(requestContext, customer, page, pagesize));
	    }
	 
}
