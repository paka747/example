package com.engine;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = GameConfiguration.class)
@ExtendWith(SpringExtension.class)
class GameConfigurationTest {

  @Autowired
  private GameEngine gameEngine;

  @Test
  void shouldCreateGameEngine() {
    // when
    final String actual = gameEngine.run();

    // then
    assertThat(actual).isEqualTo("ai");
  }
}