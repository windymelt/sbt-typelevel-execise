## プロジェクトの作成

`sbt-typelevel`はビルドやドキュメンテーションに関わる広範なプラグインだ。もし新規にプロジェクトを作成する場合は、TypeLevelが提供しているテンプレートを利用したほうが手っ取り早い:

```sh
% sbt new typelevel/typelevel.g8
```

既に空のディレクトリがある場合は以下のように`-o .`オプションを利用するとそこに生成してくれる:

```sh
% sbt new typelevel/typelevel.g8 -o .
```

### 実行例

```sh
% sbt new typelevel/typelevel.g8 -o .
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Template using sbt-typelevel

name [quickstart]: sbt-typelevel-exercise
organization [com.example]: dev.capslock
package [dev.capslock.sbttypelevelexercise]:
organization_name [Example]: capslock.dev
year [2024]:
scala_version [2.13.14]:
other_scala_version [3.3.3]: 3.5.0
jdk_version [8]: 17
github_username [valencik]: windymelt
contributor_name [Andrew Valencik]: Windymelt
contributor_email [andrew.valencik@gmail.com]: ***

Template applied in .
```
