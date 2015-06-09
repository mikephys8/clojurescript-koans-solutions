;;#maps/1
;;-------

(= {:a 1, :b 2} (hash-map :a 1 :b 2))
;;=> true



;;#maps/2
;;-------

(= {:a 1} (hash-map :a 1))
;;=> true



;;#maps/3
;;-------

(= 2 (count {:a 1, :b 2}))
;;=> true



;;#maps/4
;;-------

(= 2 (get {:a 1, :b 2} :b))
;;=> true



;;#maps/5
;;-------

(= 1 ({:a 1, :b 2} :a))
;;=> true



;;#maps/6
;;-------

(= 1 (:a {:a 1, :b 2}))
;;=> true



;;#maps/7
;;-------

(= "Vancouver" ({2006 "Torino", 2010 "Vancouver", 2014 "Sochi"} 2010))
;;=> true



;;#maps/8
;;-------

(= nil (get {:a 1, :b 2} :c))
;;=> true



;;;;#maps/9
;;---------

(= :key-not-found (get {:a 1, :b 2} :c :key-not-found))
;;=> true



;;#maps/10
;;--------

(= true (contains? {:a nil, :b nil} :b))
;;=> true



;;#maps/11
;;--------

(= false (contains? {:a nil, :b nil} :c))
;;=> true



;;#maps/12
;;--------

(= {1 "January", 2 "February"} (assoc {1 "January"} 2 "February"))
;;=> true



;;#maps/13
;;--------

(= {1 "January"} (dissoc {1 "January", 2 "February"} 2))
;;=> true



;;#maps/14
;;--------

(= (list 2006 2010 2014) (sort (keys {2010 "Vancouver", 2014 "Sochi", 2006 "Torino"})))
;;=> true



;;#maps/15
;;--------

(= (list "Sochi" "Torino" "Vancouver") (sort (vals {2006 "Torino", 2010 "Vancouver", 2014 "Sochi"})))
;;=> true
