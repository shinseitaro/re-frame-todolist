; Viewからの問い合わせに答え，アプリケーション状態を加工した結果を返すためのコードを記述

(ns re-frame-todolist.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::todos
 (fn [db]
   (-> db :todo vals)))


