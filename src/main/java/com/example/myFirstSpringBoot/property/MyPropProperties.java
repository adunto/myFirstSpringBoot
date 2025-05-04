package com.example.myFirstSpringBoot.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
@ConfigurationProperties("myprop")
public class MyPropProperties {
    private String userName;
    private int port;

//    public String getUserName() {
//        return userName;
//    }
//
//    public int getPort() {
//        return port;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setPort(int port) {
//        this.port = port;
//    }
}
