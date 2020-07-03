package com.rubenrmos.microservicio.users.services;

import com.rubenramos.commonsmicroservices.demo.services.CommonServiceImpl;
import com.rubenrmos.microservicio.users.models.entity.User;
import com.rubenrmos.microservicio.users.models.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CommonServiceImpl<User, UserRepository> implements UserService {


}
