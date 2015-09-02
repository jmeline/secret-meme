
(defn find-nb [m]
  (loop [x 1 res 0]
    (let [cube (*' x x x)]
      (if (< res m)
        (recur (inc x) (+' res cube))
        (if (= res m)
          (dec x)
          -1 )))))

;; (defn find-nb [m]
;;   (loop [x 1 res 0]
;;     (let [cube (*' x x x) limit (java.lang.Math/cbrt m)]
;;       (if (< res limit)
;;         (recur (inc x) (+' res cube))
;;         (if (= res m)
;;           (dec x)
;;           -1 )))))

(println ( find-nb 36)) ; => 3
(println ( find-nb 100)) ; => 4
(println ( find-nb 225)) ; => 5
(println ( find-nb (+ 225 (* 6 6 6)))) ; => 5
(println ( find-nb 1071225)) ; => 45
(println ( find-nb 1025247423603083074023000250000N))
