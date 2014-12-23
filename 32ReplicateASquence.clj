(defn das [coll n]
  (mapcat #(take n (repeat %)) coll))

(das [1 2 3] 3)
