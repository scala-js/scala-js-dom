/**
 * Documentation marked "MDN" is thanks to Mozilla Contributors
 * at https://developer.mozilla.org/en-US/docs/Web/API and available
 * under the Creative Commons Attribution-ShareAlike v2.5 or later.
 * http://creativecommons.org/licenses/by-sa/2.5/
 *
 * Everything else is under the MIT License
 * http://opensource.org/licenses/MIT
 */

package org.scalajs.dom

import scala.scalajs.js

/**
 * The HTMLTableElement interface provides special properties and methods (beyond
 * the regular HTMLElement object interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of tables in an HTML
 * document.
 *
 * MDN
 */
class HTMLTableElement extends HTMLElement {
  /**
   * Is a DOMString containing the length in pixels or in percentage of the desired width
   * fo the entire table. It reflects the obsolete width attribute.
   *
   * MDN
   */
  var width: js.String = ???

  /**
   * Is a DOMString containing the width in pixels of the horizontal and vertical
   * separation between cells. It reflects the obsolete cellspacing attribute.
   *
   * MDN
   */
  var cellSpacing: js.String = ???
  /**
   * Is an HTMLTableSectionElement representing the first <tfoot> that is a child of
   * the element, or null if none is found. When set, if the object doesn't represent a
   * <tfoot>, a DOMException with the HierarchyRequestError name is thrown. If a
   * correct object is given, it is inserted in the tree immediately before the first
   * element that is neither a <caption>, a <colgroup>, nor a <thead>, or as the last
   * child if there is no such element, and the first <tfoot> that is a child of this
   * element is removed from the tree, if any.
   *
   * MDN
   */
  var tFoot: HTMLTableSectionElement = ???
  /**
   * Is a DOMString containing the type of the external borders of the table. It reflects
   * the obsolete frame attribute and can take one of the following values: "void",
   * "above", "below", "hsides", "vsides", "lhs", "rhs", "box", or "border".
   *
   * MDN
   */
  var frame: js.String = ???

  /**
   * Returns a live HTMLCollection containing all the rows of the element, that is all
   * <tr> that are a child of the element, or a child or one of its <thead>, <tbody> and
   * <tfoot> children. The rows members of a <thead> appear first, in tree order, and
   * those members of a <tbody> last, also in tree order. The HTMLCollection is live and
   * is automatically updated when the HTMLTableElement changes.
   *
   * MDN
   */
  var rows: HTMLCollection = ???
  /**
   * Is a DOMString containing the type of the internal borders of the table. It reflects
   * the obsolete rules attribute and can take one of the following values: "none",
   * "groups", "rows", "cols", or "all".
   *
   * MDN
   */
  var rules: js.String = ???
  var cols: js.Number = ???
  /**
   * Is a DOMString containing a description of the purpose or the structure of the
   * table. It reflects the obsolete summary attribute.
   *
   * MDN
   */
  var summary: js.String = ???
  /**
   * Is an HTMLTableCaptionElement representing the first <caption> that is a child of
   * the element, or null if none is found. When set, if the object doesn't represent a
   * <caption>, a DOMException with the HierarchyRequestError name is thrown. If a
   * correct object is given, it is inserted in the tree as the first child of this element
   * and the first <caption> that is a child of this element is removed from the tree, if
   * any.
   *
   * MDN
   */
  var caption: HTMLTableCaptionElement = ???
  /**
   * Returns a live HTMLCollection containing all the <tbody> of the element. The
   * HTMLCollection is live and is automatically updated when the HTMLTableElement
   * changes.
   *
   * MDN
   */
  var tBodies: HTMLCollection = ???
  /**
   * Is an HTMLTableSectionElement representing the first <thead> that is a child of
   * the element, or null if none is found. When set, if the object doesn't represent a
   * <thead>, a DOMException with the HierarchyRequestError name is thrown. If a
   * correct object is given, it is inserted in the tree immediately before the first
   * element that is neither a <caption>, nor a <colgroup>, or as the last child if there
   * is no such element, and the first <thead> that is a child of this element is removed
   * from the tree, if any.
   *
   * MDN
   */
  var tHead: HTMLTableSectionElement = ???
  /**
   * Is a DOMString containing an enumerated value reflecting the align attribute. It
   * indicates the alignment of the element's contents with respect to the surrounding
   * context. The possible values are "left", "right", and "center".
   *
   * MDN
   */
  var align: js.String = ???

  /**
   * Is a DOMString containing the width in pixels of the horizontal and vertical sapce
   * between cell content and cell borders. It reflects the obsolete cellpadding
   * attribute.
   *
   * MDN
   */
  var cellPadding: js.String = ???
  /**
   * Is a DOMString containing the width in pixels of the border of the table. It reflects
   * the obsolete border attribute.
   *
   * MDN
   */
  var border: js.String = ???
  /**
   * Removes the row corresponding to the index given in parameter. If the index value is
   * -1 the last row is removed; if it smaller than -1 or greater than the amount of rows in
   * the collection, a DOMException with the value IndexSizeError is raised.
   *
   * MDN
   */
  def deleteRow(index: js.Number = ???): Unit = ???

  def createTBody(): HTMLElement = ???

  /**
   * Removes the first <caption> that is a child of the element.
   *
   * MDN
   */
  def deleteCaption(): Unit = ???
  /**
   * Returns an HTMLElement representing a new row of the table. It inserts it in the rows
   * collection immediately before the <tr> element at the givent index position. If
   * necessary a <tbody> is created. If the index is -1, the new row is appended to the
   * collection. If the index is smaller than -1 or greater than the number of rows in the
   * collection, a DOMException with the value IndexSizeError is raised.
   *
   * MDN
   */
  def insertRow(index: js.Number = ???): HTMLElement = ???



  /**
   * Removes the first <tfoot> that is a child of the element.
   *
   * MDN
   */
  def deleteTFoot(): Unit = ???

  /**
   * Returns an HTMLElement representing the first <thead> that is a child of the
   * element. If none is found, a new one is created and inserted in the tree immediately
   * before the first element that is neither a <caption>, nor a <colgroup>, or as the
   * last child if there is no such element.
   *
   * MDN
   */
  def createTHead(): HTMLElement = ???

  /**
   * Removes the first <thead> that is a child of the element.
   *
   * MDN
   */
  def deleteTHead(): Unit = ???

  /**
   * Returns an HTMLElement representing the first <caption> that is a child of the
   * element. If none is found, a new one is created and inserted in the tree as the first
   * child of the <table> element.
   *
   * MDN
   */
  def createCaption(): HTMLElement = ???

  def moveRow(indexFrom: js.Number = ???, indexTo: js.Number = ???): Object = ???

  /**
   * Returns an HTMLElement representing the first <tfoot> that is a child of the
   * element. If none is found, a new one is created and inserted in the tree immediately
   * before the first element that is neither a <caption>, a <colgroup>, nor a <thead>,
   * or as the last child if there is no such element.
   *
   * MDN
   */
  def createTFoot(): HTMLElement = ???
}

/**
 * The HTMLTableDataCellElement interface provides special properties and
 * methods (beyond the regular HTMLTableCellElement and HTMLElement interfaces it
 * also has available to it by inheritance) for manipulating the layout and
 * presentation of table data cells in an HTML document.
 *
 * MDN
 */
class HTMLTableDataCellElement extends HTMLTableCellElement {
}

/**
 * The HTMLBaseElement interface contains the base URI for a document. This object
 * inherits all of the properties and methods as described in the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLBaseElement extends HTMLElement {
  /**
   * Is a DOMString that reflects the target HTML attribute, containing a default
   * target browsing context or frame for elements that do not have a target reference
   * specified.
   *
   * MDN
   */
  var target: js.String = ???
  /**
   * Is a DOMString that reflects the href HTML attribute, containing a base URL for
   * relative URLs in the document.
   *
   * MDN
   */
  var href: js.String = ???
}

trait HTMLNextIdElement extends HTMLElement {
  var n: js.String = ???
}

/**
 * The HTMLParagraphElement interface provides special properties (beyond those
 * of the regular HTMLElement object interface it inherits) for manipulating <p>
 * elements.
 *
 * MDN
 */
class HTMLParagraphElement extends HTMLElement {
  /**
   * Enumerated property indicating alignment of the element's contents with respect
   * to the surrounding context. The possible values are "left", "right", "justify",
   * and "center".
   *
   * MDN
   */
  var align: js.String = ???
}


trait HTMLAreasCollection extends HTMLCollection {
  def remove(index: js.Number = ???): Unit = ???

  def add(element: HTMLElement, before: js.Any = ???): Unit = ???
}

class HTMLAppletElement extends HTMLElement {
  var width: js.Number = ???
  var codeType: js.String = ???
  var `object`: js.String = ???
  var form: HTMLFormElement = ???
  var code: js.String = ???
  var archive: js.String = ???
  var alt: js.String = ???
  var standby: js.String = ???
  var classid: js.String = ???
  var name: js.String = ???
  var useMap: js.String = ???
  var data: js.String = ???
  var height: js.String = ???
  var altHtml: js.String = ???
  var contentDocument: Document = ???
  var codeBase: js.String = ???
  var declare: js.Boolean = ???
  var `type`: js.String = ???
  var BaseHref: js.String = ???
}

/**
 * The HTMLOListElement interface provides special properties (beyond those
 * defined on the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating ordered list elements.
 *
 * MDN
 */
class HTMLOListElement extends HTMLElement {
  /**
   * Is a long value reflecting the start and defining the value of the first number of the
   * first element of the list.
   *
   * MDN
   */
  var start: js.Number = ???
}

/**
 * DOM select elements share all of the properties and methods of other HTML elements
 * described in the element section. They also have the specialized interface
 * HTMLSelectElement (or HTML 4 HTMLSelectElement).
 *
 * MDN
 */
class HTMLSelectElement extends HTMLElement {
  /**
   * The set of <option> elements contained by this element. Read only.
   *
   * MDN
   */
  val options: HTMLSelectElement = ???
  /**
   * The value of this form control, that is, of the first selected option.
   *
   * MDN
   */
  var value: js.String = ???
  /**
   * The form that this element is associated with. If this element is a descendant of a
   * form element, then this attribute is the ID of that form element. If the element is
   * not a descendant of a form element, then: HTML5 The attribute can be the ID of any form
   * element in the same document. HTML 4 The attribute is null. Read only.
   *
   * MDN
   */
  val form: HTMLFormElement = ???
  /**
   * Reflects the name HTML attribute, containing the name of this control used by
   * servers and DOM search functions.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * Reflects the size HTML attribute, which contains the number of visible items in the
   * control. The default is 1, HTML5 unless multiple is true, in which case it is 4.
   *
   * MDN
   */
  var size: js.Number = ???
  /**
   * The number of <option> elements in this select element.
   *
   * MDN
   */
  var length: js.Number = ???
  /**
   * The index of the first selected <option> element.
   *
   * MDN
   */
  var selectedIndex: js.Number = ???
  /**
   * Reflects the multiple HTML attribute, whichindicates whether multiple items can
   * be selected.
   *
   * MDN
   */
  var multiple: js.Boolean = ???
  var `type`: js.String = ???
  /**
   * Removes the element at the specified index from the options collection for this
   * select element.
   *
   * MDN
   */
  def remove(index: js.Number = ???): Unit = ???
  /**
   * Adds an element to the collection of option elements for this select element.
   *
   * MDN
   */
  def add(element: HTMLElement, before: js.Any = ???): Unit = ???

  def item(name: js.Any = ???, index: js.Any = ???): js.Dynamic = ???

  def namedItem(name: js.String): js.Dynamic = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: js.String): js.Any = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: js.String, v: js.Any): Unit = ???

  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This attribute is the empty string if the control is not a
   * candidate for constraint validation (willValidate is false), or it satisfies its
   * constraints. Read only. HTML5
   *
   * MDN
   */
  val validationMessage: js.String = ???
  /**
   * Reflects the autofocus HTML attribute, which indicates whether the control
   * should have input focus when the page loads, unless the user overrides it, for
   * example by typing in a different control. Only one form-associated element in a
   * document can have this attribute specified. HTML5
   *
   * MDN
   */
  var autofocus: js.Boolean = ???
  /**
   * The validity states that this control is in. Read only. HTML5
   *
   * MDN
   */
  val validity: ValidityState = ???
  /**
   * Reflects the required HTML attribute, which indicates whether the user is
   * required to select a value before submitting the form. HTML5
   *
   * MDN
   */
  var required: js.Boolean = ???
  /**
   * Indicates whether the button is a candidate for constraint validation. It is false
   * if any conditions bar it from constraint validation. Read only. HTML5
   *
   * MDN
   */
  val willValidate: js.Boolean = ???

  def checkValidity(): js.Boolean = ???

  def setCustomValidity(error: js.String): Unit = ???
}

trait HTMLBlockElement extends HTMLElement {
  var width: js.Number = ???
  var cite: js.String = ???
}

/**
 * The HTMLMetaElement interface contains descriptive metadata about a document.
 * Itt inherits all of the properties and methods described in the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLMetaElement extends HTMLElement {
  /**
   * Gets or sets the name of an HTTP response header to define for a document.
   *
   * MDN
   */
  var httpEquiv: js.String = ???
  /**
   * Gets or sets the name of a meta-data property to define for a document.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * Gets or sets the value of meta-data property.
   *
   * MDN
   */
  var content: js.String = ???
  var url: js.String = ???
  /**
   * Gets or sets the name of a scheme used to interpret the value of a meta-data property.
   *
   * MDN
   */
  var scheme: js.String = ???
  var charset: js.String = ???
}

class HTMLDDElement extends HTMLElement {
  var noWrap: js.Boolean = ???
}

/**
 * The HTMLLinkElement interface represents reference information for external
 * resources and the relationship of those resources to a document and vice-versa.
 * This object inherits all of the properties and methods of the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLLinkElement extends HTMLElement with LinkStyle {
  /**
   * Gets or sets the forward relationship of the linked resource from the document to
   * the resource.
   *
   * MDN
   */
  var rel: js.String = ???
  /**
   * Gets or sets the name of the target frame to which the resource applies.
   *
   * MDN
   */
  var target: js.String = ???
  /**
   * Gets or sets the URI for the target resource.
   *
   * MDN
   */
  var href: js.String = ???
  /**
   * Gets or sets a list of one or more media formats to which the resource applies.
   *
   * MDN
   */
  var media: js.String = ???
  /**
   * Gets or sets the reverse relationship of the linked resource from the resource to
   * the document.
   *
   * MDN
   */
  var rev: js.String = ???
  var `type`: js.String = ???
  /**
   * Gets or sets the character encoding for the target resource.
   *
   * MDN
   */
  var charset: js.String = ???
  /**
   * Gets or sets the language code for the linked resource.
   *
   * MDN
   */
  var hreflang: js.String = ???
}

class HTMLFontElement extends HTMLElement {
  var face: js.String = ???
}

/**
 * The HTMLTableCaptionElement interface special properties (beyond the regular
 * HTMLElement interface it also has available to it by inheritance) for
 * manipulating table caption elements.
 *
 * MDN
 */
class HTMLTableCaptionElement extends HTMLElement {
  /**
   * Enumerated attribute indicating alignment of the caption with respect to the
   * table.
   *
   * MDN
   */
  var align: js.String = ???
  var vAlign: js.String = ???
}

/**
 * The HTMLOptionElement interface represents <option> elements and inherits all
 * classes and methods of the HTMLElement interface.
 *
 * MDN
 */
class HTMLOptionElement extends HTMLElement {
  /**
   * The position of the option within the list of options it belongs to, in tree-order.
   * If the option is not part of a list of options, like when it is part of the <datalist>
   * element, the value is 0.
   *
   * MDN
   */
  var index: js.Number = ???
  /**
   * Contains the initial value of the selected HTML attribute, indicating whether the
   * option is selected by default or not.
   *
   * MDN
   */
  var defaultSelected: js.Boolean = ???
  /**
   * Reflects the value of the value HTML attribute, if it exists; otherwise reflects
   * value of the Node.textContent property.
   *
   * MDN
   */
  var value: js.String = ???
  /**
   * Contains the text content of the element.
   *
   * MDN
   */
  var text: js.String = ???
  /**
   * If the option is a descendent of a <select> element, then this property has the same
   * value as the form property of the corresponding HTMLSelectElement object;
   * otherwise, it is null.
   *
   * MDN
   */
  var form: HTMLFormElement = ???
  /**
   * Reflects the value of the label HTML attribute, which provides a label for the
   * option. If this attribute isn't specifically set, reading it returns the
   * element's text content.
   *
   * MDN
   */
  var label: js.String = ???
  /**
   * Indicates whether the option is currently selected.
   *
   * MDN
   */
  var selected: js.Boolean = ???

  def create(): HTMLOptionElement = ???
}

/**
 * The HTMLMapElement interface provides special properties and methods (beyond
 * those of the regular object HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of map elements.
 *
 * MDN
 */
class HTMLMapElement extends HTMLElement {
  /**
   * Is a DOMString representing the <map> element for referencing it other context. If
   * the id attribute is set, this must have the same value; and it cannot be null or empty.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * Is a live HTMLCollection representing the <area> elements associated to this
   * <map>.
   *
   * MDN
   */
  var areas: HTMLAreasCollection = ???
}

class HTMLMenuElement extends HTMLElement {
  var `type`: js.String = ???
}

/**
 * HTMLCollection is an interface representing a generic collection of elements (in
 * document order) and offers methods and properties for traversing the list.
 *
 * MDN
 */
class HTMLCollection extends js.Object {
  /**
   * The number of items in the collection.
   *
   * MDN
   */
  var length: js.Number = ???
  /**
   * Returns the specific node at the given zero-based index into the list. Returns null
   * if the index is out of range.
   *
   * MDN
   */
  def item(nameOrIndex: js.Any = ???, optionalIndex: js.Any = ???): Element = ???


  /**
   * Returns the specific node whose ID or, as a fallback, name matches the string
   * specified by name. Matching by name is only done as a last resort, only in HTML, and
   * only if the referenced element supports the name attribute. Returns null if no node
   * exists by the given name.
   *
   * MDN
   */
  def namedItem(name: js.String): Element = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: js.Number): Element = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: js.Number, v: Element): Unit = ???
}

/**
 * The HTMLImageElement interface provides special properties and methods (beyond
 * the regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of <img> elements.
 *
 * MDN
 */
class HTMLImageElement extends HTMLElement {
  /**
   * Reflects the width HTML attribute, indicating the rendered width of the image in
   * CSS pixels.
   *
   * MDN
   */
  var width: js.Number = ???
  var vspace: js.Number = ???
  /**
   * Intrinsic height of the image in CSS pixels, if it is available; otherwise, 0.
   *
   * MDN
   */
  var naturalHeight: js.Number = ???
  /**
   * Reflects the alt HTML attribute, indicating fallback context for the image.
   *
   * MDN
   */
  var alt: js.String = ???
  /**
   * Indicates the alignment of the image with respect to the surrounding context.
   *
   * MDN
   */
  var align: js.String = ???
  /**
   * Reflects the src HTML attribute, containing the URL of the image.
   *
   * MDN
   */
  var src: js.String = ???
  /**
   * Reflects the usemap HTML attribute, containing a partial URL of a map element.
   *
   * MDN
   */
  var useMap: js.String = ???
  /**
   * Intrinsic width of the image in CSS pixels, if it is available; otherwise, 0.
   *
   * MDN
   */
  var naturalWidth: js.Number = ???
  var name: js.String = ???
  /**
   * Reflects the height HTML attribute, indicating the rendered height of the image in
   * CSS pixels.
   *
   * MDN
   */
  var height: js.Number = ???
  /**
   * Width of the border around the image.
   *
   * MDN
   */
  var border: js.String = ???
  /**
   * Space to the left and right of the image.
   *
   * MDN
   */
  var hspace: js.Number = ???
  /**
   * URI of a long description of the image.
   *
   * MDN
   */
  var longDesc: js.String = ???
  var href: js.String = ???
  /**
   * Reflects the ismap HTML attribute, indicating that the image is part of a
   * server-side image map.
   *
   * MDN
   */
  var isMap: js.Boolean = ???
  /**
   * True if the browser has fetched the image, and it is in a supported image type that was
   * decoded without errors.
   *
   * MDN
   */
  var complete: js.Boolean = ???

  def create(): HTMLImageElement = ???

}

/**
 * The HTMLAreaElement interface provides special properties and methods (beyond
 * those of the regular object HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of area elements.
 *
 * MDN
 */
class HTMLAreaElement extends HTMLElement {
  /**
   * Is a DOMString containing the protocol component (including trailing colon ':'),
   * of the referenced URL.
   *
   * MDN
   */
  var protocol: js.String = ???
  /**
   * Is a DOMString containing tThe search element (including leading question mark
   * '?'), if any, of the referenced URL.
   *
   * MDN
   */
  var search: js.String = ???
  /**
   * Is a DOMString that reflects the alt HTML attribute, containing alternative text
   * for the element.
   *
   * MDN
   */
  var alt: js.String = ???
  /**
   * Is a DOMString that reflects the coords HTML attribute, containing coordinates to
   * define the hot-spot region.
   *
   * MDN
   */
  var coords: js.String = ???
  /**
   * Is a DOMString containing the hostname in the referenced URL.
   *
   * MDN
   */
  var hostname: js.String = ???
  /**
   * Is a DOMString containing the port component, if any, of the referenced URL.
   *
   * MDN
   */
  var port: js.String = ???
  /**
   * Is a DOMString containing the path name component, if any, of the referenced URL.
   *
   * MDN
   */
  var pathname: js.String = ???
  /**
   * Is a DOMString containing the hostname and port (if it's not the default port) in the
   * referenced URL.
   *
   * MDN
   */
  var host: js.String = ???
  /**
   * Is a DOMString containing the fragment identifier (including the leading hash
   * mark (#)), if any, in the referenced URL.
   *
   * MDN
   */
  var hash: js.String = ???
  /**
   * Is a DOMString that reflects the target HTML attribute, indicating the browsing
   * context in which to open the linked resource.
   *
   * MDN
   */
  var target: js.String = ???
  /**
   * Is a DOMString containing that reflects the href HTML attribute, containing a
   * valid URL of a linked resource.
   *
   * MDN
   */
  var href: js.String = ???
  /**
   * Is a Boolean flag indicating if the area is inactive (true) or active (false).
   *
   * MDN
   */
  var noHref: js.Boolean = ???
  /**
   * Is a DOMString teflects the shape HTML attribute, indicating the shape of the
   * hot-spot, limited to known values.
   *
   * MDN
   */
  var shape: js.String = ???

}

/**
 * The HTMLButtonElement interface provides properties and methods (beyond the
 * <button> object interface it also has available to them by inheritance) for
 * manipulating the layout and presentation of button elements.
 *
 * MDN
 */
class HTMLButtonElement extends HTMLElement {
  /**
   * The current form control value of the button.
   *
   * MDN
   */
  var value: js.String = ???
  var status: js.Any = ???
  /**
   * The form that this button is associated with. If the button is a descendant of a form
   * element, then this attribute is the ID of that form element. If the button is not a
   * descendant of a form element, then the attribute can be the ID of any form element in
   * the same document it is related to, or the null value if none matches.
   *
   * MDN
   */
  var form: HTMLFormElement = ???
  /**
   * The name of the object when submitted with a form. HTML5 If specified, it must not be
   * the empty string.
   *
   * MDN
   */
  var name: js.String = ???
  var `type`: js.String = ???
  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This attribute is the empty string if the control is not a
   * candidate for constraint validation (willValidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  var validationMessage: js.String = ???
  /**
   * A name or keyword indicating where to display the response that is received after
   * submitting the form. If specified, this attribute overrides the target attribute
   * of the <form> element that owns this element.
   *
   * MDN
   */
  var formTarget: js.String = ???
  /**
   * Indicates whether the button is a candidate for constraint validation. It is false
   * if any conditions bar it from constraint validation.
   *
   * MDN
   */
  var willValidate: js.Boolean = ???
  /**
   * The URI of a resource that processes information submitted by the button. If
   * specified, this attribute overrides the action attribute of the <form> element
   * that owns this element.
   *
   * MDN
   */
  var formAction: js.String = ???
  /**
   * The control should have input focus when the page loads, unless the user overrides
   * it, for example by typing in a different control. Only one form-associated element
   * in a document can have this attribute specified.
   *
   * MDN
   */
  var autofocus: js.Boolean = ???
  /**
   * The validity states that this button is in.
   *
   * MDN
   */
  var validity: ValidityState = ???
  /**
   * Indicates that the form is not to be validated when it is submitted. If specified,
   * this attribute overrides the enctype attribute of the <form> element that owns
   * this element.
   *
   * MDN
   */
  var formNoValidate: js.String = ???
  var formEnctype: js.String = ???
  /**
   * The HTTP method that the browser uses to submit the form. If specified, this
   * attribute overrides the method attribute of the <form> element that owns this
   * element.
   *
   * MDN
   */
  var formMethod: js.String = ???

  def checkValidity(): js.Boolean = ???

  def setCustomValidity(error: js.String): Unit = ???
}

/**
 * The HTMLSourceElement interface provides special properties (beyond the
 * regular HTMLElement object interface it also has available to it by inheritance)
 * for manipulating <source> elements.
 *
 * MDN
 */
class HTMLSourceElement extends HTMLElement {
  /**
   * Reflects the src HTML attribute, containing the URL for the media resource.
   *
   * MDN
   */
  var src: js.String = ???
  /**
   * Reflects the media HTML attribute, containing the intended type of the media
   * resource.
   *
   * MDN
   */
  var media: js.String = ???
  var `type`: js.String = ???
}

/**
 * DOM Script objects expose the HTMLScriptElement (or HTML 4 HTMLScriptElement)
 * interface, which provides special properties and methods (beyond the regular
 * element object interface they also have available to them by inheritance) for
 * manipulating the layout and presentation of <script> elements.
 *
 * MDN
 */
class HTMLScriptElement extends HTMLElement {
  var defer: js.Boolean = ???
  /**
   * The IDL attribute text must return a concatenation of the contents of all the Text
   * nodes that are children of the <script> element (ignoring any other nodes such as
   * comments or elements), in tree order. On setting, it must act the same way as the
   * textContent IDL attribute. Note: When inserted using the document.write()
   * method, <script> elements execute (typically synchronously), but when inserted
   * using innerHTML and outerHTML attributes, they do not execute at all.
   *
   * MDN
   */
  var text: js.String = ???
  /**
   * Represents gives the address of the external script resource to use. It reflects
   * the src attribute.
   *
   * MDN
   */
  var src: js.String = ???
  var htmlFor: js.String = ???
  /**
   * Represents the character encoding of the external script resource. It reflects
   * the charset attribute.
   *
   * MDN
   */
  var charset: js.String = ???
  var `type`: js.String = ???
  var event: js.String = ???
  /**
   * The async and defer attributes are boolean attributes that indicate how the script
   * should be executed. The defer and async attributes must not be specified if the src
   * attribute is not present. There are three possible modes that can be selected using
   * these attributes. If the async attribute is present, then the script will be
   * executed asynchronously, as soon as it is available. If the async attribute is not
   * present but the defer attribute is present, then the script is executed when the
   * page has finished parsing. If neither attribute is present, then the script is
   * fetched and executed immediately, before the user agent continues parsing the
   * page. Note: The exact processing details for these attributes are, for mostly
   * historical reasons, somewhat non-trivial, involving a number of aspects of HTML.
   * The implementation requirements are therefore by necessity scattered
   * throughout the specification. These algorithms describe the core of this
   * processing, but these algorithms reference and are referenced by the parsing
   * rules for <script> start and end tags in HTML, in foreign content, and in XML, the
   * rules for the document.write() method, the handling of scripting, etc. The defer
   * attribute may be specified even if the async attribute is specified, to cause
   * legacy Web browsers that only support defer (and not async) to fall back to the defer
   * behavior instead of the synchronous blocking behavior that is the default.
   *
   * MDN
   */
  var async: js.Boolean = ???
}

/**
 * The HTMLTableRowElement interface provides special properties and methods
 * (beyond the HTMLElement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of rows in an HTML table.
 *
 * MDN
 */
class HTMLTableRowElement extends HTMLElement with HTMLTableAlignment {
  /**
   * Returns a long value which gives the logical position of the row within the entire
   * table. If the row is not part of a table, returns -1.
   *
   * MDN
   */
  var rowIndex: js.Number = ???
  /**
   * Returns a live HTMLCollection containing the cells in the row. The HTMLCollection
   * is live and is automatically updated when cells are added or removed.
   *
   * MDN
   */
  var cells: HTMLCollection = ???
  /**
   * Is a DOMString containing an enumerated value reflecting the align attribute. It
   * indicates the alignment of the element's contents with respect to the surrounding
   * context. The possible values are "left", "right", and "center".
   *
   * MDN
   */
  var align: js.String = ???
  var borderColorLight: js.Any = ???
  /**
   * Returns a long value which gives the logical position of the row within the table
   * section it belongs to. If the row is not part of a section, returns -1.
   *
   * MDN
   */
  var sectionRowIndex: js.Number = ???
  var borderColor: js.Any = ???
  var height: js.Any = ???
  var borderColorDark: js.Any = ???
  /**
   * Removes the cell at the given position in the row. If the given position is greater
   * (or equal as it starts at zero) than the amount of cells in the row, or is smaller than
   * 0, it raises a DOMException with the IndexSizeError value.
   *
   * MDN
   */
  def deleteCell(index: js.Number = ???): Unit = ???
  /**
   * Inserts a new cell just before the given position in the row. If the given position is
   * not given or is -1, it appends the cell to the row. If the given position is greater (or
   * equal as it starts at zero) than the amount of cells in the row, or is smaller than -1,
   * it raises a DOMException with the IndexSizeError value.
   *
   * MDN
   */
  def insertCell(index: js.Number = ???): HTMLElement = ???
}

/**
 * The HTMLHtmlElement interface serves as the root node for a given HTML document. 
 * This object inherits the properties and methods described in the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLHtmlElement extends HTMLElement {
  /**
   * Version of the HTML Document Type Definition (DTD) that governs this document.
   * This property should not be used any more as it is non-conforming. Simply omit it.
   *
   * MDN
   */
  var version: js.String = ???
}

class HTMLFrameElement extends HTMLElement with GetSVGDocument {
  var width: js.Any = ???
  var scrolling: js.String = ???
  var marginHeight: js.String = ???
  var marginWidth: js.String = ???
  var borderColor: js.Any = ???
  var frameSpacing: js.Any = ???
  var frameBorder: js.String = ???
  var noResize: js.Boolean = ???
  var contentWindow: Window = ???
  var src: js.String = ???
  var name: js.String = ???
  var height: js.Any = ???
  var contentDocument: Document = ???
  var border: js.String = ???
  var longDesc: js.String = ???
  var onload: js.Function1[Event, _] = ???
  var security: js.Any = ???


}

/**
 * The HTMLQuoteElement interface provides special properties and methods (beyond
 * the regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating quoting elements, like <blockquote> and <q>, but not the <cite>
 * element.
 *
 * MDN
 */
class HTMLQuoteElement extends HTMLElement {
  var dateTime: js.String = ???
  /**
   * Reflects the cite HTML attribute, containing a URL for the source of the quotation.
   *
   * MDN
   */
  var cite: js.String = ???
}

/**
 * The HTMLTableHeaderCellElement interface provides special properties and
 * methods (beyond the regular HTMLTableCellElement and HTMLElement interfaces it
 * also has available to it by inheritance) for manipulating the layout and
 * presentation of table header cells in an HTML document.
 *
 * MDN
 */
class HTMLTableHeaderCellElement extends HTMLTableCellElement {
}

/**
 * The HTMLDListElement interface provides special properties (beyond those of the
 * regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating definition list elements.
 *
 * MDN
 */
class HTMLDListElement extends HTMLElement {
}

class HTMLFrameSetElement extends HTMLElement {
  var ononline: js.Function1[Event, _] = ???
  var borderColor: js.Any = ???
  var rows: js.String = ???
  var cols: js.String = ???
  var frameSpacing: js.Any = ???
  var onmessage: js.Function1[MessageEvent, _] = ???
  var onerror: js.Function1[Event, _] = ???
  var frameBorder: js.String = ???
  var onresize: js.Function1[UIEvent, _] = ???
  var name: js.String = ???
  var onafterprint: js.Function1[Event, _] = ???
  var onbeforeprint: js.Function1[Event, _] = ???
  var onoffline: js.Function1[Event, _] = ???
  var border: js.String = ???
  var onunload: js.Function1[Event, _] = ???
  var onhashchange: js.Function1[Event, _] = ???
  var onload: js.Function1[Event, _] = ???
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = ???
  var onstorage: js.Function1[StorageEvent, _] = ???


}

/**
 * The HTMLLabelElement interface gives access to properties specific to <label>
 * elements. It inherits from HTMLElement.
 *
 * MDN
 */
class HTMLLabelElement extends HTMLElement {
  /**
   * The ID of the labeled control. Reflects the for attribute.
   *
   * MDN
   */
  var htmlFor: js.String = ???

  def form: HTMLFormElement = ???
}

/**
 * The HTMLLegendElement is an interface allowing to access properties of the
 * <legend> elements. It inherits properties and methods from the HTMLElement
 * interface.
 *
 * MDN
 */
class HTMLLegendElement extends HTMLElement {
  var align: js.String = ???

  def form: HTMLFormElement = ???
}

class HTMLDirectoryElement extends HTMLElement {
}

/**
 * The HTMLLIElement interface expose specific properties and methods (beyond
 * those defined by regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating list elements.
 *
 * MDN
 */
class HTMLLIElement extends HTMLElement {
  /**
   * Indicates the ordinal position of the list element inside a given <ol>. It reflects
   * the value attribute of the HTML <li> element, and can be smaller than 0. If the <li>
   * element is not a child of an <ol> element, the property has no meaning.
   *
   * MDN
   */
  var value: js.Number = ???
}

/**
 * The HTMLIFrameElement interface provides special properties and methods
 * (beyond those of the HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of inline frame
 * elements.
 *
 * MDN
 */
class HTMLIFrameElement extends HTMLElement with GetSVGDocument {
  /**
   * Reflects the width HTML attribute, indicating the width of the frame.
   *
   * MDN
   */
  var width: js.String = ???


  /**
   * The window proxy for the nested browsing context.
   *
   * MDN
   */
  var contentWindow: Window = ???

  /**
   * Reflects the src HTML attribute, containing the address of the content to be
   * embedded.
   *
   * MDN
   */
  var src: js.String = ???
  /**
   * Reflects the name HTML attribute, containing a name by which to refer to the frame.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * Reflects the height HTML attribute, indicating the height of the frame.
   *
   * MDN
   */
  var height: js.String = ???
  var border: js.String = ???
  /**
   * The active document in the inline frame's nested browsing context.
   *
   * MDN
   */
  var contentDocument: Document = ???

  /**
   * URI of a long description of the frame.
   *
   * MDN
   */
  var longDesc: js.String = ???
  var security: js.Any = ???
  var onload: js.Function1[Event, _] = ???


  /**
   * Reflects the sandbox HTML attribute, indicating extra restrictions on the
   * behavior of the nested content.
   *
   * MDN
   */
  var sandbox: DOMSettableTokenList = ???
}

/**
 * The HTMLBodyElement interface provides special properties (beyond those of the
 * regular HTMLElement interface they also inherit) for manipulating body
 * elements.
 *
 * MDN
 */
class HTMLBodyElement extends HTMLElement {
  var scroll: js.String = ???
  /**
   * Reflects the ononline HTML attribute value for a function to call when network
   * communication is restored.
   *
   * MDN
   */
  var ononline: js.Function1[Event, _] = ???

  /**
   * Reflects the onmessage HTML attribute value for a function to call when the
   * document receives a message.
   *
   * MDN
   */
  var onmessage: js.Function1[MessageEvent, _] = ???
  var text: js.Any = ???
  /**
   * Exposes the window.onerror event handler to call when the document fails to load
   * properly. Note: This handler is triggered when the event reaches the window, not
   * the body element. Use addEventListener() to attach an event listener to the body
   * element.
   *
   * MDN
   */
  var onerror: js.Function1[Event, _] = ???

  /**
   * Reflects the onresize HTML attribute value for a function to call when the
   * document has been resized.
   *
   * MDN
   */
  var onresize: js.Function1[UIEvent, _] = ???
  var link: js.Any = ???
  var aLink: js.Any = ???

  /**
   * Reflects the onafterprint HTML attribute value for a function to call after the
   * user has printed the document.
   *
   * MDN
   */
  var onafterprint: js.Function1[Event, _] = ???
  var vLink: js.Any = ???
  /**
   * Reflects the onbeforeprint HTML attribute value for a function to call when the
   * user has requested printing the document.
   *
   * MDN
   */
  var onbeforeprint: js.Function1[Event, _] = ???
  /**
   * Reflects the onoffline HTML attribute value for a function to call when network
   * communication fails.
   *
   * MDN
   */
  var onoffline: js.Function1[Event, _] = ???
  /**
   * Reflects the onunload HTML attribute value for a function to call when when the
   * document is going away.
   *
   * MDN
   */
  var onunload: js.Function1[Event, _] = ???
  /**
   * Reflects the onhashchange HTML attribute value for a function to call when the
   * fragment identifier in the address of the document changes.
   *
   * MDN
   */
  var onhashchange: js.Function1[Event, _] = ???
  /**
   * Exposes the window.onload event handler to call when the window gains focus. Note:
   * This handler is triggered when the event reaches the window, not the body element.
   * Use addEventListener() to attach an event listener to the body element.
   *
   * MDN
   */
  var onload: js.Function1[Event, _] = ???
  var rightMargin: js.Any = ???
  /**
   * Reflects the onbeforeunload HTML attribute value for a function to call when the
   * document is about to be unloaded.
   *
   * MDN
   */
  var onbeforeunload: js.Function1[BeforeUnloadEvent, _] = ???
  var leftMargin: js.Any = ???
  /**
   * Reflects the onpopstate HTML attribute value for a function to call when the
   * storage area has changed.
   *
   * MDN
   */
  var onstorage: js.Function1[StorageEvent, _] = ???


  /**
   * Reflects the onpopstate HTML attribute value for a function to call when the user
   * has navigated session history.
   *
   * MDN
   */
  var onpopstate: js.Function1[PopStateEvent, _] = ???
}

/**
 * The HTMLTableSectionElement interface provides special properties and methods
 * (beyond the HTMLElement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of sections, that is headers, footers
 * and bodies, in an HTML table.
 *
 * MDN
 */
class HTMLTableSectionElement extends HTMLElement with HTMLTableAlignment {
  /**
   * Is a DOMString containing an enumerated value reflecting the align attribute. It
   * indicates the alignment of the element's contents with respect to the surrounding
   * context. The possible values are "left", "right", and "center".
   *
   * MDN
   */
  var align: js.String = ???
  /**
   * Returns a live HTMLCollection containing the rows in the section. The
   * HTMLCollection is live and is automatically updated when rows are added or
   * removed.
   *
   * MDN
   */
  var rows: HTMLCollection = ???
  /**
   * Removes the cell at the given position in the section. If the given position is
   * greater (or equal as it starts at zero) than the amount of rows in the section, or is
   * smaller than 0, it raises a DOMException with the IndexSizeError value.
   *
   * MDN
   */
  def deleteRow(index: js.Number = ???): Unit = ???

  def moveRow(indexFrom: js.Number = ???, indexTo: js.Number = ???): Object = ???


  def insertRow(index: js.Number = ???): HTMLElement = ???

}

/**
 * The HTMLInputElement interface provides special properties and methods (beyond
 * the regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of input elements.
 *
 * MDN
 */
class HTMLInputElement extends HTMLElement {
  /**
   * Reflects the width HTML attribute, which defines the width of the image displayed
   * for the button, if the value of type is image.
   *
   * MDN
   */
  var width: js.String = ???
  var status: js.Boolean = ???

  /**
   * The containing form element, if this element is in a form. If this element is not
   * contained in a form element: HTML5 this can be the id attribute of any <form> element
   * in the same document. Even if the attribute is set on <input>, this property will be
   * null, if it isn't the id of a <form> element. HTML 4 this must be null.
   *
   * MDN
   */
  def form: HTMLFormElement = ???

  /**
   * The index of the beginning of selected text.
   *
   * MDN
   */
  var selectionStart: js.Number = ???
  /**
   * Indicates that a checkbox is neither on nor off.
   *
   * MDN
   */
  var indeterminate: js.Boolean = ???
  /**
   * Reflects the readonly HTML attribute, indicating that the user cannot modify the
   * value of the control. HTML5This is ignored if the value of the type attribute is
   * hidden, range, color, checkbox, radio, file, or a button type.
   *
   * MDN
   */
  var readOnly: js.Boolean = ???
  /**
   * Reflects the size HTML attribute, containing size of the control. This value is in
   * pixels unless the value of type is text or password, in which case, it is an integer
   * number of characters. HTML5 Applies only when type is set to text, search, tel, url,
   * email, or password; otherwise it is ignored.
   *
   * MDN
   */
  var size: js.Number = ???

  /**
   * The index of the end of selected text.
   *
   * MDN
   */
  var selectionEnd: js.Number = ???

  /**
   * Reflects the accept HTML attribute, containing comma-separated list of file
   * types accepted by the server when type is file.
   *
   * MDN
   */
  var accept: js.String = ???
  /**
   * Reflects the alt HTML attribute, containing alternative text to use when type is
   * image.
   *
   * MDN
   */
  var alt: js.String = ???
  /**
   * The default state of a radio button or checkbox as originally specified in HTML that
   * created this object.
   *
   * MDN
   */
  var defaultChecked: js.Boolean = ???
  /**
   * Current value in the control.
   *
   * MDN
   */
  var value: js.String = ???
  /**
   * Reflects the src HTML attribute, which specifies a URI for the location of an image
   * to display on the graphical submit button, if the value of type is image; otherwise
   * it is ignored.
   *
   * MDN
   */
  var src: js.String = ???
  /**
   * Reflects the name HTML attribute, containing a name that identifies the element
   * when submitting the form.
   *
   * MDN
   */
  var name: js.String = ???

  /**
   * Reflects the height HTML attribute, which defines the height of the image
   * displayed for the button, if the value of type is image.
   *
   * MDN
   */
  var height: js.String = ???


  /**
   * The current state of the element when type is checkbox or radio.
   *
   * MDN
   */
  var checked: js.Boolean = ???

  /**
   * Reflects the maxlength HTML attribute, containing the maximum length of text (in
   * Unicode code points) that the value can be changed to. The constraint is evaluated
   * only when the value is changed Note: If you set maxLength to a negative value
   * programmatically, an exception will be thrown.
   *
   * MDN
   */
  var maxLength: js.Number = ???
  /**
   * Reflects the type HTML attribute, indicating the type of control to display.
   * See type attribute of <input> for possible values.
   */
  var `type`: js.String = ???
  /**
   * The default value as originally specified in HTML that created this object.
   *
   * MDN
   */
  var defaultValue: js.String = ???

  /**
   * Selects a range of text in the element (but does not focus it). The optional
   * selectionDirection parameter may be "forward" or "backward" to establish the
   * direction in which selection was set, or "none" if the direction is unknown or not
   * relevant. The default is "none". Specifying a selectionDirection parameter sets
   * the value of the selectionDirection property.
   *
   * MDN
   */
  def setSelectionRange(start: js.Number, end: js.Number): Unit = ???

  /**
   * Selects the input text in the element, and focuses it so the user can subsequently
   * replace the whole entry.
   *
   * MDN
   */
  def select(): Unit = ???

  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This is the empty string if the control is not a candidate
   * for constraint validation (willvalidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  var validationMessage: js.String = ???
  var files: FileList = ???
  /**
   * Reflects the max HTML attribute, containing the maximum (numeric or date-time)
   * value for this item, which must not be less than its minimum (min attribute) value.
   *
   * MDN
   */
  var max: js.String = ???
  /**
   * Reflects the formtarget HTML attribute, containing a name or keyword indicating
   * where to display the response that is received after submitting the form. If
   * specified, this attribute overrides the target attribute of the <form> element
   * that owns this element.
   *
   * MDN
   */
  var formTarget: js.String = ???
  /**
   * Indicates whether the element is a candidate for constraint validation. It is
   * false if any conditions bar it from constraint validation.
   *
   * MDN
   */
  var willValidate: js.Boolean = ???
  /**
   * Reflects the step HTML attribute, which works with min and max to limit the
   * increments at which a numeric or date-time value can be set. It can be the string any
   * or a positive floating point number. If this is not set to any, the control accepts
   * only values at multiples of the step value greater than the minimum.
   *
   * MDN
   */
  var step: js.String = ???
  /**
   * Reflects the autofocus HTML attribute, which specifies that a form control
   * should have input focus when the page loads, unless the user overrides it, for
   * example by typing in a different control. Only one form element in a document can
   * have the autofocus attribute. It cannot be applied if the type attribute is set to
   * hidden (that is, you cannot automatically set focus to a hidden control).
   *
   * MDN
   */
  var autofocus: js.Boolean = ???
  /**
   * Reflects the required HTML attribute, indicating that the user must fill in a
   * value before submitting a form.
   *
   * MDN
   */
  var required: js.Boolean = ???
  /**
   * Reflects the formenctype HTML attribute, containing the type of content that
   * is used to submit the form to the server. If specified, this attribute
   * overrides the enctype attribute of the <form> element that owns this element.
   *
   * MDN
   */
  var formEnctype: js.String = ???
  /**
   * The value of the element, interpreted as one of the following in order: a time value a
   * number null if conversion is not possible
   *
   * MDN
   */
  var valueAsNumber: js.Number = ???
  /**
   * Reflects the placeholder HTML attribute, containing a hint to the user of what can
   * be entered in the control. The placeholder text must not contain carriage returns
   * or line-feeds. This attribute applies when the value of the type attribute is text,
   * search, tel, url or email; otherwise it is ignored.
   *
   * MDN
   */
  var placeholder: js.String = ???
  /**
   * Reflects the formmethod HTML attribute, containing the HTTP method that the
   * browser uses to submit the form. If specified, this attribute overrides the method
   * attribute of the <form> element that owns this element.
   *
   * MDN
   */
  var formMethod: js.String = ???
  /**
   * Identifies a list of pre-defined options to suggest to the user. The value must be
   * the id of a <datalist> element in the same document. The browser displays only
   * options that are valid values for this input element. This attribute is ignored
   * when the type attribute's value is hidden, checkbox, radio, file, or a button type.
   *
   * MDN
   */
  var list: HTMLElement = ???
  /**
   * Reflects the autocomplete HTML attribute, indicating whether the value of the
   * control can be automatically completed by the browser. Ignored if the value of the
   * type attribute is hidden, checkbox, radio, file, or a button type (button, submit,
   * reset, image). Possible values are: off: The user must explicitly enter a value
   * into this field for every use, or the document provides its own auto-completion
   * method; the browser does not automatically complete the entry. on: The browser can
   * automatically complete the value based on values that the user has entered during
   * previous uses.
   *
   * MDN
   */
  var autocomplete: js.String = ???
  /**
   * Reflects the min HTML attribute, containing the minimum (numeric or date-time)
   * value for this item, which must not be greater than its maximum (max attribute)
   * value.
   *
   * MDN
   */
  var min: js.String = ???
  /**
   * Reflects the formaction HTML attribute, containing the URI of a program that
   * processes information submitted by the element. If specified, this attribute
   * overrides the action attribute of the <form> element that owns this element.
   *
   * MDN
   */
  var formAction: js.String = ???
  /**
   * Reflects the pattern HTML attribute, containing a regular expression that the
   * control's value is checked against. The pattern must match the entire value, not
   * just some subset. Use the title attribute to describe the pattern to help the user.
   * This attribute applies when the value of the type attribute is text, search, tel,
   * url or email; otherwise it is ignored.
   *
   * MDN
   */
  var pattern: js.String = ???
  /**
   * The validity state that this element is in. 
   *
   * MDN
   */
  var validity: ValidityState = ???
  /**
   * Reflects the formnovalidate HTML attribute, indicating that the form is not to
   * be validated when it is submitted. If specified, this attribute overrides the
   * novalidate attribute of the <form> element that owns this element.
   *
   * MDN
   */
  var formNoValidate: js.String = ???
  /**
   * Reflects the multiple HTML attribute, indicating whether more than one value is
   * possible (e.g., multiple files).
   *
   * MDN
   */
  var multiple: js.Boolean = ???

  /**
   * Returns false if the element is a candidate for constraint validation, and it does
   * not satisfy its constraints. In this case, it also fires an invalid event at the
   * element. It returns true if the element is not a candidate for constraint
   * validation, or if it satisfies its constraints.
   *
   * MDN
   */
  def checkValidity(): js.Boolean = ???
  /**
   * Decrements the value by (step * n), where n defaults to 1 if not specified. Throws an
   * INVALID_STATE_ERR exception: if the method is not applicable to for the current
   * type value. if the element has no step value. if the value cannot be converted to a
   * number. if the resulting value is above the max or below the min. 
   *
   * MDN
   */
  def stepDown(n: js.Number = ???): Unit = ???

  /**
   * Increments the value by (step * n), where n defaults to 1 if not specified. Throws an
   * INVALID_STATE_ERR exception: if the method is not applicable to for the current
   * type value. if the element has no step value. if the value cannot be converted to a
   * number. if the resulting value is above the max or below the min.
   *
   * MDN
   */
  def stepUp(n: js.Number = ???): Unit = ???

  /**
   * Sets a custom validity message for the element. If this message is not the empty
   * string, then the element is suffering from a custom validity error, and does not
   * validate.
   *
   * MDN
   */
  def setCustomValidity(error: js.String): Unit = ???
}

/**
 * The HTMLAnchorElement interface represents hyperlink elements and provides
 * special properties and methods (beyond those of the regular HTMLElement object
 * interface they also have available to them by inheritance) for manipulating the
 * layout and presentation of such elements.
 *
 * MDN
 */
class HTMLAnchorElement extends HTMLElement {
  /**
   * Is a DOMString that reflects the rel HTML attribute, specifying the relationship
   * of the target object to the link object.
   *
   * MDN
   */
  var rel: js.String = ???
  /**
   * Is a DOMString representing the protocol component, including trailing colon
   * (':'), of the referenced URL.
   *
   * MDN
   */
  var protocol: js.String = ???
  /**
   * Is a DOMString representing tThe search element, including leading question mark
   * ('?'), if any, of the referenced URL.
   *
   * MDN
   */
  var search: js.String = ???
  /**
   * Is a DOMString representing a comma-separated list of coordinates.
   *
   * MDN
   */
  var coords: js.String = ???
  /**
   * Is a DOMString representing the hostname in the referenced URL.
   *
   * MDN
   */
  var hostname: js.String = ???
  /**
   * Is a DOMString representing the path name component, if any, of the referenced URL.
   *
   * MDN
   */
  var pathname: js.String = ???

  /**
   * Is a DOMString that reflects the target HTML attribute, indicating where to
   * display the linked resource.
   *
   * MDN
   */
  var target: js.String = ???

  /**
   * Is a DOMString that reflects the href HTML attribute, containing a valid URL of a
   * linked resource.
   *
   * MDN
   */
  var href: js.String = ???
  /**
   * Is a DOMString representing the anchor name.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * Is a DOMString representing the character encoding of the linked resource.
   *
   * MDN
   */
  var charset: js.String = ???
  /**
   * Is a DOMString that reflects the hreflang HTML attribute, indicating the language
   * of the linked resource.
   *
   * MDN
   */
  var hreflang: js.String = ???
  /**
   * Is a DOMString representing the port component, if any, of the referenced URL.
   *
   * MDN
   */
  var port: js.String = ???
  /**
   * Is a DOMString representing the hostname and port (if it's not the default port) in
   * the referenced URL.
   *
   * MDN
   */
  var host: js.String = ???
  /**
   * Is a DOMString representing the fragment identifier, including the leading hash
   * mark ('#'), if any, in the referenced URL.
   *
   * MDN
   */
  var hash: js.String = ???

  /**
   * Is a DOMString representing that the rev HTML attribute, specifying the
   * relationship of the link object to the target object.
   *
   * MDN
   */
  var rev: js.String = ???
  /**
   * Is a DOMString representing the shape of the active area.
   *
   * MDN
   */
  var shape: js.String = ???
  var `type`: js.String = ???
  var mimeType: js.String = ???

  /**
   * Is a DOMString being a synonym for the Node.textContent property.
   *
   * MDN
   */
  var text: js.String = ???
}

/**
 * The HTMLParamElement interface provides special properties (beyond those of the
 * regular HTMLElement object interface it inherits) for manipulating <param>
 * elements, representing a pair of a key and a value that acts as a parameter for an
 * <object> element.
 *
 * MDN
 */
class HTMLParamElement extends HTMLElement {
  /**
   * Is a DOMString representing the value associated to the parameter. It reflects the
   * value attribute.
   *
   * MDN
   */
  var value: js.String = ???
  /**
   * Is a DOMString representing the name of the parameter. It reflects the name
   * attribute.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * Is a DOMString that reflects the type HTML attribute, indicating the MIME
   * type of the linked resource
   *
   * MDN
   */
  var `type`: js.String = ???
  /**
   * Is a DOMString containing the type of the value. It reflects the valuetype
   * attribute and has one of the values: "data", "ref", or "object".
   *
   * MDN
   */
  var valueType: js.String = ???
}

/**
 * The HTMLPreElement interface expose specific properties and methods (beyond
 * those defined by regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating block of preformatted text.
 *
 * MDN
 */
class HTMLPreElement extends HTMLElement {
  /**
   * Is a long value reflecting the obsolete width attribute, containing a fixed-size
   * length for the <pre> element.
   *
   * MDN
   */
  var width: js.Number = ???
}


class HTMLPhraseElement extends HTMLElement {
  var dateTime: js.String = ???
}


/**
 * The HTMLCanvasElement interface provides properties and methods for
 * manipulating the layout and presentation of canvas elements. The
 * HTMLCanvasElement interface also inherits the properties and methods of the
 * HTMLElement interface.
 *
 * MDN
 */
class HTMLCanvasElement extends HTMLElement {
  /**
   * Reflects the width HTML attribute, specifying the width of the coordinate space in
   * CSS pixels.
   *
   * MDN
   */
  var width: js.Number = ???
  /**
   * Reflects the height HTML attribute, specifying the height of the coordinate space
   * in CSS pixels.
   *
   * MDN
   */
  var height: js.Number = ???

  /**
   * Returns a data: URL containing a representation of the image in the format
   * specified by type (defaults to PNG). The returned image is 96dpi. If the height or
   * width of the canvas is 0, "data:," representing the empty string, is returned. If
   * the type requested is not image/png, and the returned value starts with
   * data:image/png, then the requested type is not supported. Chrome supports the
   * image/webp type. If the requested type is image/jpeg or image/webp, then the
   * second argument, if it is between 0.0 and 1.0, is treated as indicating image
   * quality; if the second argument is anything else, the default value for image
   * quality is used. Other arguments are ignored.
   *
   * MDN
   */
  def toDataURL(`type`: js.String, args: js.Any*): js.String = ???

  /**
   * Returns a drawing context on the canvas, or null if the context ID is not supported. A
   * drawing context lets you draw on the canvas. Calling getContext with "2d" returns a
   * CanvasRenderingContext2D object, whereas calling it with
   * "experimental-webgl" (or "webgl") returns a WebGLRenderingContext object.
   * This context is only available on browsers that implement WebGL.
   *
   * MDN
   */
  def getContext(contextId: js.String, args: js.Any*): js.Dynamic = ???
}


/**
 * The HTMLTitleElement interface contains the title for a document. This element
 * inherits all of the properties and methods of the HTMLElement interface.
 *
 * MDN
 */
class HTMLTitleElement extends HTMLElement {
  /**
   * DOMString representing the text of the document's title.
   *
   * MDN
   */
  var text: js.String = ???
}


/**
 * The HTMLStyleElement interface represents a <style> element. It inherits
 * properties and methods from its parent, HTMLElement, and from LinkStyle.
 *
 * MDN
 */
class HTMLStyleElement extends HTMLElement with LinkStyle {
  /**
   * Is a DOMString representing the intended destination medium for style
   * information.
   *
   * MDN
   */
  var media: js.String = ???
  /**
   * Returns the type of the current style.
   *
   * MDN
   */
  var `type`: js.String = ???
}


/**
 * The HTMLUnknownElement interface represents an invalid HTML element and derives
 * from the HTMLElement interface, but without implementing any additional
 * properties or methods.
 *
 * MDN
 */
class HTMLUnknownElement extends HTMLElement {
}


/**
 * The HTMLAudioElement interface provides access to the properties of <audio>
 * elements, as well as methods to manipulate them. It derives from the
 * HTMLMediaElement interface.
 *
 * MDN
 */
class HTMLAudioElement extends HTMLMediaElement {
}


/**
 * The HTMLTableCellElement interface provides special properties and methods
 * (beyond the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of table cells, either
 * header or data cells, in an HTML document.
 *
 * MDN
 */
class HTMLTableCellElement extends HTMLElement with HTMLTableAlignment {
  /**
   * Is a DOMString containing a length of pixel of the hinted width of the cell. It
   * reflects the obsolete width attribute.
   *
   * MDN
   */
  var width: js.Number = ???
  /**
   * Is a DOMSettableTokenList describing a list of id of <th> elements that represents
   * headers associated with the cell. It reflects the headers attribute.
   *
   * MDN
   */
  var headers: js.String = ???
  /**
   * Is a long representing the cell position in the cells collection of the <tr> it
   * belongs to. If the cell doesn't belong to a <tr>, it returns -1.
   *
   * MDN
   */
  var cellIndex: js.Number = ???
  /**
   * Is a DOMString containing an enumerated value reflecting the align attribute. It
   * indicates the alignment of the element's contents with respect to the surrounding
   * context. The possible values are "left", "right", and "center".
   *
   * MDN
   */
  var align: js.String = ???

  /**
   * Is an unsigned long that represents the number of columns this cell must span. It
   * reflects the colspan attribute.
   *
   * MDN
   */
  var colSpan: js.Number = ???

  /**
   * Is a DOMString containing a name grouping cells in virtual. It reflects the
   * obsolete axis attribute.
   *
   * MDN
   */
  var axis: js.String = ???
  /**
   * Is a DOMString containing a length of pixel of the hinted height of the cell. It
   * reflects the obsolete height attribute.
   *
   * MDN
   */
  var height: js.Any = ???
  /**
   * Is a Boolean value reflecting the nowrap attribute and indicating if cell content
   * can be broken in several lines.
   *
   * MDN
   */
  var noWrap: js.Boolean = ???

  /**
   * Is an unsigned long that represents the number of rows this cell must span. It
   * reflects the rowspan attribute.
   *
   * MDN
   */
  var rowSpan: js.Number = ???


}


/**
 * The HTMLBaseFontElement interface provides special properties (beyond the
 * regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating <basefont> elements.
 *
 * MDN
 */
class HTMLBaseFontElement extends HTMLElement {
  /**
   * Is a DOMString representing a list of one or more font names. The document text in the
   * default style is rendered in the first font face that the client's browser
   * supports. If no font listed is installed on the local system, the browser typically
   * defaults to the proportional or fixed-width font for that system.
   *
   * MDN
   */
  var face: js.String = ???
  /**
   * Is a DOMString representing the font size as either a numeric or relative value.
   * Numeric values range from 1 to 7 with 1 being the smallest and 3 the default. Relative
   * value starts with a '+' or a '-'.
   *
   * MDN
   */
  var size: js.Number = ???
}


/**
 * The HTMLTextAreaElement interface, which provides special properties and
 * methods (beyond the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of <textarea>
 * elements.
 *
 * MDN
 */
class HTMLTextAreaElement extends HTMLElement {
  /**
   * The raw value contained in the control.
   *
   * MDN
   */
  var value: js.String = ???
  var status: js.Any = ???
  /**
   * The containing form element, if this element is in a form. If this element is not
   * contained in a form element, it can be the id attribute of any <form> element in the
   * same document or the value null.
   *
   * MDN
   */
  var form: HTMLFormElement = ???
  /**
   * Reflects name HTML attribute, containing the name of the control.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * The index of the beginning of selected text. If no text is selected, contains the
   * index of the character that follows the input cursor. On being set, the control
   * behaves as if setSelectionRange() had been called with this as the first argument,
   * and selectionEnd as the second argument.
   *
   * MDN
   */
  var selectionStart: js.Number = ???
  /**
   * Reflects the rows HTML attribute, indicating the number of visible text lines for
   * the control.
   *
   * MDN
   */
  var rows: js.Number = ???
  /**
   * Reflects the cols HTML attribute, indicating the visible width of the text area.
   *
   * MDN
   */
  var cols: js.Number = ???
  /**
   * Reflects the readonly HTML attribute, indicating that the user cannot modify the
   * value of the control.
   *
   * MDN
   */
  var readOnly: js.Boolean = ???
  /**
   * Reflects the wrap HTML attribute, indicating how the control wraps text.
   *
   * MDN
   */
  var wrap: js.String = ???
  /**
   * The index of the end of selected text. If no text is selected, contains the index of
   * the character that follows the input cursor. On being set, the control behaves as if
   * setSelectionRange() had been called with this as the second argument, and
   * selectionStart as the first argument.
   *
   * MDN
   */
  var selectionEnd: js.Number = ???

  /**
   * The string textarea.
   */
  def `type`: js.String = ???

  /**
   * The control's default value, which behaves like the element.textContent
   * property.
   *
   * MDN
   */
  var defaultValue: js.String = ???

  /**
   * Selects a range of text, and sets selectionStart and selectionEnd. If either
   * argument is greater than the length of the value, it is treated as pointing to the end
   * of the value. If end is less than start, then both are treated as the value of end.
   *
   * MDN
   */
  def setSelectionRange(start: js.Number, end: js.Number): Unit = ???

  /**
   * Selects the contents of the control.
   *
   * MDN
   */
  def select(): Unit = ???

  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This is the empty string if the control is not a candidate
   * for constraint validation (willValidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  var validationMessage: js.String = ???
  /**
   * Reflects the autofocus HTML attribute, indicating that the control should have
   * input focus when the page loads
   *
   * MDN
   */
  var autofocus: js.Boolean = ???
  /**
   * The validity states that this element is in.
   *
   * MDN
   */
  var validity: ValidityState = ???
  /**
   * Reflects the required HTML attribute, indicating that the user must specify a
   * value before submitting the form.
   *
   * MDN
   */
  var required: js.Boolean = ???
  /**
   * Reflects the maxlength HTML attribute, indicating the maximum number of
   * characters the user can enter. This constraint is evaluated only when the value
   * changes.
   *
   * MDN
   */
  var maxLength: js.Number = ???
  /**
   * Indicates whether the element is a candidate for constraint validation. It is
   * false if any conditions bar it from constraint validation.
   *
   * MDN
   */
  var willValidate: js.Boolean = ???
  /**
   * Reflects the placeholder HTML attribute, containing a hint to the user about what
   * to enter in the control.
   *
   * MDN
   */
  var placeholder: js.String = ???

  /**
   * Returns false if the button is a candidate for constraint validation, and it does
   * not satisfy its constraints. In this case, it also fires an invalid event at the
   * control. It returns true if the control is not a candidate for constraint
   * validation, or if it satisfies its constraints.
   *
   * MDN
   */
  def checkValidity(): js.Boolean = ???

  /**
   * Sets a custom validity message for the element. If this message is not the empty
   * string, then the element is suffering from a custom validity error, and does not
   * validate.
   *
   * MDN
   */
  def setCustomValidity(error: js.String): Unit = ???
}

/**
 * The HTMLModElement interface provides special properties (beyond the regular
 * methods and properties available through the HTMLElement interface they also
 * have available to them by inheritance) for manipulating modification elements,
 * that is <del> and <ins>.
 *
 * MDN
 */
class HTMLModElement extends HTMLElement {
  var dateTime: js.String = ???
  /**
   * Reflects the cite HTML attribute, containing a URI of a resource explaining the
   * change.
   *
   * MDN
   */
  var cite: js.String = ???
}


/**
 * The HTMLTableColElement interface provides special properties (beyond the
 * HTMLElement interface it also has available to it inheritance) for manipulating
 * single or grouped table column elements.
 *
 * MDN
 */
class HTMLTableColElement extends HTMLElement with HTMLTableAlignment {
  var width: js.Any = ???
  /**
   * Indicates the horizontal alignment of the cell data in the column.
   *
   * MDN
   */
  var align: js.String = ???
  /**
   * Reflects the span HTML attribute, indicating the number of columns to apply this
   * object's attributes to. Must be a positive integer.
   *
   * MDN
   */
  var span: js.Number = ???
}


trait HTMLTableAlignment extends js.Object {
  var ch: js.String = ???
  var vAlign: js.String = ???
  var chOff: js.String = ???
}

/**
 * The HTMLUListElement interface provides special properties (beyond those
 * defined on the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating unordered list elements.
 *
 * MDN
 */
class HTMLUListElement extends HTMLElement {
}


/**
 * The HTMLDivElement interface provides special properties (beyond the regular
 * HTMLElement interface it also has available to it by inheritance) for
 * manipulating div elements.
 *
 * MDN
 */
class HTMLDivElement extends HTMLElement {
  /**
   * Enumerated property indicating alignment of the element's contents with respect
   * to the surrounding context. The possible values are "left", "right", "justify",
   * and "center".
   *
   * MDN
   */
  var align: js.String = ???

}


/**
 * The HTMLBRElement interface represents a HTML line break element (<br>). It
 * inherits from HTMLElement.
 *
 * MDN
 */
class HTMLBRElement extends HTMLElement {
  /**
   * Indicates flow of text around floating objects.
   *
   * MDN
   */
  var clear: js.String = ???
}


/**
 * The HTMLMediaElement interface has special properties and methods (beyond the
 * properties and methods available for all children of HTMLElement), that are
 * common to all media-related objects.
 *
 * MDN
 */
class HTMLMediaElement extends HTMLElement {
  /**
   * The initial playback position in seconds.
   *
   * MDN
   */
  var initialTime: js.Number = ???
  /**
   * The ranges of the media source that the browser has played, if any.
   *
   * MDN
   */
  var played: TimeRanges = ???
  /**
   * The absolute URL of the chosen media resource (if, for example, the server selects a
   * media file based on the resolution of the user's display), or an empty string if the
   * networkState is EMPTY.
   *
   * MDN
   */
  var currentSrc: js.String = ???

  /**
   * Reflects the loop HTML attribute, indicating whether the media element should
   * start over when it reaches the end.
   *
   * MDN
   */
  var loop: js.Boolean = ???
  /**
   * Indicates whether the media element has ended playback.
   *
   * MDN
   */
  var ended: js.Boolean = ???
  /**
   * The ranges of the media source that the browser has buffered (if any) at the moment
   * the buffered property is accessed. The returned TimeRanges object is normalized.
   *
   * MDN
   */
  var buffered: TimeRanges = ???
  /**
   * The MediaError object for the most recent error, or null if there has not been an
   * error.
   *
   * MDN
   */
  var error: MediaError = ???
  /**
   * The time ranges that the user is able to seek to, if any.
   *
   * MDN
   */
  var seekable: TimeRanges = ???
  /**
   * Reflects the autoplay HTML attribute, indicating whether playback should
   * automatically begin as soon as enough media is available to do so without
   * interruption.
   *
   * MDN
   */
  var autoplay: js.Boolean = ???
  /**
   * Reflects the controls HTML attribute, indicating whether user interface items
   * for controlling the resource should be displayed.
   *
   * MDN
   */
  var controls: js.Boolean = ???
  /**
   * The audio volume, from 0.0 (silent) to 1.0 (loudest).
   *
   * MDN
   */
  var volume: js.Number = ???
  /**
   * Reflects the src HTML attribute, containing the URL of a media resource to use.
   * Gecko implements a similar functionality is available for streams:
   * mozSrcObject.
   *
   * MDN
   */
  var src: js.String = ???
  /**
   * The current rate at which the media is being played back. This is used to implement
   * user controls for fast forward, slow motion, and so forth. The normal playback rate
   * is multiplied by this value to obtain the current rate, so a value of 1.0 indicates
   * normal speed. If the playbackRate is negative, the media is played backwards. The
   * audio is muted when the media plays backwards or if the fast forward or slow motion is
   * outside a useful range (E.g. Gecko mute the sound outside the range 0.25 and 5.0).
   * The pitch of the audio is corrected by default and is the same for every speed. Some
   * navigators implement the non-standard preservespitch property to control this.
   *
   * MDN
   */
  var playbackRate: js.Number = ???
  /**
   * The length of the media in seconds, or zero if no media data is available.  If the
   * media data is available but the length is unknown, this value is NaN.  If the media is
   * streamed and has no predefined length, the value is Inf.
   *
   * MDN
   */
  var duration: js.Number = ???
  /**
   * true if the audio is muted, and false otherwise.
   *
   * MDN
   */
  var muted: js.Boolean = ???
  /**
   * The default playback rate for the media. 1.0 is "normal speed," values lower than
   * 1.0 make the media play slower than normal, higher values make it play faster. The
   * value 0.0 is invalid and throws a NOT_SUPPORTED_ERR exception.
   *
   * MDN
   */
  var defaultPlaybackRate: js.Number = ???
  /**
   * Indicates whether the media element is paused.
   *
   * MDN
   */
  var paused: js.Boolean = ???
  /**
   * Indicates whether the media is in the process of seeking to a new position.
   *
   * MDN
   */
  var seeking: js.Boolean = ???
  /**
   * The current playback time, in seconds. Setting this value seeks the media to the new
   * time.
   *
   * MDN
   */
  var currentTime: js.Number = ???
  /**
   * Reflects the preload HTML attribute, indicating what data should be preloaded, if
   * any. Possible values are: none, metadata, auto. See preload attribute
   * documentation for details.
   *
   * MDN
   */
  var preload: js.String = ???
  /**
   * The current state of fetching the media over the network. Constant Value
   * Description NETWORK_EMPTY 0 There is no data yet.  The readyState is also
   * HAVE_NOTHING. NETWORK_IDLE 1   NETWORK_LOADING 2 The media is loading.
   * NETWORK_NO_SOURCE[1] 3  
   *
   * MDN
   */
  var networkState: js.Number = ???

  def pause(): Unit = ???

  /**
   * Begins playback of the media. If you have changed the src attribute of the media
   * element since the page was loaded, you must call load() before play(), otherwise
   * the original media plays again.
   *
   * MDN
   */
  def play(): Unit = ???

  /**
   * Begins loading the media content from the server.
   *
   * MDN
   */
  def load(): Unit = ???

  /**
   * Determines whether the specified media type can be played back.
   *
   * MDN
   */
  def canPlayType(`type`: js.String): js.String = ???

  /**
   * Represents the list of TextTrack objects contained in the element.
   *
   * MDN
   */
  var textTracks: TextTrackList = ???
  /**
   * Represents the list of AudioTrack objects contained in the element.
   *
   * MDN
   */
  var audioTracks: AudioTrackList = ???
}

object HTMLMediaElement extends js.Object {
  /* ??? ConstructorMember(FunSignature(List(),List(),Some(TypeRef(TypeName(HTMLMediaElement),List())))) */
  /**
   * Enough of the media resource has been retrieved that the metadata attributes are
   * initialized.  Seeking will no longer raise an exception.
   *
   * MDN
   */
  val HAVE_METADATA: js.Number = ???
  /**
   * Data is available for the current playback position, but not enough to actually
   * play more than one frame.
   *
   * MDN
   */
  val HAVE_CURRENT_DATA: js.Number = ???
  /**
   * No information is available about the media resource.
   *
   * MDN
   */
  val HAVE_NOTHING: js.Number = ???
  val NETWORK_NO_SOURCE: js.Number = ???
  /**
   * Enough data is available—and the download rate is high enough—that the media can be
   * played through to the end without interruption.
   *
   * MDN
   */
  val HAVE_ENOUGH_DATA: js.Number = ???
  /**
   * There is no data yet.  The readyState is also HAVE_NOTHING.
   *
   * MDN
   */
  val NETWORK_EMPTY: js.Number = ???
  val NETWORK_LOADING: js.Number = ???
  val NETWORK_IDLE: js.Number = ???
  /**
   * Data for the current playback position as well as for at least a little bit of time
   * into the future is available (in other words, at least two frames of video, for
   * example).
   *
   * MDN
   */
  val HAVE_FUTURE_DATA: js.Number = ???
}

class HTMLDTElement extends HTMLElement {
  var noWrap: js.Boolean = ???
}


/**
 * The HTMLFieldSetElement interface special properties and methods (beyond the
 * regular HTMLelement interface it also has available to it by inheritance) for
 * manipulating the layout and presentation of field-set elements.
 *
 * MDN
 */
class HTMLFieldSetElement extends HTMLElement {
  var align: js.String = ???

  /**
   * The containing form element, if this element is in a form. If the button is not a
   * descendant of a form element, then the attribute can be the ID of any form element in
   * the same document it is related to, or the null value if none matches.
   *
   * MDN
   */
  def form: HTMLFormElement = ???

  /**
   * A localized message that describes the validation constraints that the element
   * does not satisfy (if any). This is the empty string if the element is not a candidate
   * for constraint validation (willValidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  def validationMessage: js.String = ???

  /**
   * The validity states that this element is in.
   *
   * MDN
   */
  var validity: ValidityState = ???
  /**
   * Always false because <fieldset> objects are never candidates for constraint
   * validation.
   *
   * MDN
   */
  var willValidate: js.Boolean = ???

  /**
   * Always returns true because <fieldset> objects are never candidates for
   * constraint validation.
   *
   * MDN
   */
  def checkValidity(): js.Boolean = ???

  /**
   * Sets a custom validity message for the field set. If this message is not the empty
   * string, then the field set is suffering from a custom validity error, and does not
   * validate.
   *
   * MDN
   */
  def setCustomValidity(error: js.String): Unit = ???
}


class HTMLBGSoundElement extends HTMLElement {
  var balance: js.Any = ???
  var volume: js.Any = ???
  var src: js.String = ???
  var loop: js.Number = ???
}


/**
 * The HTMLElement interface represents any HTML element. Some elements directly
 * implement this interface, other implement it via an interface that inherit it.
 *
 * MDN
 */
class HTMLElement extends Element {
  var onblur: js.Function1[FocusEvent, _] = ???
  var onfocus: js.Function1[FocusEvent, _] = ???
  var onmouseleave: js.Function1[MouseEvent, _] = ???
  var onbeforecut: js.Function1[DragEvent, _] = ???
  var onkeydown: js.Function1[KeyboardEvent, _] = ???
  var onkeyup: js.Function1[KeyboardEvent, _] = ???
  var onreset: js.Function1[Event, _] = ???
  var onhelp: js.Function1[Event, _] = ???
  var ondragleave: js.Function1[DragEvent, _] = ???
  var className: js.String = ???
  var onfocusin: js.Function1[FocusEvent, _] = ???
  var onseeked: js.Function1[Event, _] = ???
  var recordNumber: js.Any = ???
  /**
   * Establishes the text to be displayed in a 'tool tip' popup when the mouse is over the
   * displayed node.
   *
   * MDN
   */
  var title: js.String = ???


  /**
   * Gets the markup of the element including its content. When used as a
   * setter, replaces the element with nodes parsed from the given string.
   *
   * MDN
   */
  var outerHTML: js.String = ???
  var ondurationchange: js.Function1[Event, _] = ???

  /**
   * Height of an element relative to the element's offsetParent.
   *
   * MDN
   */
  def offsetHeight: js.Number = ???

  /**
   * The dir attribute gets or sets the text writing directionality of the content of the
   * current element.
   *
   * MDN
   */
  var dir: js.String = ???
  var onemptied: js.Function1[Event, _] = ???
  var onseeking: js.Function1[Event, _] = ???
  var oncanplay: js.Function1[Event, _] = ???
  var ondeactivate: js.Function1[UIEvent, _] = ???

  var onloadstart: js.Function1[Event, _] = ???
  var ondragenter: js.Function1[DragEvent, _] = ???
  var onsubmit: js.Function1[Event, _] = ???

  var onchange: js.Function1[Event, _] = ???
  var id: js.String = ???

  var onbeforeactivate: js.Function1[UIEvent, _] = ???
  var oncanplaythrough: js.Function1[Event, _] = ???

  /**
   * offsetParent returns a reference to the object which is the closest (nearest in the
   * containment hierarchy) positioned containing element. If the element is
   * non-positioned, the nearest table cell or root element (html in standards
   * compliant mode; body in quirks rendering mode) is the offsetParent. offsetParent
   * returns null when the element has style.display set to "none". The offsetParent is
   * useful because offsetTop and offsetLeft are relative to its padding edge.
   *
   * MDN
   */
  def offsetParent: Element = ???

  var onsuspend: js.Function1[Event, _] = ???
  var readyState: js.Any = ???
  var onmouseenter: js.Function1[MouseEvent, _] = ???

  var onmouseout: js.Function1[MouseEvent, _] = ???
  var parentElement: HTMLElement = ???
  var onmousewheel: js.Function1[WheelEvent, _] = ???
  var onvolumechange: js.Function1[Event, _] = ???
  var filters: Object = ???
  /**
   * The ParentNode.children read-only property returns a live HTMLCollection of
   * child elements of the given object.
   *
   * The items in the returned collection are objects and not strings. To get data
   * from those node objects, you must use their properties (e.g.
   * elementNodeReference.children[1].nodeName to get the name, etc.).
   *
   * MDN
   */

  var ondragend: js.Function1[DragEvent, _] = ???
  var onbeforepaste: js.Function1[DragEvent, _] = ???
  var ondragover: js.Function1[DragEvent, _] = ???

  /**
   * offsetTop returns the distance of the current element relative to the top of
   * the offsetParent node.
   *
   * MDN
   */
  def offsetTop: js.Number = ???

  var onmouseup: js.Function1[MouseEvent, _] = ???
  var ondragstart: js.Function1[DragEvent, _] = ???
  var onbeforecopy: js.Function1[DragEvent, _] = ???
  var ondrag: js.Function1[DragEvent, _] = ???
  /**
   * innerHTML sets or gets the HTML syntax describing the element's descendants.
   *
   * Note: If a <div>, <span>, or <noembed> node has a child text node that includes
   * the characters (&), (<), or (>), innerHTML returns these characters as &amp,
   * &lt and &gt respectively. Use Node.textContent to get a correct copy of these
   * text nodes' contents.
   */
  var innerHTML: js.String = ???
  var onmouseover: js.Function1[MouseEvent, _] = ???
  /**
   * This property gets or sets the base language of an element's attribute values and
   * text content.
   *
   * MDN
   */
  var lang: js.String = ???

  var onpause: js.Function1[Event, _] = ???

  var onmousedown: js.Function1[MouseEvent, _] = ???
  var onclick: js.Function1[MouseEvent, _] = ???
  var onwaiting: js.Function1[Event, _] = ???
  /**
   * Returns the number of pixels that the upper left corner of the current element is
   * offset to the left within the offsetParent node.
   *
   * MDN
   */
  var offsetLeft: js.Number = ???

  var onpaste: js.Function1[DragEvent, _] = ???

  var onstalled: js.Function1[Event, _] = ???
  var onmousemove: js.Function1[MouseEvent, _] = ???
  /**
   * isContentEditable returns true if the contents of the element are editable;
   * otherwise it returns false.
   *
   * MDN
   */
  var isContentEditable: js.Boolean = ???
  var onratechange: js.Function1[Event, _] = ???
  /**
   * contentEditable is used to indicate whether or not the element is editable. This
   * enumerated attribute can have the following values:
   *
   * MDN
   */
  var contentEditable: js.String = ???
  /**
   * Gets/sets the tab order of the current element.
   *
   * MDN
   */
  var tabIndex: js.Number = ???

  var onprogress: js.Function1[js.Any, _] = ???
  var ondblclick: js.Function1[MouseEvent, _] = ???
  var oncontextmenu: js.Function1[MouseEvent, _] = ???
  var onloadedmetadata: js.Function1[Event, _] = ???
  var onplay: js.Function1[Event, _] = ???
  var onplaying: js.Function1[Event, _] = ???

  var onfocusout: js.Function1[FocusEvent, _] = ???
  var onabort: js.Function1[UIEvent, _] = ???

  var onreadystatechange: js.Function1[Event, _] = ???
  var onkeypress: js.Function1[KeyboardEvent, _] = ???
  var onloadeddata: js.Function1[Event, _] = ???
  var onbeforedeactivate: js.Function1[UIEvent, _] = ???

  var disabled: js.Boolean = ???
  var onactivate: js.Function1[UIEvent, _] = ???
  var accessKey: js.String = ???
  var onselectstart: js.Function1[Event, _] = ???
  var ontimeupdate: js.Function1[Event, _] = ???
  var oncut: js.Function1[DragEvent, _] = ???
  var onselect: js.Function1[UIEvent, _] = ???
  var ondrop: js.Function1[DragEvent, _] = ???

  /**
   * Returns the layout width of an element.
   *
   * MDN
   */
  def offsetWidth: js.Number = ???

  var oncopy: js.Function1[DragEvent, _] = ???
  var onended: js.Function1[Event, _] = ???
  var onscroll: js.Function1[UIEvent, _] = ???

  var oninput: js.Function1[Event, _] = ???

  def dragDrop(): js.Boolean = ???

  def scrollIntoView(top: js.Boolean = ???): Unit = ???

  def addFilter(filter: Object): Unit = ???

  def setCapture(containerCapture: js.Boolean = ???): Unit = ???

  /**
   * Sets focus on the specified element, if it can be focused.
   *
   * MDN
   */
  def focus(): Unit = ???

  def getAdjacentText(where: js.String): js.String = ???

  def insertAdjacentText(where: js.String, text: js.String): Unit = ???

  def getElementsByClassName(classNames: js.String): NodeList = ???

  def setActive(): Unit = ???

  def removeFilter(filter: Object): Unit = ???

  /**
   * The blur method removes keyboard focus from the current element.
   *
   * MDN
   */
  def blur(): Unit = ???

  def clearAttributes(): Unit = ???

  def releaseCapture(): Unit = ???

  def removeBehavior(cookie: js.Number): js.Boolean = ???

  def contains(child: HTMLElement): js.Boolean = ???

  /**
   * The click method simulates a mouse click on an element.
   *
   * MDN
   */
  def click(): Unit = ???

  def insertAdjacentElement(position: js.String, insertedElement: Element): Element = ???

  def mergeAttributes(source: HTMLElement, preserveIdentity: js.Boolean = ???): Unit = ???

  def replaceAdjacentText(where: js.String, newText: js.String): js.String = ???

  def applyElement(apply: Element, where: js.String = ???): Element = ???

  def addBehavior(bstrUrl: js.String, factory: js.Any = ???): js.Number = ???

  def insertAdjacentHTML(where: js.String, html: js.String): Unit = ???


  var oncuechange: js.Function1[Event, _] = ???
  var spellcheck: js.Boolean = ???
  var classList: DOMTokenList = ???
  var draggable: js.Boolean = ???

  /**
   * Returns an object that represents the element's style attribute.
   * 
   * MDN
   */
  var style: CSSStyleDeclaration = ???
}


/**
 * The HTMLHRElement interface provides special properties (beyond those of the
 * HTMLElement interface it also has available to it by inheritance) for
 * manipulating <hr> elements.
 *
 * MDN
 */
class HTMLHRElement extends HTMLElement {
  var width: js.Number = ???
  /**
   * Enumerated attribute indicating alignment of the rule with respect to the
   * surrounding context.
   *
   * MDN
   */
  var align: js.String = ???

}


/**
 * The HTMLObjectElement interface provides special properties and methods
 * (beyond those on the HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of <object> element,
 * representing external resources.
 *
 * MDN
 */
class HTMLObjectElement extends HTMLElement with GetSVGDocument {
  /**
   * Reflects the width HTML attribute, specifying the displayed width of the resource
   * in CSS pixels.
   *
   * MDN
   */
  var width: js.String = ???
  /**
   * Reflects the codetype HTML attribute, specifying the content type of the data.
   *
   * MDN
   */
  var codeType: js.String = ???
  var `object`: Object = ???
  /**
   * The object element's form owner, or null if there isn't one.
   *
   * MDN
   */
  var form: HTMLFormElement = ???
  /**
   * The name of an applet class file, containing either the applet's subclass, or the
   * path to get to the class, including the class file itself.
   *
   * MDN
   */
  var code: js.String = ???
  /**
   * Reflects the archive HTML attribute, containing a list of archives for resources
   * for this object.
   *
   * MDN
   */
  var archive: js.String = ???
  /**
   * Reflects the standby HTML attribute, specifying a message to display while the
   * object loads.
   *
   * MDN
   */
  var standby: js.String = ???
  var alt: js.String = ???
  var classid: js.String = ???
  /**
   * Reflects the name HTML attribute, specifying the name of the object (HTML 4, or of a
   * browsing context (HTML5.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * Reflects the usemap HTML attribute, specifying a <map> element to use.
   *
   * MDN
   */
  var useMap: js.String = ???
  /**
   * Reflects the data HTML attribute, specifying the address of a resource's data.
   *
   * MDN
   */
  var data: js.String = ???
  /**
   * Reflects the height HTML attribute, specifying the displayed height of the
   * resource in CSS pixels.
   *
   * MDN
   */
  var height: js.String = ???
  /**
   * The active document of the object element's nested browsing context, if any;
   * otherwise null.
   *
   * MDN
   */
  var contentDocument: Document = ???
  var altHtml: js.String = ???
  /**
   * Reflects the codebase HTML attribute, specifying the base path to use to resolve
   * relative URIs.
   *
   * MDN
   */
  var codeBase: js.String = ???
  /**
   * Reflects the declare HTML attribute, indicating that this is a declaration, not an
   * instantiation, of the object.
   *
   * MDN
   */
  var declare: js.Boolean = ???
  var `type`: js.String = ???
  var BaseHref: js.String = ???
  /**
   * A localized message that describes the validation constraints that the control
   * does not satisfy (if any). This is the empty string if the control is not a candidate
   * for constraint validation (willValidate is false), or it satisfies its
   * constraints.
   *
   * MDN
   */
  var validationMessage: js.String = ???

  /**
   * The validity states that this element is in.
   *
   * MDN
   */
  def validity: ValidityState = ???

  /**
   * Indicates whether the element is a candidate for constraint validation. Always
   * false for HTMLObjectElement objects.
   *
   * MDN
   */
  var willValidate: js.Boolean = ???

  /**
   * Always returns true, because object objects are never candidates for constraint
   * validation.
   *
   * MDN
   */
  def checkValidity(): js.Boolean = ???

  /**
   * Sets a custom validity message for the element. If this message is not the empty
   * string, then the element is suffering from a custom validity error, and does not
   * validate.
   *
   * MDN
   */
  def setCustomValidity(error: js.String): Unit = ???
}


/**
 * The HTMLEmbedElement interface, which provides special properties (beyond the
 * regular <htmlelement> interface it also has available to it by inheritance) for
 * manipulating <embed> elements.
 *
 * MDN
 */
class HTMLEmbedElement extends HTMLElement with GetSVGDocument {
  /**
   * Reflects the width HTML attribute, containing the displayed width of the
   * resource.
   *
   * MDN
   */
  var width: js.String = ???

  /**
   * Reflects the src HTML attribute, containing the address of the resource.
   *
   * MDN
   */
  var src: js.String = ???

  /**
   * Reflects the height HTML attribute, containing the displayed height of the
   * resource.
   *
   * MDN
   */
  var height: js.String = ???

}


/**
 * The HTMLOptGroupElement interface provides special properties and methods
 * (beyond the regular HTMLElement object interface they also have available to them
 * by inheritance) for manipulating the layout and presentation of <optgroup>
 * elements.
 *
 * MDN
 */
class HTMLOptGroupElement extends HTMLElement {

  /**
   * Set or get the label for the group.
   *
   * MDN
   */
  var label: js.String = ???

}


/**
 * The HTMLIsIndexElement interface provides special properties (beyond the
 * regular HTMLElement interface it also has available to it by inheritance) for
 * manipulating <isindex> elements.
 *
 * MDN
 */
class HTMLIsIndexElement extends HTMLElement {
  /**
   * Is a HTMLFormElement representing the <form> element it belongs too. It can have
   * the null value, if <isindex> isn't part of any form.
   *
   * MDN
   */
  var form: HTMLFormElement = ???
  var action: js.String = ???
  /**
   * Is a DOMString representing a text to be prompted for the field.
   *
   * MDN
   */
  var prompt: js.String = ???
}


/**
 * The HTMLVideoElement interface provides special properties and methods for
 * manipulating video objects. It also inherits properties and methods of
 * HTMLMediaElement and HTMLElement.
 *
 * MDN
 */
class HTMLVideoElement extends HTMLMediaElement {
  /**
   * Is a DOMString that reflects the width HTML attribute, which specifies the width of
   * the display area, in CSS pixels.
   *
   * MDN
   */
  var width: js.Number = ???
  /**
   * Returns an unsigned long containing the intrinsic width of the resource in CSS
   * pixels, taking into account the dimensions, aspect ratio, clean aperture,
   * resolution, and so forth, as defined for the format used by the resource. If the
   * element's ready state is HAVE_NOTHING, the value is 0.
   *
   * MDN
   */
  var videoWidth: js.Number = ???
  /**
   * Returns an unsigned long containing the intrinsic height of the resource in CSS
   * pixels, taking into account the dimensions, aspect ratio, clean aperture,
   * resolution, and so forth, as defined for the format used by the resource. If the
   * element's ready state is HAVE_NOTHING, the value is 0.
   *
   * MDN
   */
  var videoHeight: js.Number = ???
  /**
   * Is a DOMString that reflects the height HTML attribute, which specifies the height
   * of the display area, in CSS pixels.
   *
   * MDN
   */
  var height: js.Number = ???
  /**
   * Is a DOMString that reflects the poster HTML attribute, which specifies an image to
   * show while no video data is available.
   *
   * MDN
   */
  var poster: js.String = ???


}


/**
 * The HTMLProgressElement interface provides special properties and methods
 * (beyond the regular HTMLElement interface it also has available to it by
 * inheritance) for manipulating the layout and presentation of <progress>
 * elements.
 *
 * MDN
 */
class HTMLProgressElement extends HTMLElement {
  /**
   * If the progress bar is an indeterminate progress bar, then this property return 0.
   * Otherwise, it returns the current value.
   *
   * MDN
   */
  var value: js.Number = ???
  /**
   * This property reflect the content attribute of the same name, limited to numbers
   * greater than zero. Its default value is 1.0.
   *
   * MDN
   */
  var max: js.Number = ???
  /**
   * If the progress bar is an indeterminate progress bar, then the position property
   * return −1. Otherwise, it returns the result of dividing the current value by the
   * maximum value.
   *
   * MDN
   */
  var position: js.Number = ???
  var form: HTMLFormElement = ???
}


/**
 * The HTMLDataListElement interface provides special properties (beyond the
 * HTMLElement object interface it also has available to it by inheritance) to
 * manipulate <datalist> elements and their content.
 *
 * MDN
 */
class HTMLDataListElement extends HTMLElement {
  /**
   * A collection of the contained option elements.
   *
   * MDN
   */
  var options: HTMLCollection = ???
}


/**
 * The HTMLTrackElement interface provides access to the properties of <track>
 * elements, as well as methods to manipulate them.
 *
 * MDN
 */
class HTMLTrackElement extends HTMLElement {
  var kind: js.String = ???
  var src: js.String = ???
  var srclang: js.String = ???
  var track: TextTrack = ???
  var label: js.String = ???
}

class HTMLMarqueeElement extends HTMLElement {
  var width: js.String = ???
  var onbounce: js.Function1[Event, _] = ???
  var vspace: js.Number = ???
  var trueSpeed: js.Boolean = ???
  var scrollAmount: js.Number = ???
  var scrollDelay: js.Number = ???
  var behavior: js.String = ???
  var height: js.String = ???
  var loop: js.Number = ???
  var direction: js.String = ???
  var hspace: js.Number = ???
  var onstart: js.Function1[Event, _] = ???
  var onfinish: js.Function1[Event, _] = ???

  def stop(): Unit = ???

  def start(): Unit = ???


}

/**
 * The HTMLSpanElement interface represents a <span> element and derives from the
 * HTMLElement interface, but without implementing any additional properties or
 * methods.
 *
 * MDN
 */
class HTMLSpanElement extends HTMLElement {
}


/**
 * The HTMLHeadElement interface contains the descriptive information, or
 * metadata, for a document. This object inherits all of the properties and methods
 * described in the HTMLElement interface.
 *
 * MDN
 */
class HTMLHeadElement extends HTMLElement {
  /**
   * The URIs of one or more metadata profiles (white space separated).
   *
   * MDN
   */
  var profile: js.String = ???
}


/**
 * The HTMLHeadingElement interface represents the different heading elements. It
 * inherits methods and properties from the HTMLElement interface.
 *
 * MDN
 */
class HTMLHeadingElement extends HTMLElement {
  /**
   * Enumerated attribute indicating alignment of the heading with respect to the
   * surrounding context.
   *
   * MDN
   */
  var align: js.String = ???
}


/**
 * The HTMLFormElement interface provides methods to create and modify <form>
 * elements; it inherits from properties and methods of the HTMLElement interface.
 *
 * MDN
 */
class HTMLFormElement extends HTMLElement {
  /**
   * length returns the number of controls in the FORM element.
   *
   * MDN
   */
  var length: js.Number = ???
  /**
   * target gets/sets the target of the action (i.e., the frame to render its output in).
   *
   * MDN
   */
  var target: js.String = ???
  /**
   * acceptCharset returns a list of the supported character encodings for the given
   * FORM element. This list can be comma- or space-separated.
   *
   * MDN
   */
  var acceptCharset: js.String = ???
  /**
   * enctype gets/sets the content type of the FORM element.
   *
   * MDN
   */
  var enctype: js.String = ???
  /**
   * elements returns an HTMLFormControlsCollection (HTML 4 HTMLCollection) of all
   * the form controls contained in the FORM element, with the exception of input
   * elements which have a type attribute of image.
   *
   * MDN
   */
  var elements: HTMLCollection = ???
  /**
   * action gets/sets the action of the <form> element.
   *
   * MDN
   */
  var action: js.String = ???
  /**
   * name returns the name of the current form element as a string.
   *
   * MDN
   */
  var name: js.String = ???
  /**
   * method gets/sets the HTTP method used to submit the form.
   *
   * MDN
   */
  var method: js.String = ???
  /**
   * encoding is an alternative name for the enctype element on the DOM HTMLFormElement
   * object.
   *
   * MDN
   */
  var encoding: js.String = ???

  /**
   * reset restores a form element's default values.
   *
   * MDN
   */
  def reset(): Unit = ???
  /**
   * Gets the item in the elements collection at the specified index, or null if there is
   * no item at that index. You can also specify the index in array-style brackets or
   * parentheses after the form object name, without calling this method explicitly.
   *
   * MDN
   */
  def item(name: js.Any = ???, index: js.Any = ???): js.Dynamic = ???

  /**
   * This method does something similar to activating a submit button of the form.
   *
   * MDN
   */
  def submit(): Unit = ???

  /**
   * Gets the item or list of items in elements collection whose name or id match the
   * specified name, or null if no items match. You can also specify the name in
   * array-style brackets or parentheses after the form object name, without calling
   * this method explicitly.
   *
   * MDN
   */
  def namedItem(name: js.String): js.Dynamic = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(name: js.String): js.Any = ???

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(name: js.String, v: js.Any): Unit = ???

  /**
   * Reflects the autocomplete HTML attribute, containing a string that indicates
   * whether the controls in this form can have their values automatically populated by
   * the browser.
   *
   * MDN
   */
  var autocomplete: js.String = ???
  /**
   * Reflects the novalidate HTML attribute, indicating that the form should not be
   * validated.
   *
   * MDN
   */
  var noValidate: js.Boolean = ???

  def checkValidity(): js.Boolean = ???
}



