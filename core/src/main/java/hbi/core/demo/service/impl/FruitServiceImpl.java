package hbi.core.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.Fruit;
import hbi.core.demo.mapper.FruitMapper;
import hbi.core.demo.service.IFruitService;

/**
 * @author taotao.xu@hand-china.com
 */
@Service
public class FruitServiceImpl extends BaseServiceImpl<Fruit> implements IFruitService {

    @Autowired
    private FruitMapper fruitMapper;

	@Override
	public List<Fruit> selectByFruit(IRequest requestContext, Fruit fruit, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return fruitMapper.selectByFruit(fruit);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
    public List<Fruit> batchUpdate(IRequest requestContext, List<Fruit> fruits) {
        // TODO Auto-generated method stub
        for (Fruit fruit : fruits) {
            if (fruit.get__status() != null) {
                switch (fruit.get__status()) {
                case DTOStatus.ADD:
                	fruitMapper.insertFruit(fruit);
                    break;
                case DTOStatus.UPDATE:
                	fruitMapper.updateFruit(fruit);
                    break;
                case DTOStatus.DELETE:
                    self().deleteByPrimaryKey(fruit);
                    break;
                default:
                    break;
                }
            }
        }
        return fruits;
    }
}
