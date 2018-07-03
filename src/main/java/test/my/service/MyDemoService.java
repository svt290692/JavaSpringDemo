package test.my.service;

import org.springframework.stereotype.Service;
import test.my.aspect.LogExecTime;
import test.my.model.MyDemoSite;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyDemoService {

    @LogExecTime
    public List<MyDemoSite> findAll() {
        List<MyDemoSite> result = new ArrayList<>();
        result.add(new MyDemoSite("icon1", "id1", "website1", "title1", "description1"));
        result.add(new MyDemoSite("icon2", "id2", "website2", "title2", "description2"));
        result.add(new MyDemoSite("icon3", "id3", "website3", "title3", "description3"));
        result.add(new MyDemoSite("icon4", "id4", "website4", "title4", "description4"));
        return result;
    }
}
