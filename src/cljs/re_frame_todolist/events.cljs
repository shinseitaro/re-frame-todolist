; Viewからディスパッチされたイベントを処理するハンドラーのコードを記述
;; アプリケーションの状態の変更はこの events の中でのみ行う．

(ns re-frame-todolist.events
  (:require
   [re-frame.core :as re-frame]
   [re-frame-todolist.db :as db]
   ))

;; reg-event-db イベントハンドラーの登録
;; (reg-event-db eventID handler)  eventIDというIDを持つハンドラーの登録
;; handlerは関数で，第一引数が現在のアプリケーションの状態，第二引数はイベントとパラメータのベクタ．返り値は次のアプリケーションの状態
;; ココでは現在の上級おにかかわらずdb/default-dbを返す事で初期化している
(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
