package com.quark.rest;

import com.quark.common.dao.AdminUserDao;
import com.quark.rest.service.PostsService;
import com.quark.rest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * Created by lhr on 17-7-31.
 * user.setUsername("lhr");
 * user.setPassword("root");
 */
@RunWith(SpringRunner.class)
@TestPropertySource(locations = {"classpath:rest.properties"})
@SpringBootTest
public class RestApplicationTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    @Autowired
    PostsService postsService;

    @Autowired
    AdminUserDao dao;

    @Value( "${Redis_User_Key}" )
    public String userKey;

    @Test
    public void testDataSource() {
//        Page<Posts> page = postsService.getPostsByPage("", 0, 20);
//        List<Posts> content = page.getContent();
//        System.out.println(content);

    }

}