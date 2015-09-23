
;; Return sum of odd elements from an list. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.
;;
;; Constraints
;; The list will have 1-100 elements. Each element will be an integer X such that -100<=X<=100.
;;
;; Sample Input
;;
;; 3
;; 2
;; 4
;; 6
;; 5
;; 7
;; 8
;; 0
;; 1
;; Sample Output
;;
;; 16

(fn [lst] (reduce (fn [x y] (if (odd? y) (+ y x) x)) lst))
