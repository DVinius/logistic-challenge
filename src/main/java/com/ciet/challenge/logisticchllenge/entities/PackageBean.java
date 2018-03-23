package com.ciet.challenge.logisticchllenge.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PACKAGE")
public class PackageBean {
	
	@Id
	@Column(name="id")
    private Integer packageId;

    @Column(name = "weight")
    private Double weight;

	public Integer getPackageId() {
		return packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}
