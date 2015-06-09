(defn square [x] (* x x))
;;=> #'user/square


;;#creating-functions/1
;;-----------------------

(= [true false true] (let [not-a-symbol? (complement symbol?)]
                       (map not-a-symbol? [:a 'b "c"])))
;;=> true



;;#creating-functions/2
;;-----------------------

(= [:wheat "wheat" 'wheat] (let [not-nil? (complement nil?)]
                             (filter not-nil? [nil :wheat nil "wheat" nil 'wheat nil])))
;;=> true



;;#creating-functions/3
;;-----------------------

(= 20 (let [multiply-by-5 (partial * 5)]
        (multiply-by-5 4)))
;;=> true



;;#creating-functions/4
;;-----------------------

(= [:a :b "mitsos" "takis"] (let [ab-adder (partial concat [:a :b])]
                              (ab-adder ["mitsos" "takis"])))
;;=> true



;;#creating-functions/5
;;-----------------------

(= 25 (let [inc-and-square (comp square inc)]
        (inc-and-square 4 )))
;;=> true



;;#creating-functions/6
;;-----------------------

(= 8 (let [double-dec (comp dec dec)]
       (double-dec 10)))
;;=> true



;;#creating-functions/7
;;-----------------------

(= 99 (let [square-and-dec (comp dec square)]
        (square-and-dec 10)))
;;=> true
