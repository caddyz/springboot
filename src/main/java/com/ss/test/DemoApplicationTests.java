package com.ss.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ss.config.CodeGenerator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Test
    public void contextLoads() {
        CodeGenerator gse = new CodeGenerator();
        //要给那些表生成
        gse.generateByTables(false,"t_user","t_hobby");
    }
}
