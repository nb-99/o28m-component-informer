package dev.beilmann.o28mcomponentinformer.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class GatewayInformerService {

  @Tool(name = "gateway_overview", description = "Provides high-level information about the architecture of the API-Gateway, it's functionality and it's role in the system.")
  public String getGatewayOverview() {
    return """
        The platform's Gateway component (based on Kong) serves as the central entry point for all API traffic, providing:
        
        ## Traffic Management
        
        - Intelligent request routing and load balancing
        - Rate limiting and throttling capabilities
        - Gateway Mesh capability to enable location transparency
        
        ## Security Features
        
        - OAuth 2.0 integration
        - Access Control Lists and Authorization support (API scopes)Ï
        """;
  }

}
