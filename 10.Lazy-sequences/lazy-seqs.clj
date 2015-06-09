;;#lazy-sequences/1
;;-----------------------

(= '(1 2 3 4) (range 1 5))
;;=> true



;;#lazy-sequences/2
;;-----------------------

(= '(0 1 2 3 4) (range 5))
;;=> true



;;#lazy-sequences/3
;;-----------------------

(= [0 1 2 3 4 5 6 7 8 9] (take 10 (range 100)))
;;=> true


;;#lazy-sequences/4
;;-----------------------

(= [95 96 97 98 99] (drop 95 (range 100)))
;;=> true



;;#lazy-sequences/5
;;-----------------------

(= '(0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19) (take 20 (iterate inc 0)))
;;=> true



;;#lazy-sequences/6
;;-----------------------

(= [:a :a :a :a :a :a :a :a :a :a] (repeat 10 :a ))
;;=> true



;;#lazy-sequences/7
;;-----------------------

(= (repeat 100 :foo) (take 100 (iterate (fn[x] x) :foo)))
;;=> true
