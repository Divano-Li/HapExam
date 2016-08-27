package hbi.core.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;
import com.sun.istack.NotNull;

@Table(name="hap_om_order_headers")
public class OrderHeader extends BaseDTO{
	
	@Id
	@Column
	private Long headerId;
	
	@Column
	@NotEmpty
	private String orderNumber;
	
	
	@Column
	@NotNull
	private Long compangyId;
	
	@Column
	@NotNull
	private Date orderDate;
	@Column
	@NotNull
	private String orderStatus;
	@Column
	@NotNull
	private Long customerId;
	
	@Transient
	private Long companyId;
	
	@Transient
	private String customerName;
	
	@Transient
	private Long itemId;
	
	public Long getHeaderId() {
		return headerId;
	}
	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Long getCompangyId() {
		return compangyId;
	}
	public void setCompangyId(Long compangyId) {
		this.compangyId = compangyId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	

}
