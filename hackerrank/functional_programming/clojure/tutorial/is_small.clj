(defn is-small? [n]
  "Returns yes or no if number is less than 100"
  (if (< n 100) "yes" "no"))

(fn [n]
  (if-not (= n 0)
    (println "Hello\n")))
(println (is-small? 10))
(println (is-small? 1009))
