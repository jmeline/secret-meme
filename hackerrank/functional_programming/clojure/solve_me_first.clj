#!/usr/bin/env clojure

(defn solveMeFirst [x y] (+ x y))

(def a (first *command-line-args*))
(def b (second *command-line-args*))

(println (solveMeFirst (Integer/parseInt a) (Integer/parseInt b)))
