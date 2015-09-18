
((fn [delim lst]
  (loop [arr lst]
    ;; (println delim (first arr))
    (if (< (first arr) delim)
      (println (first arr)))
    (if (> (count (rest arr))0)
      (recur (rest arr)))))3 [10 9 8 2 7 5 1 3 0])
