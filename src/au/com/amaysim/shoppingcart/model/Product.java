package au.com.amaysim.shoppingcart.model;

import java.math.BigDecimal;

import au.com.amaysim.shoppingcart.ds.ProductDS;

public class Product {
	private String productName;
	private BigDecimal productPrice;
	private String productCode;
	
	public Product(String productCode, String productName, BigDecimal productPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public Product(ProductDS product) {
		this.productCode = product.product_code();
		this.productName = product.product_name();
		this.productPrice = product.price();
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

}
