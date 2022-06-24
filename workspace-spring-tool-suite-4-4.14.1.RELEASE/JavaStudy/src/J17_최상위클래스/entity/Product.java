package J17_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Product {

	private int productCode;
	private String productName;
	private int category;
	private LocalDate productionDate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productCode, String productName, int category, LocalDate productionDate) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.category = category;
		this.productionDate = productionDate;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, productCode, productName, productionDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return category == other.category && productCode == other.productCode
				&& Objects.equals(productName, other.productName)
				&& Objects.equals(productionDate, other.productionDate);
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", category=" + category
				+ ", productionDate=" + productionDate + "]";
	}
	
	
	
}
