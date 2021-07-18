/**
 * 함수 예제입니다.
 * */
fun functionExamples() {
    functionCallExample() // 함수 호출 예제
    지명_함수_인자_예제()
//    shouldReturnAString()
    `**~prolly not a good idea!~**`()
    `사용자가 로그아웃을 클릭하면 로그아웃되어야 합니다`()
}

/**
 * 함수의 리턴 예제입니다.
 * */
private fun formatHealthStatus1(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> "최상의 상태임!"
        in 90..99 -> "약간의 찰과상만 있음."
        in 75..89 -> if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유되고 있음!"
        } else {
            "경미한 상처만 있음."
        }
        in 15..74 -> "많이 다친 것 같음."
        else -> "최악의 상태임!"
    }
    return healthStatus
}

/**
 * 함수의 기본 인자 예제입니다.
 * */
private fun castFireball1(numFireballs: Int = 2) {
    println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")
}

/**
 * 함수 호출 예제입니다.
 * */
fun functionCallExample() {
    val name = "마드리갈"
    var healthPoints = 89
    var isBlessed = true
    val healthStatus = formatHealthStatus1(healthPoints, isBlessed)
    println(healthStatus)
    castFireball1(5) // 인자값 5를 전달. "한 덩어리의 파이어볼이 나타난다. (x5)" 출력
    castFireball1() // 인자값 전달하지 않음. 기본 인자값 사용. "한 덩어리의 파이어볼이 나타난다. (x2)" 출력
}

/**
 * 단일 표현식 예제입니다. 1
 * */
private fun formatHealthStatus2(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "최상의 상태임!"
        in 90..99 -> "약간의 찰과상만 있음."
        in 75..89 -> if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유되고 있음!"
        } else {
            "경미한 상처만 있음."
        }
        in 15..74 -> "많이 다친 것 같음."
        else -> "최악의 상태임!"
    }

/**
 * 단일 표현식 예제입니다. 2
 * */
private fun castFireball(numFireballs: Int = 2) =
    println("한 덩어리의 파이어볼이 나타난다. (x$numFireballs)")


private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(
        "(Aura: $auraColor) " +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("$name $healthStatus")
}
/**
 * 지명 함수 인자 예제입니다.
 * */
fun 지명_함수_인자_예제() {
    val status = formatHealthStatus1(89, true)
    printPlayerStatus(auraColor = "NONE", isBlessed = true, name = "마드리갈", healthStatus = status)
}


/**
 * Nothing 타입 예제입니다.
 * */
//fun shouldReturnAString(): String {
//    TODO("문자열을 반환하는 코드를 여기에 구현해야 함")
//    println("절대 실행할 수 없는 코드")
//}

/**
 * 백틱 함수 예제입니다.
 * */
fun `**~prolly not a good idea!~**`() {
    println("prolly not a good idea!")
}
fun `사용자가 로그아웃을 클릭하면 로그아웃되어야 합니다`() {
    println("테스트 코드를 작성합니다.")
}