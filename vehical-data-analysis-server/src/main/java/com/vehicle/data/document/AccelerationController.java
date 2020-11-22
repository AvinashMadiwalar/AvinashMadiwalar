package com.vehicle.data.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccelerationController {

    @Autowired
    AccelerationService accelerationService;

    @GetMapping(value = "/getParameters", produces = "application/json")
    public ResponseEntity getParametersByPid(@RequestParam("pid") String pid) throws Exception {
        List<Acceleration> accelerationList = accelerationService.findByPid(pid);
        return new ResponseEntity<>(accelerationList, HttpStatus.OK);

    }
}
