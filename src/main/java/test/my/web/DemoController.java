package test.my.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.my.model.MyDemoSite;
import test.my.service.MyDemoService;

import java.util.List;

@RestController
@RequestMapping("/api/mydemo")
public class DemoController {

    private final MyDemoService myDemoService;

    @Autowired
    public DemoController(MyDemoService myDemoService) {
        this.myDemoService = myDemoService;
    }

    @RequestMapping
    public List<MyDemoSite> getListOfProviders() {
        return myDemoService.findAll();
    }
}
