package ch18.sec12

trait Reader {
  type In
  type Contents
  def read(in: In)
}

import scala.io._

class StringReader extends Reader {
  type In = String
  type Contents = String
  def read(fileName: String) = Source.fromFile(fileName, "UTF-8").mkString
}

import java.awt.image._
import java.io._
import javax.imageio._

class ImageReader extends Reader {
  type In = File
  type Contents = BufferedImage
  def read(file: In) = ImageIO.read(file)
}
