package hbi.core.demo.service.impl;

import hbi.core.demo.dto.Demo;

import hbi.core.demo.service.IDemoService;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional

/**
 * 命名为 Service 接口类名(去掉I前缀) + Impl
 * 实现类可以通过继承BaseServiceImpl< T > 来获得标准的 CRUD 操作支持 >
 *  需要 Service 接口类 继承 IBaseService< T >
 * 
 * */
public class DemoServiceImpl extends BaseServiceImpl<Demo> implements IDemoService {

}
