package com.ciet.challenge.logisticchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciet.challenge.logisticchllenge.entities.PackageBean;

@Repository("PackageDAO")
public interface PackageDAO extends JpaRepository<PackageBean, Integer> {
	

}
