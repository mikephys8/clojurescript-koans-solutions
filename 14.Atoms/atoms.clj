(def atomic-clock (atom 0))
;;=> #'user/atomic-clock


;;#atoms/1
;;--------

(= 0 (deref atomic-clock))
;;=> true



;;#atoms/2
;;--------

(= 0  @atomic-clock)
;;=> true



;;#atoms/3
;;--------

(= 1 (do
       (swap! atomic-clock inc)
       @atomic-clock))
;;=> true



;;#atoms/4
;;--------

;;***************************************************************************
(reset! atomic-clock 0)

(= 5 (do (last (take 5 (repeatedly #(swap! atomic-clock inc))))
         @atomic-clock))
;;=> true

;;======
;;==OR==
;;======

(= 5 (do (reset! atomic-clock 5)
         @atomic-clock))
;;=> true

;;***************************************************************************



;;#atoms/5
;;--------

(reset! atomic-clock 0)

(= 15 (do (swap! atomic-clock + 1 2 3 4 5)
          @atomic-clock))
;;=> true



;;#atoms/6
;;--------

(reset! atomic-clock 0)

(= 0 (do (compare-and-set! atomic-clock 100 :fin)
         @atomic-clock))
;;=> true



;;#atoms/7
;;--------

(reset! atomic-clock 0)

(= :fin (do (compare-and-set! atomic-clock 0 :fin)
            @atomic-clock))
;;=> true

