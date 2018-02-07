(ns executable_salsixa.core
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main [& args]
  (prn (format "args=%s" args))
  (foo "salsixa"))
