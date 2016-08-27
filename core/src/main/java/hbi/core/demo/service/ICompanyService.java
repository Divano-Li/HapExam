package hbi.core.demo.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.demo.dto.Company;

public interface ICompanyService extends IBaseService<Company>, ProxySelf<ICompanyService> {
	 List<Company> selectByCompany(IRequest requestContext, Company company, int page, int pagesize);
}
