Guide to Contributing
=====================

Contents:

* Packages
* Files
* Facades
* Non-Facades
* Partially-Supported DOM API
* Binary Compatibility
* Submitting a PR


Packages
========

TODO: Put `beacon` in `dom`
TODO: Put DOMParser in `dom` with its extra types in its companion object
TODO: Put `gamepad` in `dom`
TODO: Put `push` in `dom`? Everything is `Push*`. Or will there be `Push*` from other APIs too? Do we care?
TODO: Put `sharedworkers` in `dom`
TODO: Put `storage` in `dom`? Does it really warrant its own package?
TODO: Put `webgl/extensions` in `webgl`
TODO: The `ext` package is named confusingly imo. Ideally we could rename it to something clearer.

```
org.scalajs.dom          — All top-level facades
  +-- beacon             — Beacon API
  +-- crypto             — Crypto API
  +-- deviceorientation  — Device Orientation API
  +-- domparser          — DOMParser API
  +-- ext                — Scala helpers for nicer usage
  +-- gamepad            — Gamepad API
  +-- intl               — Internationalization API
  +-- mediastream        — MediaStream API
  +-- permissions        — Permissions API
  +-- push               — Push API
  +-- raw                — deprecated. Remains only for backwards-compatibility
  +-- serviceworkers     — Service Workers API
  +-- sharedworkers      —
  +-- storage            — Storage API
  +-- webgl              — WebGL API
  |   +-- extensions     —
  +-- webrtc             — WebRTC API
```


Files
=====

* Use `package.scala` for a package object and nothing else.
  Also don't include traits/classes/objects.

* Match the filename to the trait/class/object in it; don't add multiple top-level types.
  This is effectively Java-style.


Facades
=======

If a feature has many types that don't share a common unambiguous prefix (like `crypto`),
  * create a feature package
  * put all of its types in its package

If a feature has only a few types that don't share a common unambiguous prefix (like `DOMParser`),
  * create a facade for the main feature
  * create a companion object for the facade
  * put all of its types in the companion object

If a feature has types that all share a common unambiguous prefix (like `Gamepad*`),
  * put it all in `dom`


Non-Facades
===========

* Implicit conversions should go in companion objects so that they are always in scope without the
  need for imports. There's no need to group by feature, the types already specify the feature.

* Add Scala-only utilities that pertain to a specific facade, in the facades companion object
  Eg: helper constructors, legal facade values.

* Add Scala-only utilities that don't pertain to a specific facade, or shouldn't be universally
  available (subjective judgement here) in the `ext` package.


Partially-Supported DOM API
===========================

TODO: Pending discussion in #514


Binary Compatibility
====================

Binary compatibility for Scala.JS facades is different than standard Scala.
The following are changes that are indeed incompatible in both formats:

Don't:
  * Remove a trait / class / object
  * Change a class into a trait or vice versa

Here is a non-exhaustive list of changes that would be binary incompatible for Scala classes, but
are compatible for JS facade types:

You can:
  * Remove a member
  * Change the type or signature of a member
  * Add a field in a trait
  * Add an abstract member in a trait


Submitting a PR
===============

Once you're done making your changes...

1. Run `sbt prePR`
2. Run `git diff api-reports` and ensure that you aren't breaking backwards-binary-compatibility
   (see above). We'll probably automate this step in the future (See #503)
3. Check in and commit the changes to `api-reports`
4. Submit your PR
5. Know that your contribution is appreciated, thank you!
