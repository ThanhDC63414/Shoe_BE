package com.cloud.project.shoe.service.impl;

import com.cloud.project.shoe.entity.Shoe;
import com.cloud.project.shoe.repository.ShoeRepository;
import com.cloud.project.shoe.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoeServiceImpl implements ShoeService {

    @Autowired
    ShoeRepository shoeRepository;


    @Override
    public Shoe findById(Integer id) {
        return shoeRepository.findById(id).orElse(Shoe.builder().build());
    }
}
