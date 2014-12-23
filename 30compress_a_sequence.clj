(defn pas [coll]
  (loop [c coll
         res  []
         part [] ]
    (defn empty-merge [res part]
      (if (empty? part)
        res
        (conj res part)))
    (if (empty? c)
      (empty-merge res part)
      (if (= (first c) (last part))
        (recur (rest c) res (conj part (first c)))
        (recur (rest c) (empty-merge res part) [(first c)])))))

(= (pas [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
