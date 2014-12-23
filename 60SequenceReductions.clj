(defn sr
  ([func coll] (sr func (first coll) (rest coll)))
  ([func res coll]
    (lazy-seq
      (if (empty? coll) (vector res)
        (cons res (sr func (func res (first coll)) (rest coll)))))))

(take 5 (sr + (range)))
