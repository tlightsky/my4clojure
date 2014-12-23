(defn fdi [coll]
  (loop [c coll
         res []]
    (if (empty? c) res
      (if (boolean (some #(= (first c) %) res))
        (recur (rest c) res)
        (recur (rest c) (conj res (first c)))))))

(fdi [:a :a :b :b :c :c])
(fdi (range 50))
