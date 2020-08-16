package Controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import model.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceUtil;

import java.util.List;

@RestController
public class BaseController {
    private final ServiceUtil service;

    @Autowired
    public BaseController(ServiceUtil service){
        this.service = service;
    }

    @GetMapping("/people")
    public ResponseEntity<List<Human>> showPeople(){
        List<Human> peopleList = service.getAllPeople();
        return new ResponseEntity<>(peopleList, HttpStatus.OK);
    }
}
