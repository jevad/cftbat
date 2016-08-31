(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (do
  (if args println("args" args))
  ; (println "I'm a little teapot!"))
  (println "I'm a" (first args) "!")))
