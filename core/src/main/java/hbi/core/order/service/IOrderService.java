package hbi.core.order.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.demo.dto.OrderHeader;


public interface IOrderService extends IBaseService<OrderHeader>, ProxySelf<IOrderService>{
	 List<OrderHeader> selectByOrder(IRequest requestContext, OrderHeader orderHeader, int page, int pagesize);
}
