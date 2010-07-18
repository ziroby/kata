(ns com.ziroby.kata.fizzbuzz.FizzBuzzer
    (:gen-class
    :state state
    :init init
    :methods [
    [convert [int] String]
    ]))

(defn -init [] [[] (atom [])])

(defn isDivisibleBy [number divisor]
  (= 0 (mod number divisor)))

(defn -convert [this number]
  (cond
    (isDivisibleBy number 5) "buzz"
    (isDivisibleBy number 3) "fizz"
    :else (str number)))
