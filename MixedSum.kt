public class MixedSum {
  /***
  * This function assume input is of type int or string only
  * and returns the final output as a integers sum
  ***/
  public fun sum(mixed: List<Any>): Int {
      var result = 0
      for(x in mixed) {
        when(x){
          is Int -> result+= x
          is String -> result+= x.toInt()
        }
      }
      return result
  } 
}

import kotlin.test.assertEquals
import org.junit.Test
public class MixedSumTest {

  private val mixedSum = MixedSum()

  @Test
  public fun test_1() {
    assertEquals(10, mixedSum.sum(listOf(5, "5")))
  }


  @Test
  public fun test_2() {
    assertEquals(9, mixedSum.sum(listOf(5, "5", -1)))
  }
}
