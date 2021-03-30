package com.engine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GameConfiguration {

  @Bean
  GameEngine aiGameEngine() {
    return new AiGameEngine();
  }

  @Bean
  GameEngine dummyGameEngine() {
    return new DummyGameEngine();
  }
}
