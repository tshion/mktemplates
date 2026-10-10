# Android View
View ベースのAndroid アプリの実装テンプレート。


## 依存関係
* Version Catalog
    * `[versions]` には複数箇所で共有する値だけを定義する
        * ただし `agp` はライブラリモジュール追加時に使い回すため常に `[versions]` に置く
    * バージョンを共有しないライブラリは `"group:name:version"` 形式で直接記述する
    * エイリアス名に `-ktx` は付けない。参照するアーティファクトは公式リリースノートの「依存関係の宣言」の記述例に従う
        * 例: `androidx-core = "androidx.core:core-ktx:1.19.1"`


## 実装
* `enableEdgeToEdge()` は `super.onCreate()` より前に呼ぶ
    * `super.onCreate()` 内で行われる `Fragment` の復元や、コンストラクタで指定したレイアウトの `setContentView()` より先に設定するため
