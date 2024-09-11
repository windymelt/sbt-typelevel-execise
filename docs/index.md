## sbt-typelevel-exercise

### about

このプロジェクトは、`sbt-typelevel`の基本的な使い方を説明するためのサンプルです。このページは`docs/index.md`に記載されている内容です。

### `sbt-typelevel`とは

[`sbt-typelevel`](https://typelevel.org/sbt-typelevel/index.html)とは、[TypeLevel](https://typelevel.org/)によって開発されているsbt用プラグインだ。
このプラグインは、sbtプロジェクトの定番ともいえる設定や便利な機能を一気に導入してくれるものだ。

TypeLevelが開発・メンテナンスしているライブラリの数は膨大でありながらも、ビルド設定の多くは共通している(Scala NativeやScala.jsへのクロスビルドなど)。手でこれらの設定を維持し一貫性のある状態に保つことは労苦を伴うものだ。
そこで、共通して利用されている設定や構成をsbtプラグインの形で統一的に扱い、各プロジェクトが最新のベストプラクティス的な設定を利用するための仕組みとして開発されたのが`sbt-typelevel`だ。

このプラグインはTypeLevelのプロジェクトが利用することを企図しているが、普通のユーザも自分のプロジェクトですぐに利用できる。`sbt-typelevel`を利用することで、以下のような恩恵をすぐに得られる:

- ドキュメンテーション用サイトのビルドとデプロイ
- 自動的なScala 2 / 3のクロスコンパイル
- 自動的な Scala.js / Scala Native へのクロスビルド
- Mavenへのアーティファクトのデプロイ
- 有用なscalafmt / scalafixの設定がデフォルトで得られる
- Code of Conduct文書

機能の網羅的な一覧は公式ページを参照してほしい。

## このプロジェクトで扱う範囲

このプロジェクトでは実際に`sbt-typelevel`を利用して、クロスコンパイルやクロスビルド、そしてドキュメンテーションを試すことにする。今あなたが見ているこのページも、`sbt-typelevel-site`というサブプラグインによって提供されているものだ。
