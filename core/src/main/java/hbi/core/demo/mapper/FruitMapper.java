package hbi.core.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.Fruit;

public interface FruitMapper extends Mapper<Fruit>{
	List<Fruit> selectByFruit(Fruit fruit);
	int insertFruit( Fruit fruit );
	int updateFruit(Fruit fruit);

}
