;;#higher-order-functions/1
;;-------------------------

(= '(4 8 12) (map (fn [x] (* 4 x)) [1 2 3]))
;;=> true



;;#higher-order-functions/2
;;-------------------------

(= '(1 4 9 16 25) (map (fn [x] (* x x)) [1 2 3 4 5]))
;;=> true



;;#higher-order-functions/3
;;-------------------------

(= '(false false true false false) (map nil? [:a :b nil :c :d]))
;;=> true



;;#higher-order-functions/4
;;-------------------------

(= '() (filter (fn [x] false) '(:anything :goes :here)))
;;=> true



;;#higher-order-functions/5
;;-------------------------

(= '(:anything :goes :here) (filter (fn [x] true) '(:anything :goes :here)))
;;=> true



;;#higher-order-functions/6
;;-------------------------

(= [10 20 30] (filter (fn [x] (< x 40) ) [10 20 30 40 50 60 70 80]))
;;=> true



;;#higher-order-functions/7
;;-------------------------

(= [10 20 30] (map (fn [x] (* x 10)) (filter (fn [x] (< x 4)) [1 2 3 4 5 6 7 8])))
;;=> true



;;#higher-order-functions/8
;;-------------------------

(= 24  (reduce (fn [a b] (* a b)) [1 2 3 4]))
;;=> true



;;#higher-order-functions/9
;;-------------------------

(= 2400 (reduce (fn [a b] (* a b)) 100  [1 2 3 4]))
;;=> true



;;#higher-order-functions/10
;;--------------------------

(= "longest" (reduce (fn [a b] (if (< (count a) (count b)) b a)) ["which" "word" "is" "longest"]))
;;=> true

;;=================================================
;; Because                                        |
;;--------                                        |
                                                  |
                                                  |
(reduce (fn [a b]                                 |
          (if (< (count a) (count b))             |
              b                                   |
              a)) ["which" "word" "is" "longest"])|
;;=> "longest"                                    |
;;=================================================
