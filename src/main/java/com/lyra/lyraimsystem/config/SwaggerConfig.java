package com.lyra.lyraimsystem.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SpringDocConfigProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * swagger配置
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi tweetsOpenApi(@Value("${springdoc.api-docs.version}") SpringDocConfigProperties.ApiDocs.OpenApiVersion appVersion) {
        String[] paths = {"/com/lyra/lyraimsystem/"};
        return GroupedOpenApi.builder().
                group("lyra-im-system")
                .addOpenApiCustomizer(openApi ->
                        openApi.info(new Info().title("lyra IM 系统").version(appVersion.getVersion()))
                                .externalDocs(new ExternalDocumentation()
                                        .description("lyra IM 系统")
                                        .url("https://www.cnblogs.com/lyraHeartstrings/")))
                .packagesToScan("com.lyra.lyraimsystem")
                .build();
    }
}
