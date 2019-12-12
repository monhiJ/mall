package com.mj.elasticsearch.es;

import com.mj.elasticsearch.es.entity.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;


public class IndexTest {


    @Test
    public void testInteger(){
        Integer t = 9;
        Integer s = 9;
        System.out.println(t==s);
    }
}
