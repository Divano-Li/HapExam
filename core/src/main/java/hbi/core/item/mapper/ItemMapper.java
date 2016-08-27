package hbi.core.item.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.Item;


public interface ItemMapper extends Mapper<Item>{
	List<Item> selectByItem(Item item);

}
