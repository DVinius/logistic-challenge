package com.ciet.challenge.logisticchllenge.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DELIVERY")
public class DeliveryBean {
	
	@Id
	@Column(name="id_delivery")
    private Integer delivery;

    @Column(name = "id_vehicle")
    private Integer clientName;
    
    @OneToMany
	@JoinColumn(name="id_delivery")
    private List<PackageBean> packages;

	public Integer getDelivery() {
		return delivery;
	}

	public void setDelivery(Integer delivery) {
		this.delivery = delivery;
	}

	public Integer getClientName() {
		return clientName;
	}

	public void setClientName(Integer clientName) {
		this.clientName = clientName;
	}
    
}
