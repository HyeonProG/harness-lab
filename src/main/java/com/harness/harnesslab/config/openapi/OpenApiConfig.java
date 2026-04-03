package com.harness.harnesslab.config.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

  @Bean
  public OpenAPI harnessLabOpenApi(BuildProperties buildProperties) {
    return new OpenAPI()
        .info(new Info()
            .title("Harness Lab API")
            .description("컨텍스트 엔지니어링과 하네스 엔지니어링 비교 분석을 위한 API 문서")
            .version(buildProperties.getVersion())
            .license(new License()
                .name("Private Portfolio Project")));
  }
}
