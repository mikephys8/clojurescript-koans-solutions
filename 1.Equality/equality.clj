;;#equality/1
;;-----------

(= true true)
;;=> true



;;#equality/2
;;-----------

(= 2 (+ 1 1))
;;=> true



;;#equality/3
;;-----------

(= (+ 3 4) 7 (+ 2 5))
;;=> true



;;#equality/4
;;-----------

(= false (= 2 "2"))
;;=> true



;;#equality/5
;;-----------

(= true  (not (= 1 nil)))
;;=> true



;;#equality/6
;;-----------

(= false (= "foo" :foo 'foo))
;;=> true



;;#equality/7
;;-----------

(= :foo (keyword "foo"))
;;=> true



;;#equality/8
;;-----------

(= 'foo (symbol "foo"))
;;=> true



;;#equality/9
;;-----------

(not= :fill-in-the-blank 1)
;;=> true

;;==OR==
(not= :fill-in-the-blank :wipe-out-all)
;;=> true

;;==OR==
(not= :fill-in-the-blank "1")
;;=> true

;;OR...OR...
