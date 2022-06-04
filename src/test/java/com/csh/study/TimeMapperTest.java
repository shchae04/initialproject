package com.csh.study;

import com.csh.study.mapper.TimeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class TimeMapperTest {

    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void testGetTime(){
        System.out.println(timeMapper.getTime());
    }

    @Test
    public void testGetTime2(){
        System.out.println(timeMapper.getT());
    }
}
