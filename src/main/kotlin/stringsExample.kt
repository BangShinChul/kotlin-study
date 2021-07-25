const val TAVERN_NAME = "Taernyl's Folly"

/**
 * 코틀린 표준 라이브러리의 String 타입에 대한 다양한 함수 예제입니다.
 * */
fun stringExamples() {
//    `substring 사용 예제`()
//    `split 사용 예제`("shandy,Dragon's Breathe,5.91")
//    `해체 선언 문법 사용 예제`("shandy,Dragon's Breathe,5.91")
//    `replace 사용 예제`("shandy,Dragon's Breathe,5.91")

//    `문자열 비교 예제`("shandy,Dragon's Breathe,5.91")
//    `문자열 비교 예제`("elixir,Shirley's Temple,4.12")

//    `유니코드 지정 예시`()
    `forEach 사용 예시`()
}

fun `substring 사용 예제`() {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("마드리갈은 $tavernMaster 에게 주문한다.")
}

fun `split 사용 예제`(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("마드리갈은 $tavernMaster 에게 주문한다.")

    val data = menuData.split(',')
    val type = data[0]
    val name = data[1]
    val price = data[2]
    val message = "마드리갈은 금화 $price 로 $name ($type)를 구입한다."
    println(message)
}

fun `해체 선언 문법 사용 예제`(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("마드리갈은 $tavernMaster 에게 주문한다.")

    val (type, name, price) = menuData.split(',')
    val message = "마드리갈은 금화 $price 로 $name ($type)를 구입한다."
    println(message)
}

fun `문자열 비교 예제`(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("마드리갈은 $tavernMaster 에게 주문한다.")

    val (type, name, price) = menuData.split(',')
    val message = "마드리갈은 금화 $price 로 $name ($type)를 구입한다."
    println(message)

    val phrase = if (name == "Dragon's Breathe") {
        "마드리갈이 감탄한다: ${`replace 사용 함수`("와, $name 진짜 좋구나!")}"
    } else {
        "마드리갈이 말한다: 감사합니다 $name."
    }
    println(phrase)
}

fun `replace 사용 예제`(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("마드리갈은 $tavernMaster 에게 주문한다.")

    val (type, name, price) = menuData.split(',')
    val message = "마드리갈은 금화 $price 로 $name ($type)를 구입한다."
    println(message)

    val phrase = "와, $name 진짜 좋구나!"
    println("마드리갈이 감탄한다: ${`replace 사용 함수`(phrase)}")
}

fun `replace 사용 함수`(phrase: String) =
    phrase.replace(Regex("[aeiou]")) {
        when (it.value) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }

fun `유니코드 지정 예시`() {
    val omSymbol = '\u0950'
    print(omSymbol)
}

fun `forEach 사용 예시`() {
    "Dragon's Breathe".forEach {
        print("$it\n")
    }
}
