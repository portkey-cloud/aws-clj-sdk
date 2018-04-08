(defproject portkey/aws-clj-sdk "0.1.0-SNAPSHOT"
  :description "Clojure bindings for AWS"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-http "3.7.0"]
                 [cheshire "5.7.1"]
                 [net.cgrand/xforms "0.7.2"]
                 [org.clojure/core.async "0.3.443"]]
  :profiles {:dev {:dependencies [[com.amazonaws/aws-java-sdk-models "1.11.289"]
                                  [org.clojure/java.classpath "0.2.3"]
                                  [org.jsoup/jsoup "1.11.2"]]
                   :source-paths ["dev"]
                   :aliases {"gen-aws-api" ["run" "-m" "portkey.awsgen/generate-files!"]}}})
