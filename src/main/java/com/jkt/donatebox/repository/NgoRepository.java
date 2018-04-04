package com.jkt.donatebox.repository;

import com.jkt.donatebox.entity.NGO;
import com.jkt.donatebox.enums.NGOType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NgoRepository extends JpaRepository<NGO,Long> {
    @Query("Select n from NGO n where n.address.city = ?1 AND n.type = ?2")
    List<NGO> getNGOByCity(final String city, final NGOType ngoType);
}
