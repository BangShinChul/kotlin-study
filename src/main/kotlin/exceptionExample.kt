/**
 * 예외 처리 예제입니다.
 * */
fun exceptionExamples() {
//    `IllegalStateException 예제`()
//    `커스텀 예외 예제`()
//    `예외 처리 예제`()
    `전제 조건 함수 checkNotNull 사용 예제`()
}

fun `IllegalStateException 예제`() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordJuggling = 2
    }
    proficiencyCheck(swordJuggling)
    swordJuggling = swordJuggling!!.plus(1)

    println("$swordJuggling 개의 칼로 저글링합니다!")
}
fun proficiencyCheck(swordsJuggling: Int?) {
    swordsJuggling ?: throw IllegalStateException("플레이어가 저글링을 할 수 없음")
}


fun `커스텀 예외 예제`() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordJuggling = 2
    }
    customProficiencyCheck(swordJuggling)
    swordJuggling = swordJuggling!!.plus(1)

    println("$swordJuggling 개의 칼로 저글링합니다!")
}
class UnskilledSwordJugglerException() : IllegalStateException("플레이어가 저글링을 할 수 없음")
fun customProficiencyCheck(swordsJuggling: Int?) {
    swordsJuggling ?: throw UnskilledSwordJugglerException()
}


fun `예외 처리 예제`() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordJuggling = 2
    }

    try {
        customProficiencyCheck(swordJuggling)
    } catch (e: Exception) {
        println(e)
    }
    swordJuggling = swordJuggling!!.plus(1)

    println("$swordJuggling 개의 칼로 저글링합니다!")
}


fun `전제 조건 함수 checkNotNull 사용 예제`() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordJuggling = 2
    }

    try {
        customProficiencyCheck2(swordJuggling)
    } catch (e: Exception) {
        println(e)
    }
    swordJuggling = swordJuggling!!.plus(1)

    println("$swordJuggling 개의 칼로 저글링합니다!")
}
fun customProficiencyCheck2(swordsJuggling: Int?) {
    checkNotNull(swordsJuggling, { "플레이어가 저글링을 할 수 없음" })
}
