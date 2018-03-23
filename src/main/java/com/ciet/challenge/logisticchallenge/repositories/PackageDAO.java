package com.ciet.challenge.logisticchallenge.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ciet.challenge.logisticchllenge.entities.PackageBean;

@Repository("PackageDAO")
public interface PackageDAO extends JpaRepository<PackageBean, Integer> {
	
	@Query("select pack from DeviceBean device inner join device.packages as pack where device.vehicle = :vechcleId and device.delivery = :deviceId")
	public List<PackageBean> listByDeviceIdAndVechcleId(@Param("deviceId") Integer deviceId, @Param("vechcleId") Integer vechcleId);
}
