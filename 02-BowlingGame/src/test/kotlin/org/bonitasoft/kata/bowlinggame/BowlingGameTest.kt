package org.bonitasoft.kata.bowlinggame

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * @author Collective
 */
class BowlingGameTest {

    private val bowlingGame = BowlingGame()

    @Test
    fun `should score 90 for 9- 9- 9- 9- 9- 9- 9- 9- 9- 9-`() {
        assertThat(bowlingGame.score("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-")).isEqualTo(90)
    }

    @Test
    fun `should score 300 for all strikes`() {
        assertThat(bowlingGame.score("x x x x x x x x x x")).isEqualTo(300)
    }

    @Test
    fun `should score 200 for all spares`() {
        assertThat(bowlingGame.score("-/ -/ -/ -/ -/ -/ 1/ 2/ 3/ 9/")).isEqualTo(200)
    }

}