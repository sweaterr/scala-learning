package ch21.sec02

import java.io.File
import scala.io.Source

class RichFile(val from: File) {
  def read = Source.fromFile(from.getPath).mkString
}

object Main extends App {
  implicit def file2RichFile(from: File) = new RichFile(from)

  val contents = new File("RichFile.scala").read
  println(contents)
}
