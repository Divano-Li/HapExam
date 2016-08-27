package hbi.core.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.OrderHeader;
import hbi.core.order.mapper.OrderMapper;
import hbi.core.order.service.IOrderService;



@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<OrderHeader> implements IOrderService{
	@Autowired
    private OrderMapper orderMapper;
	@Override
	public List<OrderHeader> selectByOrder(IRequest requestContext, OrderHeader orderHeader, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return orderMapper.selectByOrder(orderHeader);
	}

}
