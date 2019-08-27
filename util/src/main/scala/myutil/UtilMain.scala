package myutil
import mycommon.CommonMain._

object UtilMain {

  val x = 9
  def main(args: Array[String]): Unit = {
    println("Hello from util ")
    println("From shared value of y = "+ sharedY )
  }
}
