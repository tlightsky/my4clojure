(defn [func coll]
  (loop [f func
         c coll]
    ()))

(gas #(> % 5) [1 3 6 8])
