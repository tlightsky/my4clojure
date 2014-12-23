(defn das [coll]
  (mapcat #(vector % %) coll))

(das [1 2 3])
