package com.sksamuel.kotest.specs.freespec

import io.kotest.specs.FreeSpec

class FreeSpecExample : FreeSpec() {
  init {
    "some context" - {
      "more context" - {
        "as many as you want" - {
          "then a test" {
            // test case
          }
        }
      }
    }
    "a test without a context block" {
    }
  }
}