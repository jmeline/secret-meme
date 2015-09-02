#!/usr/local/bin env clj
(def example (int 35231))
(def example2 (int 1051986650))

(defn digitize [n]
  (loop [results []
         x n]
    (let [results (conj results (mod x 10))]
      (if (>= x 10)
        (recur results (quot x 10))
        results))))

(println (digitize example))
