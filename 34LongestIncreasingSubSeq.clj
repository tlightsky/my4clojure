(defn liss [coll]
  (loop [c coll
         curr []
         maxl []]
    (let [maxl (if (and (> (count curr) (count maxl))
                        (>= (count curr) 2)) curr maxl)]
      (if (empty? c) maxl
        (if (or (= (dec (first c)) (last curr)))
          (recur (rest c) (conj curr (first c)) maxl)
          (recur (rest c) [(first c)] maxl))))))

(liss [1])
(liss [1 0 1 2 3 0 4 5])
(liss [7 6 5 4])
