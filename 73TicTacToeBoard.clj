(defn __ [board]
  (let [t (fn [[[a b c]
                [d e f]
                [g h i]] v]
            (or (= v a b c)
                (= v d e f)
                (= v g h i)
                (= v a d g)
                (= v b e h)
                (= v c f i)
                (= v a e i)
                (= v c e g)))]
    (cond (t board :x) :x
          (t board :o) :o
          :else nil)))


(= nil (tttb [[:e :e :e]
            [:e :e :e]
            [:e :e :e]]))

(= :x (__ [[:x :e :o]
           [:x :e :e]
           [:x :e :o]]))

(= :o (__ [[:e :x :e]
           [:o :o :o]
           [:x :e :x]]))

(= nil (__ [[:x :e :o]
            [:x :x :e]
            [:o :x :o]]))

(= :x (__ [[:x :e :e]
           [:o :x :e]
           [:o :e :x]]))

(= :x (__ [[:x :e :e]
           [:o :x :e]
           [:o :e :x]]))

(= nil (__ [[:x :o :x]
            [:x :o :x]
            [:o :x :o]]))
