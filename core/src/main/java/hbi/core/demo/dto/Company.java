package hbi.core.demo.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;


@Table(name = "hap_org_companys")
public class Company extends BaseDTO{
	
	@Id
	@Column
	@GeneratedValue
	private Long companyId;
	
	@Column
	@NotEmpty
	private String companyNumber;
	
	@Column
	@NotEmpty
	private String companyName;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String compangyName) {
		this.companyName = compangyName;
	}
	
	
	

}
