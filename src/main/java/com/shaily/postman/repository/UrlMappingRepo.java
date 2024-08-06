package com.shaily.postman.repository;

import com.shaily.postman.entity.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlMappingRepo extends JpaRepository<UrlMapping, String> {
}
