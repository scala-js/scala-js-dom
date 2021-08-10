package mima

import scalafix.v1._

class Mima extends SemanticRule("Mima") {

  override def fix(implicit doc: SemanticDocument): Patch = {
    println("hello")
    Patch.empty
  }
}
