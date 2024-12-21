package com.gst.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gst.dao.GstDao;
import com.gst.entity.Gst;

@Service
public class GstService {
	
	@Autowired 
	GstDao gd;
	public String add(List<Gst> e) {
		return gd.add(e);
	}
	
	public int getByHsn(int hsn) {
		return gd.getByHsn(hsn);
	}

}
