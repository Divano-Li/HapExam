package hbi.core.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.Customer;
import hbi.core.demo.dto.Item;
import hbi.core.item.mapper.ItemMapper;
import hbi.core.item.service.IItemService;

@Service
@Transactional
public class ItemServiceImpl extends BaseServiceImpl<Item> implements IItemService {
	@Autowired
    private ItemMapper itemMapper;

	@Override
	public List<Item> selectByItem(IRequest requestContext, Item item, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return itemMapper.selectByItem(item);
	}
}
