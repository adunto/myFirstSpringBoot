package com.example.myFirstSpringBoot.runner;

import com.example.myFirstSpringBoot.property.MyPropProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropRunner implements ApplicationRunner {

    @Value("${myprop.username}")
    private String name;

    @Value("${myprop.port}")
    private int port;

    // MyPropProperties 객체 주입 받기
    @Autowired
    private MyPropProperties myPropProperties;

    // logger
    private Logger logger = LoggerFactory.getLogger(MyPropRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("myprop.name = " + name);
        logger.debug("myprop.port = " + port);

        logger.info("myPropProperties.getName() = " + myPropProperties.getUserName());
        logger.info("myPropProperties.getPort() = " + myPropProperties.getPort());
    }
}
