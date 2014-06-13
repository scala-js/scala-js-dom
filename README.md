scala-js-dom
============

Scala-js-dom provides a nice statically typed interface to the DOM such that it can be called from Scala code without resorting to `js.Dynamic`. All javascript globals functions, singletons and classes are members of the `org.scalajs.dom` package, e.g. 

```scala
import org.scalajs.dom
dom.alert("HAI")
```

Will cause a javascript alert box saying `HAI` to appear. Other javascript classes and objects can be similarly accessed e.g. `new dom.XMLHttpRequest()` to perform a new Ajax request, `dom.document` to access the global `document` object, or `dom.setInterval(() => ???, 1000)` to schedule a recurring task every second. The names of these functions/singletons/classes match their Javascript equivalents exactly, so if you want to know how to do something (e.g. "how do I open a websocket connection") the syntax is the same as if you were using raw Javascript.

The goal of this project is to provide a thin-but-idiomatic-scala interface to modern browser APIs. In particular:

- Deprecated properties/methods/types will not be present.
- IE-only, Chrome-only, FF-only, and in general browser-specific attributes will not be present.
- The name of a Scala type should map directly to the name of the corresponding Javascript type.
- Any type which is a Javascript type (e.g. you can `instanceof` in javascipt) should be a Scala `class`; any other interface which isn't a Javascript type should be a `trait`.
- Read-only members should be `def`, and not-directly-instantiable classes should have `private` constructors.

Extensions
----------

Apart from `Color`, Scala-js-dom contains some useful helpers and implicit classes in `org.scalajs.dom.extensions` that serve no purpose other than to make your use of the DOM more pleasant.
Examples include the `Ajax.get` and `Ajax.post` methods which let you avoid messing with `dom.XMLHttpRequest` directly, or `KeyCodes` which provides a nice list of the keycodes that result from pressing various keys on the keyboard.

Usage
-----

Add the following to your sbt build definition:

```scala
libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6"
```

then enjoy the types available in `org.scalajs.dom`.

scalajs-dom 0.6 is built and published for Scala.js 0.5.0 and following in
the 0.5.x series, with both Scala 2.10 and 2.11.

See also [roll](https://github.com/lihaoyi/roll) ([live demo](http://lihaoyi.github.io/roll/)) and [scala-js-games](https://github.com/lihaoyi/scala-js-games) for an example of its use. [Scala-js-fiddle](http://www.scala-js-fiddle.com/) also contains a pile of [fun examples](http://www.scala-js-fiddle.com/gist/9405209/Oscilloscope.scala) that demonstrate its usage. Pull requests/forks are welcome!

Contributing
------------

Scala-js-dom is a work in progress. The current code base is a hodgepodge of auto-generated/scraped/hand-tweaked code, and is full of rough edges. If you see something that you think can be improved, feel free to send a pull request. These could include:

- Improved doc-comments; who doesn't love better docs?
- Missing methods/properties/classes; send the PR adding it in including it together with a link to an authoritative source (e.g. MDN) and it should get merged.
- Additional extensions (in `org.scalajs.dom.extensions`). These currently represent an arbitrary collection of helpers that have been needed so far. If there's some implicit that you find you need and you think other people will to, send a pull request and we can talk about it.

License
-------

Documentation marked "MDN" is thanks to Mozilla Contributors
at https://developer.mozilla.org/en-US/docs/Web/API and available
under the Creative Commons Attribution-ShareAlike v2.5 or later.
http://creativecommons.org/licenses/by-sa/2.5/

This should not affect you, as a user of the library, as long as you don't
modify these MDN materials (e.g. you leave them as is, or replace them
wholesale). In particular, packaging this library with MDN materials unchanged
is fine for any purpose (including commercial) according to the
CC-Attribute-ShareAlike License.

Everything else (e.g. the code) is under the MIT License

The MIT License (MIT)

Copyright (c) 2013 Li Haoyi

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
