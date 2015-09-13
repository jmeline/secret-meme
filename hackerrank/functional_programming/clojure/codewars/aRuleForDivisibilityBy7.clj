;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; --------------------------- ;;
;; A Rule of Divisibility by 7 ;;
;; --------------------------- ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; A number m of the form 10x + y is divisible by 7 if and only if x − 2y is divisible by 7. In other words, subtract twice the last digit from the number formed by the remaining digits. Continue to do this until a number known to be divisible or not by 7 is obtained; you can stop when this number has at most 2 digits because you are supposed to know if a number between 0 and 99 is divisible by 7 or not.

;; The original number is divisible by 7 if and only if the last number obtained using this procedure is divisible by 7.

;; Examples:

;; 1 - m = 371 -> 37 − (2×1) -> 37 − 2 = 35 ; thus, since 35 is divisible by 7, 371 is divisible by 7.

;; The number of steps to get the result is 1.

;; 2 - m = 1603 -> 160 - (2 x 3) -> 154 -> 15 - 8 = 7 and 7 is divisible by 7.

;; 3 - m = 372 -> 37 − (2×2) -> 37 − 4 = 33 ; thus, since 33 is not divisible by 7, 372 is not divisible by 7.

;; The number of steps to get the result is 2.

;; 4 - m = 477557101->47755708->4775554->477547->47740->4774->469->28 and 28 is divisible by 7, so is 477557101.

;; The number of steps is 7.

(defn is-divisible-by-7 [n]
  "Returns true if n % 7 == 0"
  (= (mod n 7) 0))

(defn is-within-limit [n]
  "Checks whether a number is between 0 and 99"
  (and (<= n 99) (>= n 0)))

(defn seven [m]
  (loop [steps 0 value m]
    ;; (println "steps: " steps " value: " value)
    (if (is-within-limit value)
      (if (is-divisible-by-7 value)
        (list value steps)
        (list value steps))
        ;; (str "Limited reached: " value " at step: " steps))
      (let [x (quot value 10) y (* (mod value 10) 2) res (- x y)]
        ;; (println "x: " x " y: " y " res: " res)
        (recur (inc steps) res)))))

;; testing
(let [v 371 x (seven v) y [35 1]] (println v ": " x "=> " y "? " (= x y)))
(let [v 1603 x (seven v) y [7 2]] (println  v ": " x "=> " y "? " (= x y)))
(let [v 477557101 x (seven v) y [28 7]] (println  v ": " x "=> " y "? " (= x y)))
(let [v 2937633 x (seven v) y [18 5]] (println  v ": " x "=> " y "? " (= x y)))





