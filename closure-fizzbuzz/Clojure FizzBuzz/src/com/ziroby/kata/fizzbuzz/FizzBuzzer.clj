(ns com.ziroby.kata.fizzbuzz.FizzBuzzer
    (:gen-class
    :state state
    :init init
    :methods [
    [convert [int] String]
    ]))

(defn -init [] [[] (atom [])])

(defn isDivisibleBy3 [number]
  (= 0 (mod number 3)))

(defn -convert [this number]
  (cond
    (= 5 number) "buzz"
    (isDivisibleBy3 number) "fizz"
    :else (str number)))
