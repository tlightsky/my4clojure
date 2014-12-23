((defn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)
(foo 0)
(conj nil 3)
