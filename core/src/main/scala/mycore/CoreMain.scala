package mycore

import mycommon.CommonMain._

//This is the jvm main and the code checked the accessibility shared in the common sub-project
//Running main :core/runMain mycore.CoreMain
object CoreMain {

  val a = 4
  def main(args: Array[String]): Unit = {
    println("Hello from core ")
    println("From shared value of x ="+ sharedX )
  }

}
