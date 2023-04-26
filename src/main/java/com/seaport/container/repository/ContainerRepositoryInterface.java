package com.seaport.container.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seaport.container.model.ContainerModel;

public interface ContainerRepositoryInterface extends JpaRepository<ContainerModel, UUID>{
}
