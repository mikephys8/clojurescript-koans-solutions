(defn explain-defcon-level [exercise-term]
  (case exercise-term
    :fade-out          :you-and-what-army
    :double-take       :call-me-when-its-important
    :round-house       :o-rly
    :fast-pace         :thats-pretty-bad
    :cocked-pistol     :sirens
    :say-what?))
;;=> #'user/explain-defcon-level


;;#conditionals/1
;;---------------

;; If condition is true..(so false here!) return :a else :b
(= :a (if (false? (= 4 5)) :a :b))
;;=> true



;;#conditionals/2
;;---------------

;; If condition is true(it is!) return empty vector.
(= [] (if (> 4 3) []))
;;=> true



;;#conditionals/3
;;---------------

;; If condition is true(it isn't!) return [:a :b :c], else (has nothing here..so return) nil.
(= nil (if (nil? 0) [:a :b :c]))
;;=> true



;;#conditionals/4
;;---------------

;; If condition is true(here the condition returns false!! (empty? ()) returns true, but with
;; not applied returns false) so it doesn't return :doom obviously, but :glory.
(= :glory (if (not (empty? ())) :doom :glory))
;;=> true



;;#conditionals/5
;;---------------

;; Here we assign locally x with value 5, as we can see the keyword :your-road is returned from equality(=)
;; cond is like multiple if, but for the first truthy condition returns value and evalutes no more,
;; so the equality checked inside parens is the predicate and outside of it is waht is returned in case of
;; truthiness. So we exclude first two cases and we are left with the :else case where we should return
;; :your-road obviously! the other two cases must not have value 5 for x, beacause that would lead to
;; truthiness.
(let [x 5] (= :your-road (cond (= x 1) :road-not-taken (= x 2) :another-road-not-taken :else :your-road)))
;;=> true



;;#conditionals/6
;;---------------

;; Here, both of the next two cases are true, because as example says your fate is sealed...whatever you
;; choose as arithmetic value to be checked returns 'doom.Both then and else return the same thing.

(= 'doom (if-not (zero? 0) 'doom 'doom))
;;=> true

;;==OR==
(= 'doom (if-not (zero? 1) 'doom 'doom))
;;=> true



;;#conditionals/7
;;---------------

;; Here as we can from the function provided we have a case with expression exercise-term and multiple clauses
;; so when we call the function with one of the clause's name the corresponding result-expr is returned.
(= :sirens (explain-defcon-level :cocked-pistol))
;;=> true



;;#conditionals/8
;;---------------

;; Here that there's no expression exercise-term with value :yo-mama, the default last expression is returned,
;; if function didn't have that last expression this would throw a java.lang.IllegalArgumentException.
(= :say-what? (explain-defcon-level :yo-mama))
;;=> true
