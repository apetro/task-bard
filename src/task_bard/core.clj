(ns task-bard.core
  (:gen-class))
(use 'pretty.cli.prompt)


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (while true
    (let
      [task
        (input "What needs doing?" (fn [x] (if (= "" x) "Sorry?")))]
      (println)
      (println "Okay. Then do " task)
      (while (not (confirm (str "Is " task " done yet"))))
      (println)
      (println "Congratulations on doing " task)
      (println))))
