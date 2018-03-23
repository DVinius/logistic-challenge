package com.ciet.challenge.logisticchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciet.challenge.logisticchllenge.entities.DeliveryBean;

@Repository("DeliveryDAO")
public interface DeliveryDAO extends JpaRepository<DeliveryBean, Integer> {
	

}
