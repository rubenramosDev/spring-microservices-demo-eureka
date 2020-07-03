package com.rubenrmos.microservicio.users.models.repository;

import com.rubenrmos.microservicio.users.models.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
