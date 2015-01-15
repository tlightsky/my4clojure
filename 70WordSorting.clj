(defn ws [sen]
  (sort-by (fn [v] (.toLowerCase v)) (re-seq #"\w+" sen)))

(= (ws  "Have a nice day.")
   ["a" "day" "Have" "nice"])
