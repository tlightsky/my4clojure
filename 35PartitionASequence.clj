(defn pas [n coll]
  (when (>= (count coll) n)
    (cons (take n coll) (pas n (drop n coll)))
  ))


(pas 3 (range 9))