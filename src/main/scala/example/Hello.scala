package example
import org.graalvm.polyglot._
import org.graalvm.polyglot.proxy._

object Hello extends App {
  println("Hello World!")
  val context = Context.create()
  context.eval("python", "print('Hello GraalPython from Polyglot')")
}