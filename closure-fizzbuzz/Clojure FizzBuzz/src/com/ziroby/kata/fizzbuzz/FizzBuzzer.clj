(ns com.ziroby.kata.fizzbuzz.FizzBuzzer
    (:gen-class
    :state state
    :init init
    :methods [
    [convert [int] String]
    ]))

(defn -init [] [[] (atom [])])

(defn -convert [this number]
  (cond
    (= 5 number) "buzz"
    (= 3 number) "fizz"
    :else (str number)))
