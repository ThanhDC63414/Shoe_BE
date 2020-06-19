package com.cloud.project.shoe.controller;

import com.cloud.project.shoe.entity.Shoe;
import com.cloud.project.shoe.service.ShoeService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1.0/shoes")
public class ShoeController {

    @Autowired
    ShoeService shoeService;

    @GetMapping(value = "id/{id}")
    public ResponseEntity<Shoe> findById(@PathVariable("id") Integer id){
        Shoe shoe = shoeService.findById(id);

        if (shoe == null || shoe.equals("")){
            ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(shoe);
    }
}
