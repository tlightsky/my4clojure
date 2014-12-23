(defn fc [& funcs]
  (fn [& args]
    (let [arg (apply (last funcs) args)
          f (drop-last funcs)]
    (loop [f f
           arg arg]
      (if (empty? f) arg
        (recur (drop-last f) ((last f) arg)))))))


((fc rest reverse) [1 2 3 4])
((fc (partial + 3) second) [1 2 3 4])
((fc zero? #(mod % 8) +) 3 5 7 9)
((fc #(.toUpperCase %) #(apply str %) take) 5 "hello world")
