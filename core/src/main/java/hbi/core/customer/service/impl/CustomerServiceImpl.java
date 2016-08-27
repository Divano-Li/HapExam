package hbi.core.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.customer.mapper.CustomerMapper;
import hbi.core.customer.service.ICustomerService;
import hbi.core.demo.dto.Customer;

@Service
@Transactional
public class CustomerServiceImpl extends BaseServiceImpl<Customer> implements ICustomerService{
	 	@Autowired
	    private CustomerMapper customerMapper;

		@Override
		public List<Customer> selectByCustomer(IRequest requestContext, Customer customer, int page, int pagesize) {
			// TODO Auto-generated method stub
			PageHelper.startPage(page, pagesize);
			return customerMapper.selectByCustomer(customer);
		}
		
}
