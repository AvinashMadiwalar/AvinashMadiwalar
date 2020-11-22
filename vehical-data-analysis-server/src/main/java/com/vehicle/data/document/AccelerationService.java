package com.vehicle.data.document;

import java.util.List;

public interface AccelerationService {

    List<Acceleration> findByPid(String pid);
}
