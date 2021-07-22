/**
 * nullable 및 non-nullable 예제입니다.
 * */
fun nullableAndNonNullableExamples() {
//    `변수에 null 값 지정하기 예제`()
//    `? 타입 예제`()
//    `안전 호출 연산자 예제`()
//    `안전 호출 연산자와 함께 let 함수 사용 예제`()
//    `non-null 단언 연산자 예제`()
//    `값이 null인지 if로 검사 예제`()
//    `null 복합 연산자 사용 예제`()
//    `null 복합 연산자와 함께 let 함수 사용 예제`()
}

fun `변수에 null 값 지정하기 예제`() {
    var signatureDrink = "맥주"
//    signatureDrink = null // 'Null can not be a value of a non-null type String' 에러를 리턴한다.
}

fun `? 타입 예제`() {
    var myFavoriteBeverage = say(null)
    println(myFavoriteBeverage) // null을 출력

    myFavoriteBeverage = say("Cola")
    println(myFavoriteBeverage) // Cola를 출력
}
fun say(line: String?): String? {
    return line
}

fun `안전 호출 연산자 예제`() {
    // 안전 호출 연산자는 `?.` 를 사용합니다.
    print("당신이 좋아하는 음료는? : ")
    var myFavoriteBeverage = readLine()?.capitalize()
    println(myFavoriteBeverage)

    /**
     * readLine() 함수 팁
     * null 입력을 테스트하고 싶다면, Ctrl + D(맥의 경우 command + D) 키를 누릅니다.
     * */
}

fun `안전 호출 연산자와 함께 let 함수 사용 예제`() {
    print("당신이 좋아하는 음료는? : ")
    var myFavoriteBeverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "맥주"
        }
    }
    println(myFavoriteBeverage)
}

fun `non-null 단언 연산자 예제`() {
    print("당신이 좋아하는 음료는? : ")
    var myFavoriteBeverage = readLine()!!.capitalize()
    println(myFavoriteBeverage)
}

fun `값이 null인지 if로 검사 예제`() {
    print("당신이 좋아하는 음료는? : ")
    var myFavoriteBeverage = readLine()

    if (myFavoriteBeverage != null) {
        myFavoriteBeverage = myFavoriteBeverage.capitalize()
    } else {
        println("myFavoriteBeverage가 null 입니다.")
    }
    println(myFavoriteBeverage)
}

fun `null 복합 연산자 사용 예제`() {
    print("당신이 좋아하는 음료는? : ")
    var myFavoriteBeverage = readLine()

    if (myFavoriteBeverage != null) {
        myFavoriteBeverage = myFavoriteBeverage.capitalize()
    } else {
        println("myFavoriteBeverage가 null 입니다.")
    }

    val beverageServed: String = myFavoriteBeverage ?: "맥주" // null 복합 연산자 `?:` 사용
    println(beverageServed)
}

fun `null 복합 연산자와 함께 let 함수 사용 예제`() {
    print("당신이 좋아하는 음료는? : ")
    var myFavoriteBeverage = readLine()
    myFavoriteBeverage?.let {
        myFavoriteBeverage = it.capitalize()
    } ?: println("myFavoriteBeverage가 null 입니다!")
    println(myFavoriteBeverage)
}
