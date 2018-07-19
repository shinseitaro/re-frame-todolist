; Reagentコンポーネントを使いViewを作成するコードを記述

(ns re-frame-todolist.views
  (:require
   [re-frame.core :as re-frame]
   [re-frame-todolist.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     ]))


(defn todo-item
  [todo]
  [:li (:title todo)])

(defn todo-list
  []
  (let [todos @(re-frame/subscribe [::subs/todos])]
    [:ul
     (for [todo todos]
       ^{:key (:id todo)}
       [todo-item todo])]))

