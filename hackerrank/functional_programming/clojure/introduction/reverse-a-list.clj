
(fn[lst]
  (loop [remaining-lst lst]
    (if-not (empty? remaining-lst)
      (do
        (println (last remaining-lst))
        (recur (drop-last remaining-lst)))
      )))
