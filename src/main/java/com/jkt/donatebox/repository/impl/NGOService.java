package com.jkt.donatebox.repository.impl;

import com.jkt.donatebox.entity.NGO;
import com.jkt.donatebox.enums.NGOType;
import com.jkt.donatebox.repository.NgoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NGOService {
    @Autowired
    NgoRepository ngoRepository;

    public List<NGO> getNGOByCity(final String city, final NGOType ngoType) {
        return ngoRepository.getNGOByCity(city,ngoType);
    }

    public NGO saveNGO(final NGO ngo) {
        return ngoRepository.save(ngo);
    }

    public NGO getNgoById(final Long ngoId) {
        return ngoRepository.getNGOByNGOId(ngoId);
    }
}
