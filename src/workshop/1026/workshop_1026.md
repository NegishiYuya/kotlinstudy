# 10/26 勉強会 お題

試験結果が下記のようにあります。

| id  | groupId(グループID) | name(名前) | math(数学の得点) | english(英語の得点) |
| --- | ------- | ---- | ---- | ------- |
| 1   | 1       | 太郎 | 39   | 73      |
| 2   | 2       | 花子 | 40   | 70      |
| 3   | 2       | 三郎 | 41   | 69      |
| 4   | 3       | 四郎 | 42   | 68      |
| 5   | 3       | 五郎 | 42   | 69      |

これらの集計を行うファイル`AggregateExamResult.kt`があります。  
また、試験結果はクラス`ExamResult`で管理されます。

`AggregateExamResult.kt`の関数`main()`では、  
上記の試験結果をいくつかの観点で集計しています。  
TODO コメントで書かれている集計処理を実装してください。

また、`ExamResult.kt`と`AggregateExamResult.kt`の関数`getExamResultList()`にも TODO コメントを書いているので、そちらもご確認ください。
