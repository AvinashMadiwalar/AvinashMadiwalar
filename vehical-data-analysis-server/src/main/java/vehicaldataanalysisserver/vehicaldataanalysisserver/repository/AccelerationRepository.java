package vehicaldataanalysisserver.vehicaldataanalysisserver.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import vehicaldataanalysisserver.vehicaldataanalysisserver.entity.Acceleration;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AccelerationRepository extends MongoRepository<Acceleration, Long> {
    List<Acceleration> findByObdPid(String obdPid);
}
