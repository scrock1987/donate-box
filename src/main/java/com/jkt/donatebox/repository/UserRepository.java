package com.jkt.donatebox.repository;

import com.jkt.donatebox.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u from User u where u.email = ?1")
    User getUserByEmail(final String email);
    @Query("select u from User u where u.userId = ?1")
    User getUserByUserId(final Long userId);
}
