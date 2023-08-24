package com.lyra.lyraimsystem.config;

import cn.hutool.core.util.IdUtil;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * 自定义Id生成器
 */
@Configuration
public class IdGeneratorConfig implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        // 实现雪花算法生成主键的逻辑
        // 这里仅为示例，实际应用需要根据雪花算法的规则来生成唯一ID
        long timestamp = System.currentTimeMillis();
        return IdUtil.getSnowflakeNextId();
    }
}
