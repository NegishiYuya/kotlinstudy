# 11/09 勉強会 お題

とあるシステムでは登録している会員の検索・照会機能を有しています。  
会員検索を行うファイル`SearchUser.kt`があり、会員情報はクラス`User.kt`で管理されます。

`SearchUser.kt`の関数`main()`で検索や照会の関数をいくつか実行しています。  
各問題の仕様を満たすように、引数・戻り値のみ定義された関数の処理本体を実装してください。

### テストデータ

会員の一覧(詳細は下記)は`SearchUser.kt`の関数`main()`から呼ばれる関数`getAllUserList()`で取得します。  

| id  | name<br>(名前) | age<br>(年齢) | gender<br>(性別)<br>1:男性,2:女性 |
| --- | --- | --- | --- |
1	|登戸太郎	|29	|1|
2	|川崎花子	|29	|2|
3	|戸畑次郎	|30	|1|
4	|福岡三郎	|31	|1|
5	|赤坂理子	|31	|2|

