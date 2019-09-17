package org.bonitasoft.kata.bowlinggame

/**
 * @author Collective ownership
 */
class BowlingGame {

    private val specialValues = mapOf(Pair('x', 30), Pair('-', 0))

    /**
     * calculates and return the score from a series of rolls
     */
    fun score(rolls: String): Int {
        val unitScores = parseRolls(rolls)
        return unitScores.sum()
    }

    private fun parseRolls(rolls: String): List<Int> {
        var previous = 0
        return rolls.toCharArray()
                .filter { it != ' ' }
                .map {
                    previous = convertRoll(it, previous)
                    previous
                }
    }

    private fun convertRoll(roll: Char, previousValue: Int): Int {
        return specialValues[roll] ?: return getDynamicValue(roll, previousValue)
    }

    private fun getDynamicValue(roll: Char, previousValue: Int): Int {
        if (roll == '/') {
            return 20 - previousValue
        } else {
            return roll.intValue()
        }
    }

    private fun Char.intValue() = Integer.parseInt(this.toString())
}