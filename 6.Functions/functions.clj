(defn multiply-by-ten [n]
  (* 10 n))
;;=> #'user/multiply-by-ten

(defn square [n] (* n n))
;;=> #'user/square



;;#functions/1
;;------------

(= 81 (square 9))
;;=> true



;;#functions/2
;;------------

(= 20 (multiply-by-ten 2))
;;=> true



;;#functions/3
;;------------

(= 10 ((fn [n] (* 5 n)) 2))
;;=> true



;;#functions/4
;;------------

(= 60 (#(* 15 %) 4))
;;=> true



;;#functions/5
;;------------

(= 15 (#(+ %1 %2 %3) 4 5 6))
;;=> true



;;#functions/6
;;------------

(= 30 (#(* 15 %2) 1 2))
;;=> true



;;#functions/7
;;------------

;;--------------------------------------------------------------------------------------------------
;; It could be correct, but fn has one extra pair of parens and no argument included!in this example
(= 9 ((fn [& args] (reduce + args)) 4 5))
;;--------------------------------------------------------------------------------------------------

;; So....we need a function that returns a function which, when is called (the extra parens)
;; will be applied on the argument that this example has!

(= 9 (((fn []
         (fn [& args] (reduce + args)))) 4 5))
;;=> true

;;=============================================================================================
;; So the actual function is:                                                                  |
                                                                                              |
(defn adder [& args]                                                                          |
  (reduce + args))                                                                            |
;;=> #'user/adder                                                                             |
                                                                                              |
(adder 4 5)                                                                                   |
;;=> 9                                                                                        |
                                                                                              |
;; OR more clearly                                                                             |
                                                                                              |
((fn [& args] (reduce + args)) 4 5)                                                           |
;;=> 9                                                                                        |
                                                                                              |
;; Because os the extra parens of this example, which mean call the function included inside  |
;; we need a fn function that returns a function, which will give the above result!           |
;;=============================================================================================


;;#functions/8
;;------------

;; Here as example shows, we a function f to apply to args 4 and 5 or more, with the way i did it!
(= 20 ((fn [f] (f 4 5)) (fn [& args] (reduce * args))))
;;=> true



;;#functions/9
;;------------

;; Here is like the previous example but now we seek the function that calls the second function!
(= 25 ((fn [f] (f 5)) (fn [n] (* n n))))
;;=> true



;;#functions/10
;;-------------

;; This is the same exactly as the previous one, but as you can see names the second function as
;; "square"!

(= 25 ((fn [f] (f 5)) square))
;;=> true
