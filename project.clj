(defproject portkey/aws-clj-sdk "0.1.0-SNAPSHOT"
  :description "Clojure bindings for AWS"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-http "3.7.0"]
                 [org.clojure/test.check "0.10.0-alpha3"]
                 [ring/ring-codec "1.1.1"]
                 [cheshire "5.7.1"]
                 [net.cgrand/xforms "0.16.0"]
                 [org.clojure/core.async "0.3.443"]
                 [org.clojure/data.xml "0.2.0-alpha5"]]
  :profiles {:dev {:dependencies [[org.clojure/java.classpath "0.2.3"]
                                  [org.jsoup/jsoup "1.11.2"]]
                   :source-paths ["dev"]
                   :resource-paths ["test-resources"]
                   :aliases {"gen-aws-api" ["run" "-m" "portkey.awsgen/generate-files!"]}}})
