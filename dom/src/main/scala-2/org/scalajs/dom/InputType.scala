package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait InputType extends js.Any

object InputType {
  val insertText: InputType = "insertText".asInstanceOf[InputType]
  val insertReplacementText: InputType = "insertReplacementText".asInstanceOf[InputType]
  val insertLineBreak: InputType = "insertLineBreak".asInstanceOf[InputType]
  val insertParagraph: InputType = "insertParagraph".asInstanceOf[InputType]
  val insertOrderedList: InputType = "insertOrderedList".asInstanceOf[InputType]
  val insertUnorderedList: InputType = "insertUnorderedList".asInstanceOf[InputType]
  val insertHorizontalRule: InputType = "insertHorizontalRule".asInstanceOf[InputType]
  val insertFromYank: InputType = "insertFromYank".asInstanceOf[InputType]
  val insertFromDrop: InputType = "insertFromDrop".asInstanceOf[InputType]
  val insertFromPaste: InputType = "insertFromPaste".asInstanceOf[InputType]
  val insertFromPasteAsQuotation: InputType = "insertFromPasteAsQuotation".asInstanceOf[InputType]
  val insertTranspose: InputType = "insertTranspose".asInstanceOf[InputType]
  val insertCompositionText: InputType = "insertCompositionText".asInstanceOf[InputType]
  val insertLink: InputType = "insertLink".asInstanceOf[InputType]
  val deleteWordBackward: InputType = "deleteWordBackward".asInstanceOf[InputType]
  val deleteWordForward: InputType = "deleteWordForward".asInstanceOf[InputType]
  val deleteSoftLineBackward: InputType = "deleteSoftLineBackward".asInstanceOf[InputType]
  val deleteSoftLineForward: InputType = "deleteSoftLineForward".asInstanceOf[InputType]
  val deleteEntireSoftLine: InputType = "deleteEntireSoftLine".asInstanceOf[InputType]
  val deleteHardLineBackward: InputType = "deleteHardLineBackward".asInstanceOf[InputType]
  val deleteHardLineForward: InputType = "deleteHardLineForward".asInstanceOf[InputType]
  val deleteByDrag: InputType = "deleteByDrag".asInstanceOf[InputType]
  val deleteByCut: InputType = "deleteByCut".asInstanceOf[InputType]
  val deleteContent: InputType = "deleteContent".asInstanceOf[InputType]
  val deleteContentBackward: InputType = "deleteContentBackward".asInstanceOf[InputType]
  val deleteContentForward: InputType = "deleteContentForward".asInstanceOf[InputType]
  val historyUndo: InputType = "historyUndo".asInstanceOf[InputType]
  val historyRedo: InputType = "historyRedo".asInstanceOf[InputType]
  val formatBold: InputType = "formatBold".asInstanceOf[InputType]
  val formatItalic: InputType = "formatItalic".asInstanceOf[InputType]
  val formatUnderline: InputType = "formatUnderline".asInstanceOf[InputType]
  val formatStrikeThrough: InputType = "formatStrikeThrough".asInstanceOf[InputType]
  val formatSuperscript: InputType = "formatSuperscript".asInstanceOf[InputType]
  val formatSubscript: InputType = "formatSubscript".asInstanceOf[InputType]
  val formatJustifyFull: InputType = "formatJustifyFull".asInstanceOf[InputType]
  val formatJustifyCenter: InputType = "formatJustifyCenter".asInstanceOf[InputType]
  val formatJustifyRight: InputType = "formatJustifyRight".asInstanceOf[InputType]
  val formatJustifyLeft: InputType = "formatJustifyLeft".asInstanceOf[InputType]
  val formatIndent: InputType = "formatIndent".asInstanceOf[InputType]
  val formatOutdent: InputType = "formatOutdent".asInstanceOf[InputType]
  val formatRemove: InputType = "formatRemove".asInstanceOf[InputType]
  val formatSetBlockTextDirection: InputType = "formatSetBlockTextDirection".asInstanceOf[InputType]
  val formatSetInlineTextDirection: InputType = "formatSetInlineTextDirection".asInstanceOf[InputType]
  val formatBackColor: InputType = "formatBackColor".asInstanceOf[InputType]
  val formatFontColor: InputType = "formatFontColor".asInstanceOf[InputType]
  val formatFontName: InputType = "formatFontName".asInstanceOf[InputType]
}
