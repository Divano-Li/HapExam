package hbi.core.demo.dto;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.core.annotation.MultiLanguageField;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;

/**名称与表名称相同，表名中 _ 替换为驼峰命名法，首字母大写，且忽略前缀。
 * 如：UserRole 对应表为 sys_user_role。
 */

/**
 * Created by hailor on 16/6/2.
 * 字段名称应根据驼峰命名规则从数据库列名转换过来
	例如：数据库列名为 USER_NAME，则字段名为 userName
	
	特殊字段名称，可以在字段在添加@Column(name = "xxx") 注解，指定数据库列名
	非数据库字段，需要用@Transient 标注
	属性的的类型与字段的 type 对应
	
	不使用基本类型，全部使用基本类型的包装类，如 Long 对应数据库中的 INTEGER，而不是使用 long
	数字类型主键统一采用 Long
	金额、数量 等精度严格浮点类型采用 BigDecimal
	注意 BigDecimal 在计算、比较方面的特殊性
	
	所有的主键字段都需要用@Id标注
	对于自增张、序列（SEQUENCE）类型的主键，需要添加注解@GeneratedValue(generator = GENERATOR_TYPE)
	序列命名规范：表名_S
	例如：表 SYS_USER 对应的序列为 SYS_USER_S
	
	DTO 类上添加@MultiLanguage
	此注解说明该 DTO 需要支持数据多语言
	DTO 字段上添加 @MultiLanguageField
	此注解说明该字段是一个多语言字段
	当有多个多语言字段时，这些字段都需要添加
 */
@Table(name = "hap_demo")	
public class Demo  extends BaseDTO {
	@Id
	@GeneratedValue//主键自动增长
	private  Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
