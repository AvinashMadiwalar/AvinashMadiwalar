package vehicaldataanalysisserver.vehicaldataanalysisserver.service;

import vehicaldataanalysisserver.vehicaldataanalysisserver.entity.Acceleration;

import java.util.List;

public interface AccelerationService {

    List<Acceleration> findByPid(String pid);
}
