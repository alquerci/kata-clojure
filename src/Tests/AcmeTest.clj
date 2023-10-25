(defn assertSame [expected actual]
  (= expected actual)
)

(defn exit [condition]
  (System/exit (if condition 0 1))
)

(exit (assertSame 1 1))
