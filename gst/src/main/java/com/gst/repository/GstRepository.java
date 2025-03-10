package com.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {
	
	@Query(value = "select percentage from gst where hsn_code = ?",nativeQuery = true)
	public int getByHsn(int hsn) ;
	

}
