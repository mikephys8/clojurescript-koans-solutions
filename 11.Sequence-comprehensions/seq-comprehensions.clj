;;#sequence-comprehensions/1
;;-----------------------

(= '(0 1 2 3 4 5) (for [index (range 6)] index))
;;=> true



;;#sequence-comprehensions/2
;;-----------------------

(= '(0 1 4 9 16 25)
   (map (fn [index] (* index index)) (range 6))
   (for [index (range 6)] (* index index)))
;;=> true



;;#sequence-comprehensions/3
;;-----------------------

(= '(1 3 5 7 9)
   (filter odd? (range 10))
   (for [index (range 10)
         :when (odd? index)] index))
;;=> true



;;#sequence-comprehensions/4
;;-----------------------

(= '(1 9 25 49 81)
   (map (fn [index] (* index index)) (filter odd? (range 10)))
   (for [index (range 10) :when (odd? index)] (* index index)))
;;=> true



;;#sequence-comprehensions/5
;;-----------------------

(= [[:top :left] [:top :middle] [:top :right]
    [:middle :left] [:middle :middle] [:middle :right]
    [:bottom :left] [:bottom :middle] [:bottom :right]]
   (for [row [:top :middle :bottom] column [:left :middle :right]] [row column]))
;;=> true
