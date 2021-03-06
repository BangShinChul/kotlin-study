/**
 * kotlin 변수에 대해서 공부합니다.
 *
 * 참고 링크 : https://kotlinlang.org/docs/basic-syntax.html#variables
 * */


/**
 * 상수를 사용하려면 val 키워드 앞에 const 키워드를 사용하여 변수를 정의합니다.
 *
 * TIP :
 * const val의 이름을 부여할 때는 모두 대문자를 사용하고, 각 단어 사이에는 밑줄(`_`)을 넣는 것이 관례입니다.
 * 이렇게 하면 다른 var 및 val 변수들과 구분하기 쉬워서 코드를 알기 쉽게 해줍니다.
 * */
const val MAX_EXPERIENCE: Int = 5000

fun variableExample() {

    /**
     * 변수 선언하기
     *
     * 변수 정의 형식은 아래와 같습니다. :
     * 변수정의_키워드 변수_이름:타입_정의 = 값
     *
     * @sample var variable: Int = 5
    * */
    var experiencePoints: Int = 5

    /**
     * 선언한 변수를 출력합니다.
     * */
    println(experiencePoints)

    /**
     * 이런 방법도 사용할 수 있습니다.
     * */
    experiencePoints += 10
    println(experiencePoints)

    /**
     * 변수 타입과 알맞지 않은 값을 할당하면
     * 컴파일러에서 Type Mismatch 에러를 출력합니다.
     *
     * kotlin은 정적 타입 시스템(static type system)을 사용합니다.
     * 즉, 소스 코드에 정의된 타입을 컴파일러가 알고 있어서
     * 우리가 작성한 코드의 적합 여부를 컴파일 시점에서 알 수 있습니다.
     *
     * Intellij IDEA는 코드가 입력될 때 바로 적합 여부를 검사하며
     * 잘못된 타입을 변수에 지정하면 경고를 해줍니다.
     * */
//    var experiencePointsWrongCase: Int = "thirty-two" // 에러를 리턴합니다.
//    println(experiencePointsWrongCase)


    /**
     * 내장 타입 별 예제
     * */

    /**
     * String : 문자열
     * 특징    : String 형은 "(쌍따옴표)를 사용합니다.
     * */
    var message: String = "hello world"
    println(message)

    /**
     * Char : 단일 문자
     * 특징  : Char 형은 "(쌍따옴표) 가 아닌 '(홑따옴표)를 사용합니다.
     * */
    var alphabetFirst: Char = 'A'
    println(alphabetFirst)

    /**
     * Boolean : true(참) 혹은 false(거짓)
     * */
    var isTrue: Boolean = true
    var isFalse: Boolean = false
    println(isTrue)
    if(isFalse) {
        println("is False")
    }

    /**
     * Int : 정수
     * */
    var count: Int = 5
    var nameLength: Int = "john".length
    println(count)
    println(nameLength)

    /**
     * Double : 부동소수점의 실수
     * */
    var pi = 3.14
    println(pi)


    /**
     * 때로는 값을 변경할 수 없는 변수를 사용해야 할 경우가 있습니다.
     * 이 때에는 val 키워드를 사용하여 변수를 정의합니다.
     * */
    val playerName: String = "토마스"
    println(playerName)

    /**
     * 만약, val 으로 선언된 변수의 값을 변경한다면
     * Error:(3, 5) Kotlin: Val cannot be reassigned
     * 와 같은 에러를 출력합니다.
     * */
//    playerName = "마드리갈"


    /**
     * 코틀린에서는 타입 추론(type inference) 기능이 있습니다.
     * 변수를 선언하면서 초깃값을 지정하는 경우, 해당 변수의 타입을 생략할 수 있습니다.
     * */
    var yourName = "철수"
    println(yourName)

    /**
     * 타입 추론을 통해 초기화 된 변수에
     * 다른 타입의 값을 재할당 한다면
     * Error:(2, 33) Kotlin: Type mismatch: inferred type is String but Int wat expected
     * 와 같은 Type mismatch 에러를 출력합니다.
     * */
    // yourName = 4

    println(MAX_EXPERIENCE)
}
