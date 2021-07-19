/**
 * 익명 함수 예제입니다.
 * */
fun anonymousFunctionExamples() {
    anonymousFuncExam1()
    anonymousFuncExam2()
    anonymousFuncTypeExam()
    anonymousFuncUsingArgsExam()
    anonymousFuncUsingArgsWithItKeywordExam()
    anonymousFuncUsingMultipleArgsExam()
    anonymousFuncTypeInferenceExam()
    `익명 함수를 인자로 받는 함수 예제`()
    `익명 함수를 인자로 받는 함수의 단축 문법 예제`()
    `함수 참조 예제`()
    `함수 타입 반환 예제`()
}

/**
 * 익명 함수 예제입니다. 1
 * */
fun anonymousFuncExam1() {
    val numLetters = "Mississippi".count({ letter ->
        letter == 's'
    })
    println(numLetters)
}

fun anonymousFuncExam2() {
    println({
        val currentYear = 2019
        "SimVillage 방문을 환영합니다, 촌장님! (copyright $currentYear)"
    }())
}

/**
 * 익명 함수 타입 예제입니다.
 * */
fun anonymousFuncTypeExam() {
    val greetingFunction: () -> String = { // String 함수 타입을 가진 익명 함수를 담은 변수이다.
        val currentYear = 2019
        "SimVillage 방문을 환영합니다, 촌장님! (copyright $currentYear)"
    }
    println(greetingFunction())
}

/**
 * 익명 함수 인자 사용 예제입니다.
 * */
fun anonymousFuncUsingArgsExam() {
    val greetingFunction: (String) -> String = { playerName ->
        val currentYear = 2019
        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
    }
    println(greetingFunction("김선달"))
}


/**
 * it 키워드 사용 예제입니다.
 * */
fun anonymousFuncUsingArgsWithItKeywordExam() {
    val greetingFunction: (String) -> String = {
        val currentYear = 2019
        "SimVillage 방문을 환영합니다, $it 님! (copyright $currentYear)"
    }
    println(greetingFunction("김선달"))
}

/**
 * 익명 함수 인자 사용 예제입니다.(여러 개의 인자)
 * */
fun anonymousFuncUsingMultipleArgsExam() {
    val greetingFunction: (String, Int) -> String = { playerName, numBuildings ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
    }
    println(greetingFunction("김선달", 2))
}

/**
 * 익명 함수 변수 타입 추론 예제입니다.
 * */
fun anonymousFuncTypeInferenceExam() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
    }
    println(greetingFunction("김선달", 2))
}

/**
 * 익명 함수를 인자로 받는 함수 예제입니다.
 * */
fun `익명 함수를 인자로 받는 함수 예제`() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
    }

    runSimulation("김선달", greetingFunction) // runSimulation 함수의 인자로 greetingFunction 익명 함수를 전달
}

/**
 * 단축 문법 예제입니다.
 * */
fun `익명 함수를 인자로 받는 함수의 단축 문법 예제`() {
    runSimulation2("김선달") { playerName, numBuildings ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
    }
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // 1,2,3 중 하나를 무작위로 선택한다
    println(greetingFunction(playerName, numBuildings)) // 인자로 받은 익명함수:greetingFunction 를 호출한다
}

/**
 * inline 키워드 예제입니다.
 * */
inline fun runSimulation2(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}


/**
 * 함수 참조 예제입니다.
 * */
fun `함수 참조 예제`() {
    runSimulation3("김선달", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
    } // 인자로 printConstructionCost 함수의 참조를 전달하였다.
}
inline fun runSimulation3(playerName: String,
                          costPrinter: (Int) -> Unit, // printConstructionCost 함수의 참조를 costPrinter 라는 변수로 담아 받았다.
                          greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    costPrinter(numBuildings) // printConstructionCost 함수 참조를 호출한다.
    println(greetingFunction(playerName, numBuildings))
}
fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("건축 비용: ${cost * numBuildings}")
}


/**
 * 함수 타입 반환 예제입니다.
 * */
fun `함수 타입 반환 예제`() {
    runSimulation4()
}
fun runSimulation4() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("김선달"))
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "병원"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("$numBuildings 채의 $structureType 이 추가됨")
        "SimVillage 방문을 환영합니다, $playerName! (copyright $currentYear)"
    } // 함수를 반환한다.
}
