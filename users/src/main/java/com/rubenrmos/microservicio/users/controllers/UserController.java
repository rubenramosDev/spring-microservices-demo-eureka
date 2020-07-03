package com.rubenrmos.microservicio.users.controllers;


import com.rubenramos.commonsmicroservices.demo.controllers.CommonController;
import com.rubenrmos.microservicio.users.models.entity.User;
import com.rubenrmos.microservicio.users.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends CommonController<User, UserService> {

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User pathUser, @PathVariable Long idUser) {
        User user = service.findById(idUser);

        if (user == null) {
            return ResponseEntity.noContent().build();
        }

        User updatingUser = user;
        updatingUser.setEmail(pathUser.getEmail());
        updatingUser.setPassword(pathUser.getPassword());
        updatingUser.setUserName(pathUser.getUserName());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(updatingUser));
    }

}
