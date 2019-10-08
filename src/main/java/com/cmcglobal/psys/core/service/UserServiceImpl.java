package com.cmcglobal.psys.core.service;

import com.cmcglobal.psys.core.domain.User;
import com.cmcglobal.psys.core.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserMapper mapper;

  @Override
  public User select(String id) {
    return mapper.select(id);
  }

  @Override
  public void insert(User user) {
    mapper.insert(user);
  }

  
}