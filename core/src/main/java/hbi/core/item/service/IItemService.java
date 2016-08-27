package hbi.core.item.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.demo.dto.Item;

public interface IItemService extends IBaseService<Item>, ProxySelf<IItemService>{
	 List<Item> selectByItem(IRequest requestContext, Item item, int page, int pagesize);
}
