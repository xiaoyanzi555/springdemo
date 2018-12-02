package com.example.springdemo.util;

import org.springframework.stereotype.Service;

@Service("userRedisService")
public class UserRedisServiceImpl extends RedisService<UserModel> {

    public static final String KEY = "redis_user_model";
    @Override
    protected String getRedisKey() {
        return KEY;
    }

}
