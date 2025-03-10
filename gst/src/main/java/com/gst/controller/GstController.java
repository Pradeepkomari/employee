package com.gst.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gst.entity.Gst;
import com.gst.service.GstService;

@RestController
@RequestMapping("/gst")
public class GstController {
	
	@Autowired
	GstService gs;
	
	@PostMapping("/post")
	public String add(@RequestBody List<Gst> e) {
		return gs.add(e);
	}
	@GetMapping("/gethsn/{hsn}")
	public int getByHsn(@PathVariable int hsn) {
		return gs.getByHsn(hsn);
	}

}
