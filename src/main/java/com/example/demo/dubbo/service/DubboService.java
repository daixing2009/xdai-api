package com.example.demo.dubbo.service;


import com.example.demo.model.User;

import java.util.List;

public interface DubboService {
  List<User> testDubbo(String pararm);
}
