package me.j360.rpc.service;

import me.j360.rpc.model.UserDO;

/**
 * Package: me.j360.rpc.api
 * User: min_xu
 * Date: 2017/5/25 下午7:01
 * 说明：
 */
public interface UserService {


    UserDO getUser(Long uid);
}
