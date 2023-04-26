package com.seaport.container.service;

import org.springframework.stereotype.Service;

import com.seaport.container.model.ContainerModel;
import com.seaport.container.repository.ContainerRepositoryInterface;

@Service
public class ContainerService {
    final ContainerRepositoryInterface repository;

    public ContainerService(ContainerRepositoryInterface repository) {
        this.repository = repository;
    }

    public ContainerModel saveContainer(ContainerModel container) {
        return repository.save(container);
    }
}
