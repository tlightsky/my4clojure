(defn jux [& funcs]
  (fn [& args]
    (loop [f funcs
           res []]
      (if (empty? f) res
        (recur (rest f) (conj res (apply (first f) args)))))))


((jux + max min) 2 3 5 1 6 4)
