;; (defn printme [num value]
;;   (loop [x num]
;;     (if (> x 0)
;;       (do
;;         (println value)
;;         (recur (dec x))))))
;;
;; ((fn counter [num lst]
;;    (printme num (first lst))
;;    (if (> (count (rest lst)) 0)
;;     (counter num (rest lst)))) 2 [1 2 3 4 52])

((fn [num lst]
  (map (fn [x] (repeat num)) lst)) 2 [1 2 3])

((fn [num lst]
  (mapcat (partial repeat num) lst)) 2 [1 2 3])
