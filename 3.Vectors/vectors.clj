;;#vectors/1
;;----------

(= 1 (count [42]))
;;=> true



;;#vectors/2
;;----------

(= [1] (vec '(1)))
;;=> true



;;#vectors/3
;;----------

(= [nil nil] (vector nil nil))
;;=> true



;;#vectors/4
;;----------

(= [1 2] (vec '(1 2)))
;;=> true



;;#vectors/5
;;----------

(= [111 222 333] (conj [111 222] 333))
;;=> true



;;#vectors/6
;;----------

(= :peanut (first [:peanut :butter :and :jelly]))
;;=> true



;;#vectors/7
;;----------

(= :jelly  (last [:peanut :butter :and :jelly]))
;;=> true



;;#vectors/8
;;----------

(= :jelly (nth [:peanut :butter :and :jelly] 3))
;;=> true



;;#vectors/9
;;----------

(= [:butter :and] (subvec [:peanut :butter :and :jelly] 1 3))
;;=> true



;;#vectors/10
;;-----------

(= (list 1 2 3) (vector 1 2 3))
;;=> true
