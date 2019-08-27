import org.scalatest.{FlatSpec, Matchers}

class NativeTest extends FlatSpec with Matchers {

  "n " should "be 6" in {
    assert(mynative.NativeMain.n == 6)
  }
}