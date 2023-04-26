package com.seaport.container.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "containers", schema = "register")
public class ContainerModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "client", nullable = false)
    private String client;
    @Column(name = "number_container", nullable = false)
    private String numberContainer;
    @Column(name = "type", nullable = false)
    private Integer type;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "category", nullable = false)
    private String category;

    public ContainerModel() {
    }

    public ContainerModel(UUID id, String client, String numberContainer, Integer type, String status,
            String category) {
        this.id = id;
        this.client = client;
        this.numberContainer = numberContainer;
        this.type = type;
        this.status = status;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getNumberContainer() {
        return numberContainer;
    }

    public void setNumberContainer(String numberContainer) {
        this.numberContainer = numberContainer;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
