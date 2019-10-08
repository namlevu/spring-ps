package com.cmcglobal.psys.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.cmcglobal.psys.core.domain.User;

/**
 * UserMapper
 */
@Mapper
@Component
public interface UserMapper {
  User select(String id);

  void insert(User user);
}