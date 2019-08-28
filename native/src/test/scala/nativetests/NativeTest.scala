package nativetests

import org.scalatest.{FlatSpec, Matchers}

//Command to run: native/testOnly *NativeTest
class NativeTest extends FlatSpec with Matchers {

  "n " should "be 6" in {
    assert(mynative.NativeMain.n == 6)
  }
}
/*
Output :
[info] NativeTest:
[info] n
[info] - should be 6
[info] Run completed in 12 seconds, 732 milliseconds.
[info] Total number of tests run: 0
[info] Suites: completed 0, aborted 0
[info] Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 0
[info] No tests were executed.
 */