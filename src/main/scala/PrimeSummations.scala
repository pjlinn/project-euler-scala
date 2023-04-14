import scala.collection.mutable.ArrayBuffer
import scala.math.sqrt


object PrimeSummations{
    def solve(x: Int): Int = {
        0
    }

    def generateListOfPrimesUpTo(x: Int): ArrayBuffer[Int] = {
        val primes = ArrayBuffer[Int](2, 3)

        if (x < 5) {
            // do nothing
        } else {
            for (i <- 5 to x) {
                var isPrime = true

                for (prime <- primes) {
                    if (prime <= sqrt(i)) {
                        if (i % prime == 0) {
                            isPrime = false
                        }
                    }
                }

                if (isPrime) {
                    primes += i
                }
            }
        }

        println(primes.mkString(", "))
        return primes
    }
}