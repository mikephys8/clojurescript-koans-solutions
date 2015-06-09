(def test-address
  {:street-address "123 Test Lane"
   :city "Testerville"
   :state "TX"})
;;=> #'user/test-address


;;#destructuring/1
;;----------------

(= ":bar:foo" ((fn [[a b]] (str b a)) [:foo :bar]))
;;=> true



;;#destructuring/2
;;----------------

(= (str "First comes love, " "then comes marriage, " "then comes Clojure with the baby carriage")
   ((fn [[a b c]] (str "First comes " a ", " "then comes " b ", " "then comes " c " with the baby carriage")) ["love" "marriage" "Clojure"]))
;;=> true



;;#destructuring/3
;;----------------

(= "Rich Hickey aka The Clojurer aka Go Time aka Macro Killah"
   (let [[first-name last-name & aliases] (list "Rich" "Hickey" "The Clojurer" "Go Time" "Macro Killah")]
     (str first-name " " last-name " aka " (apply str (interpose " aka " aliases)))))
;;=> true



;;#destructuring/4
;;----------------

(= {:original-parts ["Steven" "Hawking"], :named-parts {:first "Steven", :last "Hawking"}}
   (let [[first-name last-name :as full-name] ["Steven" "Hawking"]]
     {:original-parts full-name
      :named-parts {:first first-name
                    :last last-name}}))
;;=> true



;;#destructuring/5
;;----------------

(= "123 Test Lane, Testerville, TX"
   (let [{street-address :street-address, city :city, state :state} test-address]
     (str street-address ", " city ", " state)))
;;=> true



;;#destructuring/6
;;----------------

(= "123 Test Lane, Testerville, TX"
   (let [{:keys [street-address city state]} test-address]
     (str street-address ", " city ", " state)))
;;=> true



;;#destructuring/7
;;----------------

(= "Test Testerson, 123 Test Lane, Testerville, TX"
   (#(str (apply str (interpose " " %)) ", "
          (let [{:keys [street-address city state]} %2]
            (str street-address ", " city ", " state)))
    ["Test" "Testerson"] test-address))
;;=> true

;;======
;;==OR==
;;======
(= "Test Testerson, 123 Test Lane, Testerville, TX"
   (#(apply str
            (interpose ", "
                       (concat
                        [(apply str (interpose " " %))]
                        [(:street-address %2) (:city %2) (:state %2)])))  ["Test" "Testerson"] test-address))
;;=> true

