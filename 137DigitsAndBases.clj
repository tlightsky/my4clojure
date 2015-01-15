(defn __ [n b]
  (loop [l n
         r []]
    (if (= 0 l)
      (if (empty? r)
        [0]
        r)
      (recur (int (/ l b)) (concat [(rem l b)] r)))))

(= [0] (__ 0 11))

(= [1 2 3 4 5 0 1] (__ 1234501 10))

(= [1 0] (let [n (rand-int 100000)](__ n n)))

(= [16 18 5 24 15 1] (__ Integer/MAX_VALUE 42))
