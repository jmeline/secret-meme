(ns helloworld.core)

(defn -main [& args]
  "I don't do a whole lot."
  (println (format "Hello, World!, %s" 'args)))
(println "Cleanliness is next to godliness")

(defn train
  []
  (println "Choo Choo!"))

(defn penultimateElement
  [x]
  (if (< 2 (count x))
    (nth (reverse x) 1)
    (println "Smaller than 2!")))

