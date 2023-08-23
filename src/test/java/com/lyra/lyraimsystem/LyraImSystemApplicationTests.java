package com.lyra.lyraimsystem;

import cn.hutool.core.util.IdUtil;
import com.lyra.lyraimsystem.Repository.UserDataRepository;
import com.lyra.lyraimsystem.domain.entity.UserData;
import org.hibernate.type.descriptor.java.UUIDJavaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LyraImSystemApplicationTests {
    @Autowired
    private UserDataRepository userDataRepository;

    @Test
    void contextLoads() {
        UUIDJavaType.ValueTransformer valueTransformer = new UUIDJavaType.NoDashesStringTransformer();

        UserData userData = new UserData();
        userData.setFriendAllowType((short) 0);
        userData.setAppId(IdUtil.getSnowflakeNextId());
    }

}
