package gov.open.opengov;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecallController {
    @Autowired
    private RecallService recallService;
    @RequestMapping("/recalls")
    public Recall[] fetchRecalls(){
     return recallService.fetchRecalls("2018-04-04") ;
     
    }

}