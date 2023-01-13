package com.ltimindtree.umsapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.ltimindtree.umsapp.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
