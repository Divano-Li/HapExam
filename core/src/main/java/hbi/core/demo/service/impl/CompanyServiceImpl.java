package hbi.core.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.demo.dto.Company;
import hbi.core.demo.mapper.CompanyMapper;
import hbi.core.demo.service.ICompanyService;

@Service
@Transactional
public class CompanyServiceImpl extends BaseServiceImpl<Company> implements ICompanyService{
	 	@Autowired
	    private CompanyMapper companyMapper;

		@Override
		public List<Company> selectByCompany(IRequest requestContext, Company company, int page, int pagesize) {
			// TODO Auto-generated method stub
			PageHelper.startPage(page, pagesize);
			return companyMapper.selectByCompany(company);
		}
		
}
