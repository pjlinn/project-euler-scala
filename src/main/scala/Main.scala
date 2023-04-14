import scala.collection.mutable.Map

object Main extends App {
  val generatedListOfPrimes = PrimeSummations.generateListOfPrimesUpTo(11)

  var map: Map[Int, Int] = collection.mutable.Map[Int, Int]().withDefaultValue(0)

  for (i <- 1 to 10) {
    for (levelOnePrime <- generatedListOfPrimes) {
      for (levelTwoPrime <- generatedListOfPrimes) {
        if (levelTwoPrime >= levelOnePrime) {
          var summedValue = levelOnePrime + levelTwoPrime
          if (map.contains(summedValue)) {
            map(summedValue) += 1
          } else {
            map = map + (summedValue -> 1)
          }
        }
      }
    }
  }

  println(map)

}