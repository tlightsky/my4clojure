(defn mf [func & cols]
  (reduce (fn [r n] ; merge cols
    (reduce (fn [a [k v]] ; merge keys
      (if (contains? a k)
        (assoc a k (func (a k) v))
        (assoc a k v))) r n))
          cols))

(defn mf2 [func & cols]
  (let [f (fn [a [k v]]
            (if (contains? a k)
              (assoc a k (func (a k) v))
              (assoc a k v)))]
    (reduce #(reduce f % %2) cols)))

(= (mf2 * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
   {:a 4, :b 6, :c 20})

(= (mf2 - {1 10, 2 20} {1 3, 2 10, 3 15})
   {1 7, 2 10, 3 15})

(= (mf2 - {1 10, 2 20} {1 3, 2 10, 3 15})
   {1 7, 2 10, 3 15})

