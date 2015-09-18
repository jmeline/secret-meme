 Utility Methods
(defn squared [n]
  (*' n n))
;; My solution
(defn find-nb-faster [m]
  (let [sqrt (bigint (java.lang.Math/ceil (java.lang.Math/sqrt m)))]
    (println "\nM: " m)
    (println "Sqrt " sqrt)
    (loop [x 1 res 0]
      ;; (println "X: " x " Res: " res)
      (if (= (bigint res) sqrt)
        (if (= (squared res) m)
          (dec x)
          -1)
        (if (< (bigint res) sqrt)
          (recur (inc x) (+ res x))
          -1 )))))

;; Original Poster's solutions
(defn find-nb [m]
  (let [s (biginteger (Math/floor (Math/sqrt m)))
        delta (+ (* 8 s) 1)
        sdelta (biginteger (Math/floor (Math/sqrt delta)))]

    (if (or (not= (* s s) m) (not= (* sdelta sdelta) delta))
      -1
      (quot (- sdelta 1) 2))))

;; Another solution to the problem
(defn int-sqrt [x return-floor]
  (loop [i (bigint (Math/sqrt x))]
    (let [s (* i i)]
      (cond (= x s) i
            (< x s) (if return-floor (dec i) nil)
            :else (recur (inc i))))))

(defn find-nb [m]
  (let [rt (int-sqrt m false)
        n (if rt (int-sqrt (* 2 rt) true))]
    (if (and rt (= rt (/ (* n (inc n)) 2)))
      (int n)
      -1)))

;; (defn find-nb-faster-formula [m]
;;   (let [sqrt (bigint (java.lang.Math/ceil (java.lang.Math/sqrt m)))]
;;   ;; (let [sqrt (java.lang.Math/ceil (java.lang.Math/sqrt m))]
;;     (println "\nM: " m (type m))
;;     (println "Sqrt " sqrt (type sqrt))
;;     (loop [x 1]
;;       ;; (println "x: " x)
;;     ;; If I find the right value
;;       (let [nth-value (get-nth-value x)]
;;         ;; (println "nth-value: " nth-value)
;;         (if (= nth-value sqrt)
;;           x
;;           (if (>= nth-value sqrt)
;;             -1
;;             (recur (inc x))))))))

;; (defn find-nb-faster [m]
;;   (let [sqrt (java.lang.Math/ceil (java.lang.Math/sqrt m))]
;;     (println "\nM: " m)
;;     (println "Sqrt " sqrt)
;;     (loop [x 1 res 0]
;;       (if (< res sqrt)
;;         (recur (inc x) (+ res x))
;;         (if (> res sqrt)
;;           -1
;;           (dec x))))))


;; (defn find-nb [m]
;;   (loop [x 1 res 0]
;;     (let [cube (*' x x x) limit (java.lang.Math/cbrt m)]
;;       (if (< res limit)
;;         (recur (inc x) (+' res cube))
;;         (if (= res m)
;;           (dec x)
;;           -1 )))))

(def large-N 1025247423603083074023000250000N)
(def large-N2 10252519345963644753026N)

;; Testing function
(println (find-nb-faster 36)) ; => 3
(println (find-nb-faster 100)) ; => 4
(println (find-nb-faster 225)) ; => 5
(println (find-nb-faster (+ 225 (* 6 6 6)))) ; => 6
(println (find-nb-faster 1071225)) ; => 45
(println (find-nb-faster 4183059834009)) ; => 2022
(println (find-nb-faster 24723578342962)) ; => -1
(println (find-nb-faster 91716553919377)) ; => -1
(println (find-nb-faster 18262169777476)) ; => 2923
(println (find-nb-faster large-N)) ; => 45001000
(println (find-nb-faster large-N2)) ; => -1
