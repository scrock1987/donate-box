package com.jkt.donatebox.com.jkt.donatebox.repository;

import com.jkt.donatebox.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("select u from User u where u.email = ?1")
    User getUserByEmail(String email);
    @Query("select u from User u where u.email = ?1")
    void saveUser(User user);
}
