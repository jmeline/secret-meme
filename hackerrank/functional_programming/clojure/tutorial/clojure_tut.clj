;; functions
;;    Clojure functions are first class, and can be passed to other functions as values.
;; ----------------------------------------

; Annonomous Functions
(fn [msg](println msg))

; Both are equivalent
(def messenger (fn [msg] (print msg)))
(defn messenger [msg] (print msg))

; Running annonomous functions
((fn [msg](println msg))"Hello clojure")
; or
(messenger "Hello clojure")

;; let
(let [x 10
      y 20]
  (+ x y))

;; multi-arity functions
;; ----------------------------------------
(defn messenger
  ;; no args, call self with default msg
  ([] (messenger "Hello World!"))
  ;; one arg, print it
  ([msg] (print msg)))

(messenger)
;; Hello World!
(messenger "Hello Class!")
;; Hello class!

;; Additional Example of multi-arity
(defn messenger
  ([] (messager "Hello World!"))
  ([msg] (print msg)))

;; Variadic functions - indefinite ariety
;; & symbol in params
;;   Next param collects all remaining args
;;   Collected args represented as sequence
;; ----------------------------------------

(defn messenger [greeting & who]
  (print greeting who))
(messenger "Hello" "World" "class")
;; Hello (world class)

;; Apply
;; unpacks sequence of arguments
;; ----------------------------------------
(let [a 1
      b 2
      more '(3 4)]
  (apply f a b more))
;; this invokes (f 1 2 3 4)
(defn messenger [greeting & who]
  ;; apply gets args out of sequence
  (apply print greeting who))
(messenger "Hello" "world" "class")
;; Hello world class

;; Additional Example
(defn messenger [greeting & who]
  ;; apply gets args out of sequence
  (print greeting who))
(messenger "Hello" "world" "class")

(defn messenger2 [greeting & who]
  (apply print who))
(messenger2 "Hello" "world" "class")

;; One more examples
(let [numbers '(1 2 3)]
  (apply + numbers))
; (+ 1 2 3)

;; Closures (Scoping)
;; ----------------------------------------
(defn messenger-builder [greeting]
  (fn [who] (print greeting who))) ; closes over greeting
;; greeting provided here, then goes out of scope
(def hello-er (messenger-builder "Hello"))
;; greeting still available because hello-er is closure
(hello-er "world!")
;; Hello World!


;; Invoking Java Code
;; ----------------------------------------

; Task            Java                Clojure
;Instantiation   new Widget("Foo")    (Widget. "foo")
;Instance method rnd.nextInt()        (.nextInt rnd)
;Instance field  object.field         (.-field object)
;Static method   Math.sqrt(25)        (Math/sqrt 25)
;Static field    Math.PI              Math/PI



;; Chaining Access
;; ----------------------------------------

; Java      person.getAddress().getZipCode()
; clj       (.getZipCode (.getAddress person))
; clj sugar (.. person getAddress getZipCode)

;; Java Methods vs Functions
;; ----------------------------------------

;; make a function to invoke .length on arg
(fn [obj] (.length obj))


;; Terse fn reader macro
;;  single argument:    %
;;  Multiple args:      %1, %2, %3
;;  Variadic:           %& for remaining args
;; ----------------------------------------

;; a function to invoke .length on arg
#(.length %)

;; Summary
;; ----------------------------------------
(defn greet
  ([name] (greet "Hello" name))
  ([greeting name] (str greeting ", " name "!")))

(defn concat-strings [& strings]
  (apply str strings))
;; (concat-strings "one" "two" "three") ;=> "onetwothree"

;; let binds names to values and is a way to create lexical scopes. Function arguments are also lexically scoped

;; the dot special operator provides a way to invoke java method access fields.

(.length "Clojure") ;=> 7
((fn [s] (.length s))"clojure") ;=> 7


