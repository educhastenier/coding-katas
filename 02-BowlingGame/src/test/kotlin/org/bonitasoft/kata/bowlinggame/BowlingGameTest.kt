package org.bonitasoft.kata.bowlinggame

import org.assertj.core.api.Assertions
import org.junit.Test

/**
 * @author Collective
 */
class BowlingGameTest {

    private val bowlingGame = BowlingGame()

    @Test
    fun `should `() {
        val score = bowlingGame.score()

        Assertions.assertThat(score).isEqualTo(999)
    }

}