package utiltests

import org.scalatest.{FlatSpec, Matchers}

/* Command to run the test
 util/testOnly *UtilTest
 */
class UtilTest extends FlatSpec with Matchers {

  "x " should "be 9" in {
    assert(myutil.UtilMain.x== 9)
  }
}

/*output
[info] UtilTest:
[info] x
[info] - should be 9
[info] Run completed in 2 seconds, 620 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
*/
class UtilTest2 extends FlatSpec with Matchers {

  "x " should "be 9" in {
    assert(myutil.UtilMain.x== 8)
  }
}