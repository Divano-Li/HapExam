package hbi.core.order.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.OrderHeader;


public interface OrderMapper extends Mapper<OrderHeader>{
		List<OrderHeader> selectByOrder(OrderHeader orderHeader);

}
