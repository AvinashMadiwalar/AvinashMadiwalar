package com.vehicle.data.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccelerationServiceImpl implements AccelerationService{

    @Autowired
      private AccelerationRepository accelerationRepository;
    @Override
    public List<Acceleration> findByPid(String pid) {
       return accelerationRepository.findByObdPid(pid);

    }
}
