(defn ri [func arg]
  (lazy-seq
    (cons arg (ri func (func arg)))))

(take 5 (ri #(* 2 %) 1))
