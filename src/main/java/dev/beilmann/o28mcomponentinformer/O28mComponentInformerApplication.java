package dev.beilmann.o28mcomponentinformer;

import dev.beilmann.o28mcomponentinformer.service.GatewayInformerService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class O28mComponentInformerApplication {

  static void main(String[] args) {
    SpringApplication.run(O28mComponentInformerApplication.class, args);
  }

  @Bean
  public ToolCallbackProvider o28mComponentInformer(
      GatewayInformerService gatewayInformerService
  ) {
    return MethodToolCallbackProvider.builder().toolObjects(gatewayInformerService)
        .build();
  }

}
