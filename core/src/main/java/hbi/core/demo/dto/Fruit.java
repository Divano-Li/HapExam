package hbi.core.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.core.annotation.MultiLanguageField;
import com.hand.hap.system.dto.BaseDTO;
import com.sun.istack.NotNull;

@Table(name = "Fruit_b")
@MultiLanguage
public class Fruit  extends BaseDTO {
	@Id
	@Column
	@GeneratedValue
	private Long fruitId;
	
	@Column
	@NotEmpty
	private String fruitName;
	
	@Column
	@NotEmpty
	private String fruitCode;
	
	@Column
	@MultiLanguageField //支持多语言
	 private String fruitDescription;
	
	@Column
	private Date fruitDate;
	
	
	public Long getFruitId() {
		return fruitId;
	}

	public void setFruitId(Long fruitId) {
		this.fruitId = fruitId;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitCode() {
		return fruitCode;
	}

	public void setFruitCode(String fruitCode) {
		this.fruitCode = fruitCode;
	}

	public String getFruitDescription() {
		return fruitDescription;
	}

	public void setFruitDescription(String fruitDescription) {
		this.fruitDescription = fruitDescription;
	}

	public Date getFruitDate() {
		return fruitDate;
	}

	public void setFruitDate(Date fruitDate) {
		this.fruitDate = fruitDate;
	}

	

    
}
