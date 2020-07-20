package com.example.myRule;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    //收集总共可以提供服务的服务器，保存到list
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
