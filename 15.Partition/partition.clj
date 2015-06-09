;;#partition/1
;;------------

(= '((0 1) (2 3)) (partition 2 (range 4)))
;;=> true



;;#partition/2
;;------------

(= '((:a :b :c)) (partition 3 [:a :b :c :d :e]))
;;=> true



;;#partition/3
;;------------

(= '((0 1 2) (3 4)) (partition-all 3 (range 5)))
;;=> true



;;#partition/4
;;------------

(= '((0 1 2) (5 6 7) (10 11 12)) (partition 3 5 (range 13)))
;;=> true



;;#partition/5
;;------------

(= '((0 1 2) (3 4 5) (6 :hello)) (partition 3 3 [:hello] (range 7)))
;;=> true



;;#partition/6
;;------------

(= '((0 1 2) (3 4 5) (6 :this :are)) (partition 3 3 [:this :are "my" "words"] (range 7)))
;;=> true


;;===================================COMPLETED SUCCESFULLY============================================
