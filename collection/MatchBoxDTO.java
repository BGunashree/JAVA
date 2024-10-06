package com.xworkz.collections.dto;

import java.io.Serializable;

public class MatchBoxDTO<R,G> implements Serializable{
	
	
	
	private R cost;
	private G brand;
	public  MatchBoxDTO() {
		super();
		
		
	}
	public MatchBoxDTO(R cost, G brand) {
		super();
		this.cost = cost;
		this.brand = brand;
	}
	public R getCost() {
		return cost;
	}
	public G getBrand() {
		return brand;
	}
	@Override
	public String toString() {
		return "MatchBoxDTO [cost=" + cost + ", brand=" + brand + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
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
		MatchBoxDTO other = (MatchBoxDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		return true;
	}
	
	
	
	
}
