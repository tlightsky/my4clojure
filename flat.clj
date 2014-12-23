(defn flat [coll]
  (mapcat
    #(if (sequential? %) (flat %) [%]) coll))

(flat '((1 2) 3 [4 [5 6]]))

(defn ft [coll]
  (#(filter (complement sequential?) (tree-seq sequential? identity %)) coll))

(filter (complement sequential?) (tree-seq sequential? identity '((1 2) 3 [4 [5 6]])))
