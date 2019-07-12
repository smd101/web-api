VS Code + Spring Boot + Maven + JPA + H2 で最速 Web API 環境の構築
==========================
VS Code + Spring Boot で、Web API 環境構築のサンプルを作成しました。各 Step 毎にブランチを作成してあります。


事前設定
--------
開始前に下記のソフトをインストールしておいてください。
* Git
* Java 8
* Maven 3
* VS Code


Git リポジトリの取得
--------------------
```
$ cd your_workspace
$ git clone git@github.com:smd101/web-api.git
```


project の読み込み
------------------
基本的に、Maven プロジェクトして読み込んでくれれば、OK。動作確認等は、各 Step の説明を確認してください。

ブランチの説明
--------------
- step1-initialize-spring-web-project  
  [VS Code + Spring Boot + Maven + JPA + H2 で最速 Web API 環境の構築（Step1）](http://kusamakura.hatenablog.com/entry/vscode_springboot_maven_jpa_h2_webapi_step1)
- step2-add-h2-database  
[VS Code + Spring Boot + Maven + JPA + H2 で最速 Web API 環境の構築（Step2）](http://kusamakura.hatenablog.com/entry/vscode_springboot_maven_jpa_h2_webapi_step2)
- step3-add-jpa  
[VS Code + Spring Boot + Maven + JPA + H2 で最速 Web API 環境の構築（Step3）
](http://kusamakura.hatenablog.com/entry/vscode_springboot_maven_jpa_h2_webapi_step3)
- step4-add-swagger  
[VS Code + Spring Boot + Maven + JPA + H2 で最速 Web API 環境の構築（Step4）
](http://kusamakura.hatenablog.com/entry/vscode_springboot_maven_jpa_h2_webapi_step4)
- multi-datasource（おまけ）  
複数 DataSource を WebAPI から切り分けて使用
