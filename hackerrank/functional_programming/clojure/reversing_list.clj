#!/usr/local/bin env clj
(def example (int 35231))

(defn digitize
  ; Given a non-negative integer, return an array containing a list of independent digits in reverse order
  [example]
  (loop [x 1234]
    (when (> x 0 )
      (print (str (mod x 10) " "))
      (recur (quot x 10)))))
(println (digitize example) (str "Hello" ))



