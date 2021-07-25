import kotlin.math.roundToInt

/**
 * 숫자 타입 예제입니다.
 * */
fun numericExamples() {
//    `정수 사용 예제`()
//    `소수 사용 예제`()
//    `문자열을 숫자 타입으로 변환 예외발생 예제`()
//    `OrNull 함수와 복합 연산자를 함께 사용하는 예제`()
//    `Int 타입을 Double 타입으로 변환하기 예제`()
//    `Double 타입 값의 형식 지정하기`()
//    `Double 타입을 Int 타입으로 변환하기 예제`()
//    `정수형의 이진 표현 예제`()
    `비트 연산 함수 예제`()
}

fun `정수 사용 예제`() {
    var playerGold = 10
    var playerSilver = 10

    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
}

fun `소수 사용 예제`() {
    var playerGold = "10".toFloat()
    var playerSilver = "10".toDouble()

    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
}

fun `문자열을 숫자 타입으로 변환 예외발생 예제`() {
    var playerGold = "10.59".toInt() // 에러 발생. 10.59인 값은 Int형으로 변환할 수 없기 때문.
    var playerSilver = "이십오".toDouble() // 에러 발생. 문자열 이십오는 숫자가 아니기 때문.

    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
}

fun `OrNull 함수와 복합 연산자를 함께 사용하는 예제`() {
    var playerGold = "10.59".toIntOrNull() ?: 0
    var playerSilver = "이십오".toDoubleOrNull() ?: 0.0

    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
}

fun `Int 타입을 Double 타입으로 변환하기 예제`() {
    val price = 5.91
    var playerGold = 10
    var playerSilver = 10

    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")

    val totalPurse = playerGold + (playerSilver / 100.0) // 최소한 하나의 소수점 지원 타입이 표현식에 포함되어 있으면 결과 값에 소수점값이 포함된다.
    println("지갑 전체 금액: 금화 $totalPurse")

    println("금화 $price 로 술을 구매함")
    val remainingBalance = totalPurse - price
    println(remainingBalance)
}

fun `Double 타입 값의 형식 지정하기`() {
    val price = 5.91
    var playerGold = 10
    var playerSilver = 10

    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")

    val totalPurse = playerGold + (playerSilver / 100.0)
    println("지갑 전체 금액: 금화 $totalPurse")

    println("금화 $price 로 술을 구매함")
    val remainingBalance = totalPurse - price
    println("남은 잔액: ${"%.2f".format(remainingBalance)}")
}


fun `Double 타입을 Int 타입으로 변환하기 예제`() {
    val price = 5.91
    var playerGold = 10
    var playerSilver = 10

    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")

    val totalPurse = playerGold + (playerSilver / 100.0)
    println("지갑 전체 금액: 금화 $totalPurse")

    println("금화 $price 로 술을 구매함")
    val remainingBalance = totalPurse - price
    println("남은 잔액: ${"%.2f".format(remainingBalance)}")

    val remainingGold = remainingBalance.toInt()
    val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
    playerGold = remainingGold
    playerSilver = remainingSilver
    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
}

fun `정수형의 이진 표현 예제`() {
    println(Integer.toBinaryString(42))
}

fun `비트 연산 함수 예제`() {
    println(toBinaryString(42))
    println(toBinaryString(42.shl(2)))
    println(toBinaryString(42.shr(2)))
    println(toBinaryString(42.ushr(2)))
    println(toBinaryString(42.inv()))
    println(toBinaryString(42.xor(33)))
    println(toBinaryString(42.or(33)))
    println(toBinaryString(42.and(10)))
}
fun toBinaryString(binary: Int): String {
    return Integer.toBinaryString(binary)
}
