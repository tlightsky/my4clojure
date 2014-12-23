(defn co [coll]
   (into {} (map (fn [[x y]] [x (count y)]) (group-by identity coll))))

(co [:b :a :b :a :b])