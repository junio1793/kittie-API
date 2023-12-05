package com.kittyProject.restTemplate.service;

import com.kittyCore.model.DTO.KittyDTO;
import com.kittyCore.model.kittymodel.KittyModel;
import com.kittyCore.model.repository.KittyrRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional
public class KittyRestService {


    public KittyrRepository repository;

    @Autowired
    public KittyRestService(KittyrRepository repository){
        this.repository = repository;
    }

    public KittyModel save(KittyDTO kittie) {
        KittyModel kittyModel = new KittyModel();
        BeanUtils.copyProperties(kittie, kittyModel);
        kittyModel.setLocalDateTime(LocalDateTime.now());
        return repository.save(kittyModel);
    }
}
