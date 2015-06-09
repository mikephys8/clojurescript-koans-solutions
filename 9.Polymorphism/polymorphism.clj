;;#runtime-polymorphism/1
;;-----------------------

(defn hello
  ([] "Hello World!")
  ([a] (str "Hello, you silly " a "."))
  ([a & more] (str "Hello to this group: "
                   (apply str
                          (interpose ", " (concat (list a) more)))
                   "!")))
;;=> #'user/hello


(= "Hello World!" (hello))
;;=> true



;;#runtime-polymorphism/2
;;-----------------------

(= "Hello, you silly world." (hello "world"))
;;=> true



;;#runtime-polymorphism/3
;;-----------------------

(= "Hello to this group: Peter, Paul, Mary!" (hello "Peter" "Paul" "Mary"))
;;=> true



;;#runtime-polymorphism/4
;;-----------------------

(defmulti diet (fn [x] (:eater x)))
;;=> #'user/diet

(defmethod diet :herbivore [a] "Bambi eats veggies.")
;;=> #<MultiFn clojure.lang.MultiFn@3254dfb>

(defmethod diet :carnivore [a] "Simba eats animals.")
;;=> #<MultiFn clojure.lang.MultiFn@3254dfb>

(defmethod diet :default [a] "I don't know what Rich Hickey eats.")
;;=> #<MultiFn clojure.lang.MultiFn@3254dfb>

(= "Bambi eats veggies." (diet {:species "deer", :name "Bambi", :age 1, :eater :herbivore}))
;;=> true



;;#runtime-polymorphism/5
;;-----------------------

(= "Simba eats animals." (diet {:species "lion", :name "Simba", :age 1, :eater :carnivore}))
;;=> true



;;#runtime-polymorphism/6
;;-----------------------

(= "I don't know what Rich Hickey eats." (diet {:name "Rich Hickey"}))
;;=> true
