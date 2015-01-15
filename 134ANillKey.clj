(defn __ [k col]
  (and (contains? col k) (= nil (col k))))

(true?  (__ :a {:a nil :b 2}))

(false? (__ :b {:a nil :b 2}))

(false? (__ :c {:a nil :b 2}))
