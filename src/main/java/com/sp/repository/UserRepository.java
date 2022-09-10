package com.sp.repository;

import com.sp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Procedure("FIND_USER_BY_ID")
    User findUserWithId(Integer id);

    @Procedure("COUNT_USER_BY_ADDRESS")
    Integer countByAddress(String address);

}
