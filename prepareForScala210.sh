#!/bin/bash
set -euo pipefail
cd "$(dirname "$0")"

sed -i -e '/delete if Scala 2.10/d' *.sbt project/*.sbt
rm scalafix.sbt
