package edu.citytech.cst.property;


import edu.citytech.cst.loadxml.Property;
import edu.citytech.cst.loadxml.SelectProperties;
import edu.citytech.cst.thecounter.service.$123CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/properties")
public class PropertyController {

        @GetMapping("/")
        public List<Property> getList(){
            return PropertyDAO.findAll();
        }

    }


