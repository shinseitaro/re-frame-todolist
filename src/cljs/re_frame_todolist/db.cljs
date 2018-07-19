; アプリケーションの初期状態に関するコードを記述

(ns re-frame-todolist.db)

(def default-db
  {:todo {1 {:id 1 :title "豚肉を買ってくる"}
          2 {:id 2 :title "玉ねぎを買ってくる"}
          3 {:id 3 :title "人参も"}
          4 {:id 4 :title "じゃがいもも"}
          5 {:id 4 :title "つくる"}}})





