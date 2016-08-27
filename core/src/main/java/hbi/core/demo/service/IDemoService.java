package hbi.core.demo.service;

import hbi.core.demo.dto.Demo;

import com.hand.hap.system.service.IBaseService;
import com.hand.hap.core.ProxySelf;

import com.hand.hap.core.IRequest;

import java.util.List;

/**
 * Created by hailor on 16/6/2.
 * 每一个 Service 对应一个 DTO 类，所以命名为I + DTO 类名 + Service	
 * 需要继承 ProxySelf< T >
 */
public interface IDemoService extends IBaseService<Demo>, ProxySelf<IDemoService> {


}
