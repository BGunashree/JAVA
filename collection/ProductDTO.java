package com.xworkz.collections.dto;

import java.io.Serializable;

public class ProductDTO<I,S,D> implements Serializable, Comparable<ProductDTO<I,S,D>> {
	
	private I id;
	private S name;
	private S vendor;
	private D cost;
	public ProductDTO(I id, S name, S vendor, D cost) {
		super();
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.cost = cost;
	}
	public I getId() {
		return id;
	}
	public S getName() {
		return name;
	}
	public S getVendor() {
		return vendor;
	}
	public D getCost() {
		return cost;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", vendor=" + vendor + ", cost=" + cost + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vendor == null) ? 0 : vendor.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vendor == null) {
			if (other.vendor != null)
				return false;
		} else if (!vendor.equals(other.vendor))
			return false;
		return true;
	}

	@Override
	public int compareTo(ProductDTO<I,S,D> o) {
		
		return Double.compare((Double)this.cost,(Double) o.cost) ;
		//this.name.compareTo(o.name)
		
	}
	
	
	
	

}
