;; Problem Statement
;;
;; Update the values of a list with their absolute values. The input and output portions will be handled automatically during grading. You only need to write a function with the recommended method signature.
;;
;; Input Format
;; There are N integers, each on a new line. These are the N elements of the input array.
;;
;; Output Format
;; N integers each on a new line; these are the absolute values of the input list, in that order.
;;
;; Sample Input
;;
;; 2
;; -4
;; 3
;; -1
;; 23
;; -4
;; -54
;; Sample Output
;;
;; 2
;; 4
;; 3
;; 1
;; 23
;; 4
;; 54
;; Constraints
;; The list will have no more than 100 integers. The list will be composed of integers X such that -100 <= X <= 100.

(defn abs [x]
  (cond (neg? x) (println (- x))
        :else (println x)))
((fn [lst]
   (loop [arr lst]
     (when-not (empty? arr)
       (abs (first arr))
       (recur (rest arr))))) [1 -2 3 -4 5 -6])

;; submitted code
(fn [lst]
  (loop [arr lst]
    (when-not (empty? arr)
      (let [x (first arr)]
        (cond
          (neg? x) (println (- x))
          :else (println x))
        (recur (rest arr))))))
