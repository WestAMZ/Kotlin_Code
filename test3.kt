//Functions created with lambdas operators
data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
	//we can change thi lamabda to [it.first == if.second ] 
    val rightPositions = secret.zip(guess).count { (x: Char, y: Char) -> x == y }

    val commonLetters = "ABCDEF".sumBy { ch ->
	//we can change the lambda [c->c==ch] to use the it key word
	// [it = ch]
        Math.min(secret.count {c-> c ==ch  }, guess.count {c-> c ==ch  })
    }
    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main(args: Array<String>) {
    val result = Evaluation(rightPosition = 1, wrongPosition = 1)
    evaluateGuess("BCDF", "ACEB") eq result
    evaluateGuess("AAAF", "ABCA") eq result
    evaluateGuess("ABCA", "AAAF") eq result
}
