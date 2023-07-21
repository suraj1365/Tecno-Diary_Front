package com.backend.blog.repositories;

import com.backend.blog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
