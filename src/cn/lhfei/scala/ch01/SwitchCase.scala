package cn.lhfei.scala.ch01

/**
 * Created by lihf on 2015/1/18.
 */
object SwitchCase {
  def fibonacci(int: Any): Int = int match {
    case 0 => 0
    case 1 => 1
    case n:Int => fibonacci(n -1) + fibonacci(n -2)
    case _ => 0
  }

  def main(args: Array[String]): Unit = {
    println("" +fibonacci(3));
  }

}
