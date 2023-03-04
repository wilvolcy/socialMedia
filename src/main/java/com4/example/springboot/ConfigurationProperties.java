package com4.example.springboot;

import org.springframework.context.annotation.Configuration;

@Configuration
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "mail")
public class ConfigurationProperties {
    private String hostName;
    private int port;
    private String from;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "ConfigurationProperties{" +
                "hostName='" + hostName + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                '}';
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
