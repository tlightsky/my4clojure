(defn mc [coll1 coll2]
  (loop [c1 coll1
         c2 coll2
         res {}]
    (if (or (empty? c1) (empty? c2) ) res
      (recur (rest c1) (rest c2) (conj res {(first c1) (first c2)})))))

(mc [:a :b :c] [1 2 3])
(mc [1 2 3 4] ["one" "two" "three"])
