package com.example.calcetto.controller;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.service.TbGestoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/gestore")
public class GestoreController {
	
    @Autowired
    TbGestoreService service;

    @PostMapping("/insertGestore")
    public TbGestore save(@RequestBody TbGestore data) throws Exception 
    {
    	TbGestore result = service.save(data);
    	return result;
    }
    @PostMapping("/delete")
    public TbGestore deleteGestore(@RequestBody Map<String,Long> body) throws Exception
    {
        TbGestore result = service.deleteGestore(body.get("gestoreId"));
        return result;
    }


}
