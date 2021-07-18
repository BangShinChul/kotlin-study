/**
 * 조건문과 조건식 예제입니다.
 * */
fun controlFlowAction() {
    checkHealth1() // if/else 표현식 예제
    checkHealth2() // else if 표현식 예제
    checkHealth3() // 중첩 if/else 표현식 예제
    auraCheck1() // 비교 연산자 및 논리 연산자 사용 예제
    auraCheck2() // 비교 연산자 및 논리 연산자 사용 예제
    checkHealth4() // 조건표현식 예제
    checkHealth5() // 범위 표현식 예제
    additionalRangeExam() // 범위 표현식 예제
    checkFaction() // when 표현식 예제
    checkHealth6() // when 표현식 예제
}

/**
 * 기본 if/else 표현식 예제입니다.
 * */
fun checkHealth1() {
    val name = "마드리갈"
    var healthPoints = 100

    if (healthPoints == 100) {
        println(name + " 최상의 상태임!")
    } else {
        println(name + " 최악의 상태임!")
    }
}

/**
 * else if 표현식 예제입니다.
 * */
fun checkHealth2() {
    val name = "마드리갈"
    var healthPoints = 100

    if (healthPoints == 100) {
        println(name + " 최상의 상태임!")
    } else if (healthPoints >= 90) {
        println(name + " 약간의 찰과상만 있음.")
    } else if (healthPoints >= 75) {
        println(name + " 경미한 상처만 있음.")
    } else if (healthPoints >= 15) {
        println(name + " 많이 다친 것 같음.")
    } else {
        println(name + " 최악의 상태임!")
    }
}

/**
 * 중첩 if/else 표현식 예제입니다.
 * */
fun checkHealth3() {
    val name = "마드리갈"
    var healthPoints = 100
    val isBlessed = true

    if (healthPoints == 100) {
        println(name + " 최상의 상태임!")
    } else if (healthPoints >= 90) {
        println(name + " 약간의 찰과상만 있음.")
    } else if (healthPoints >= 75) {
        // if문 중첩
        if (isBlessed) {
            println(name + " 경미한 상처가 있지만 빨리 치유됨!")
        } else {
            println(name + " 경미한 상처만 있음.")
        }
    } else if (healthPoints >= 15) {
        println(name + " 많이 다친 것 같음.")
    } else {
        println(name + " 최악의 상태임!")
    }
}

/**
 * 비교 연산자 및 논리 연산자 사용 예제입니다.
 * */
fun auraCheck1() {
    val name = "마드리갈"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = true

    if (isBlessed && healthPoints > 50 || isImmortal) {
        println("GREEN")
    }
}


/**
 * 비교 연산자 및 논리 연산자 사용 예제입니다.
 * */
fun auraCheck2() {
    val name = "마드리갈"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = true

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    if (auraVisible) {
        println("GREEN")
    } else {
        println("NONE")
    }
}

/**
 * 조건표현식 예제입니다.
 * */
fun checkHealth4() {
    val name = "마드리갈"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = true

    val healthStatus = if (healthPoints == 100) {
        "최상의 상태임!"
    } else if (healthPoints >= 90) {
        "약간의 찰과상만 있음."
    } else if (healthPoints >= 75) {
        if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유되고 있음!"
        } else {
            "경미한 상처만 있음."
        }
    } else if (healthPoints >= 15) {
        "많이 다친 것 같음."
    } else {
        "최악의 상태임!"
    }

    // 플레이어의 상태 출력
    println(name + " " + healthStatus)

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println(auraColor)
}

/**
 * 범위 표현식 예제입니다.
 * */
fun checkHealth5() {
    val name = "마드리갈"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = true

    val healthStatus = if (healthPoints == 100) {
        "최상의 상태임!"
    } else if (healthPoints in 90..99) {
        "약간의 찰과상만 있음."
    } else if (healthPoints in 75..89) {
        if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유되고 있음!"
        } else {
            "경미한 상처만 있음."
        }
    } else if (healthPoints in 15..74) {
        "많이 다친 것 같음."
    } else {
        "최악의 상태임!"
    }

    // 플레이어의 상태 출력
    println(name + " " + healthStatus)

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println(auraColor)
}

/**
 * 범위 표현식 예제입니다.
 * */
fun additionalRangeExam () {
    if (1 in 1..3) {
        println("TRUE")
    }
    println((1..3).toList())
    println(1 in 3 downTo 1)
    println(1 in 1 until 3)
    println(3 in 1 until 3)
    println(2 in 1..3)
    println(2 !in 1..3)
    println('x' in 'a'..'z')
}

/**
 * when 표현식 사용 예제입니다.
 * */
fun checkFaction() {
    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "None"
    }
    println(faction)
}

/**
 * when 표현식 사용 예제입니다. 2
 * */
fun checkHealth6() {
    val name = "마드리갈"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = true

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

    // 플레이어의 상태 출력
    println("$name $healthPoints") // 문자열 템플릿. 변수 이름 앞에 $를 붙여서 사용할 수 있다.

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})") // $ 기호 다음에 추가하는 중괄호({}) 내부에 표현식을 넣을 수 있다.
    println(auraColor)
}