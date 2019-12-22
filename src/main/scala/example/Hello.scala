package example
import org.graalvm.polyglot._
import org.graalvm.polyglot.proxy._

object Hello extends App {
  println("Hello World!")
  val context = Context.create()
  val pythonMsg = "Hello python"
  val pythonCode = s"""
for num in range(5, 10):
  print("${pythonMsg} - %d" % num)
"""
  println(pythonCode)
  context.eval("python", pythonCode)
}