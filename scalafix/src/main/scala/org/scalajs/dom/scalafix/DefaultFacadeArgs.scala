package org.scalajs.dom.scalafix

import scala.meta._
import scalafix.v1._

class DefaultFacadeArgs extends SemanticRule("DefaultFacadeArgs") {

  override def fix(implicit doc: SemanticDocument): Patch =
    doc.tree.collect {

      case Defn.Def(mods, _, _, paramss, _, body) if Util.isJsNative(body) =>

        // https://github.com/scala-js/scala-js/issues/4553
        // `js.native` as default arg doesn't compile for top-level method facades.
        if (Util.isJSGlobal(mods)) {
          // Ignore for now
          Patch.empty

        } else {
          // Replace default argument with js.native
          lazy val jsNative = body.toString
          paramss.iterator.flatten.foldLeft(Patch.empty) { (patch, param) =>
            param.default match {
              case Some(d) if d.toString != jsNative => patch + Patch.replaceTree(d, jsNative)
              case _                                 => patch
            }
          }
        }
    }.asPatch

}
