;;#lists/1
;;--------

(= '(1 2 3 4 5) (list 1 2 3 4 5))
;;=> true



;;#lists/2
;;--------

(= 1 (first '(1 2 3 4 5)))
;;=> true



;;#lists/3
;;--------

(= '(2 3 4 5) (rest '(1 2 3 4 5)))
;;=> true



;;#lists/4
;;--------

(= 3 (count '(dracula dooku chocula)))
;;=> true



;;#lists/5
;;--------

(= 0 (count '()))
;;=> true



;;#lists/6
;;--------

(= '() (rest '(100)))
;;=> true



;;#lists/7
;;--------

(= '(:a :b :c :d :e) (cons :a '(:b :c :d :e)))
;;=> true



;;#lists/8
;;--------

(= '(:a :b :c :d :e) (conj '(:b :c :d :e) :a))
;;=> true



;;#lists/9
;;--------

(= :a (peek '(:a :b :c :d :e)))
;;=> true



;;#lists/10
;;--------

(= '(:b :c :d :e) (pop '(:a :b :c :d :e)))
;;=> true
