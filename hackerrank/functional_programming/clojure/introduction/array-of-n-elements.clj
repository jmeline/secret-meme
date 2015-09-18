;; Problem Statement
;;
;; Create an array of N integers, where N is specified as input. This can be any array with N integers. For example, for N=4 you could return [1,1,1,1] or [1,2,3,4]
;;
;; Sample Input
;;
;; 3
;; Sample of the Return Value
;;
;; [1, 2, 3]
;; Output Format
;; The output only indicates the number of elements contained in the list, array or vector you created.
;;
;; Constraints
;; N <= 100
;; The members of the List/Vector/Array returned should be integers.
;;
;; Method Signature
;;
;; Number Of Parameters: 1
;; Parameters: [n]
;; Returns: List or Vector
;; For Hackers Using Clojure
;;
;; This will be the outline of your function body (fill up the blank portion marked by underscores):
;;
;;  (fn[n]___________________________)

(fn[n] (range 1 (+ n 1)))
