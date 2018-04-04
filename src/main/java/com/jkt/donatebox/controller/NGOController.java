package com.jkt.donatebox.controller;

import com.jkt.donatebox.entity.Address;
import com.jkt.donatebox.entity.NGO;
import com.jkt.donatebox.enums.NGOType;
import com.jkt.donatebox.repository.impl.NGOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NGOController {
    @Autowired
    private NGOService ngoService;

    @GetMapping("/ngoByCityAndType")
    public ResponseEntity getNgoByCity(@RequestParam final String city, @RequestParam final NGOType ngoType) {
        final List<NGO> ngo = ngoService.getNGOByCity(city,ngoType);
        return new ResponseEntity(ngo, HttpStatus.OK);
    }
}
