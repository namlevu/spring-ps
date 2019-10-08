package com.cmcglobal.psys.core.service;

import com.cmcglobal.psys.core.domain.User;

import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public interface UserService {

  User select(String id);

  void insert(User user);
}