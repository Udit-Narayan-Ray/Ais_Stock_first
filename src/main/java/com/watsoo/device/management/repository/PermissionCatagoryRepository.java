package com.watsoo.device.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watsoo.device.management.model.PermissionCategory;

public interface PermissionCatagoryRepository extends JpaRepository<PermissionCategory, Long> {

}