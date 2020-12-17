package vehicaldataanalysisserver.vehicaldataanalysisserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicaldataanalysisserver.vehicaldataanalysisserver.dto.AccelerationDTO;
import vehicaldataanalysisserver.vehicaldataanalysisserver.entity.Acceleration;
import vehicaldataanalysisserver.vehicaldataanalysisserver.service.AccelerationService;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping
public class AccelerationController {

    @Autowired
    AccelerationService accelerationService;

    @GetMapping(value = "/getParameters", produces = "application/json")
    public List<AccelerationDTO> getParametersByPid(@RequestParam("pid") String pid) throws Exception {
        List<Acceleration> accelerationList = accelerationService.findByPid(pid);
        return accelerationList.stream()
                .map(AccelerationDTO::convertToDto)
                .collect(Collectors.toList());
    }
}
