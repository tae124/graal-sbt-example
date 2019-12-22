package example
import org.graalvm.polyglot._
import org.graalvm.polyglot.proxy._
import scala.io.Source

object Hello extends App {
  println("Hello World!")
  val context = Context.create()
  val source = Source.fromFile("Hello.py")
  val pythonCode = source.getLines().mkString("\n")
  source.close()
  println(pythonCode)
  context.eval("python", pythonCode)
}