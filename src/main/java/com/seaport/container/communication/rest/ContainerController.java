package com.seaport.container.communication.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seaport.container.dto.ContainerDto;
import com.seaport.container.model.ContainerModel;
import com.seaport.container.service.ContainerService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(allowedHeaders = "*",  maxAge = 3600)
@RequestMapping("/container")
public class ContainerController {
    @Autowired
    final ContainerService containerService;

    public ContainerController(ContainerService containerService) {
        this.containerService = containerService;
    }

    @PostMapping
    public ResponseEntity<Object> saveContainer(@RequestBody @Valid ContainerDto containerDto) {
        var containerModel = new ContainerModel();
        BeanUtils.copyProperties(containerDto, containerModel);
        System.out.println("Input: " + containerDto.getClient() + containerModel.getClient());
        return ResponseEntity.status(HttpStatus.CREATED).body(this.containerService.saveContainer(containerModel));
    }
}
