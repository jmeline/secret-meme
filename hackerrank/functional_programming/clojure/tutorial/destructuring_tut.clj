(def names ["bob" "sally" "joe"])

(println (str "Names: " (clojure.string/join ", " names)))

;; Capture the first element of the vector
((fn [[first-name]]
  (println (str "First name in list: " first-name))) names)

;; Capture the second element of the vector
((fn [[_ second-name]]
  (println (str "Second name in list: " second-name))) names)

;; Capture the remaning elements of the vector
((fn [[_ & rest-names]]
   (println (str "Remaining names in the list: " (clojure.string/join ", " rest-names))))  names)

(defn draw-point [& {x :x y :y}]
  (println [x y]))

;; Should be the same
(println "I should be true: " (= (draw-point :y 20 :x 10) (draw-point :x 10 :y 20)))

;; An alternative way to pass a map
(defn draw-point [& {:keys [x y z]}]
  (println [x y z]))
(draw-point :x 30 :y 10 :z 100)

;; default arguments using :or operator
(defn draw-point [& {:keys [x y z]
                     :or {x 0
                          y 1
                          z 2}}]
  [x y z])
(println (draw-point))
(println "I should be true because [0 1 2] should be the default values when sending no parameters into draw-point : " (= [0 1 2] (draw-point)))



