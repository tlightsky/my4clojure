(defn rg [s e]
  (take (- e s) (iterate inc s))
 )
(rg 1 4)
