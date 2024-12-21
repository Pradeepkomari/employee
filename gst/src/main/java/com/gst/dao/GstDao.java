package com.gst.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gst.entity.Gst;
import com.gst.repository.GstRepository;

@Repository
public class GstDao {

	@Autowired
	GstRepository gr;
	
	public String add(List<Gst> e) {
		gr.saveAll(e);
		return "Stored";
	}
	
	public int getByHsn(int hsn) {
		return gr.getByHsn(hsn);
	}


}
