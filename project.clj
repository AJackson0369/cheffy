(defproject cheffy "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://api.learnreitit.com"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring "1.10.0"]
                 [integrant "0.8.1"]
                 [environ "1.2.0"]
                 [metosin/reitit "0.6.0"]
                 [seancorfield/next.jdbc "1.2.659"]
                 [org.postgresql/postgresql "42.6.0"]
                 [clj-http "3.12.3"]
                 [ovotech/ring-jwt "2.3.0"]]
  :profiles {:uberjar {:aot :all}
             :dev {:source-paths ["dev/src"]
                   :resource-paths ["dev/dev-resources"]
                   :dependencies [[ring-mock "0.1.5"]
                                  [integrant/repl "0.3.3"]]}}
  :uberjar-name "cheffy.jar")
