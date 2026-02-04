package org.springboot.workshop.repositories;

import org.springboot.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

}
