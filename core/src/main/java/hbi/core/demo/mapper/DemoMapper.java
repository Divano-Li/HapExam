package hbi.core.demo.mapper;


import com.hand.hap.mybatis.common.Mapper;

import hbi.core.demo.dto.Demo;

/**
 * Created by hailor on 16/6/2.
 * 每一个 Mapper 对应一个 DTO 类
 * 命名为 DTO 类名 + Mapper
 * 
 * 基础的 CRUD 操作不需要再次实现，通过继承 Mapper<T>
 */
public interface DemoMapper extends Mapper<Demo> {
}
