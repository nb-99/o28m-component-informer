package dev.beilmann.o28mcomponentinformer.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GatewayInformerServiceTest {

  GatewayInformerService cut;

  @BeforeEach
  void setUp() {
    cut = new GatewayInformerService();
  }

  @Test
  void getGatewayOverview() {
    String result = cut.getGatewayOverview();
    assertNotNull(result);
  }
}