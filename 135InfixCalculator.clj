(defn __ [ret & nums]
  (loop [r ret
         n nums]
    (if (empty? n) r
    (recur ((first n) r (second n)) (rest (rest n))))))


(= 7  (__ 2 + 5))
(= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))
