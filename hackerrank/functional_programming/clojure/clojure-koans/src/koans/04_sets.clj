(ns koans.04-sets
  (:require [koan-engine.core :refer :all]))

(meditations
  "You can create a set by converting another collection"
  (= #{3} (set [3]))

  "Counting them is like counting other collections"
  (= 3 (count #{1 2 3}))

  "Remember that a set is a *mathematical* set"
  (= #{1 2 3 4 5} (set '(1 1 2 2 3 3 4 4 5 5)))

  "You can ask clojure for the union of two sets"
  (= #{1 2 3 4 5} (clojure.set/union #{1 2 3 4} #{2 3 5}))

  "And also the intersection"
  (= #{2 3} (clojure.set/intersection #{1 2 3 4} #{2 3 5}))

  "But don't forget about the difference"
  ;; difference returns a set that is the first set without elements of the remaining sets
  ;; user=> (difference #{1 2 3})
  ;; #{1 2 3}
  ;; user=> (difference #{1 2} #{2 3})
  ;; #{1}
  ;; user=> (difference #{1 2 3} #{1} #{1 4} #{3})
  ;; #{2}

  (= #{1 4} (clojure.set/difference #{1 2 3 4 5} #{2 3 5})))
