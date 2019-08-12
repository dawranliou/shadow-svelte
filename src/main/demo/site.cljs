(ns demo.site
  #_(:require [hiccups.runtime :as hiccupsrt])
  #_(:require-macros
     [hiccups.core :as hiccups :refer [html]]))

(defn page-index
  {:export true
   :svelte/page "App"}
  []
  #_(html
     [:h1 "Hello, world!"])
  "<h1>Hello, world!</h1>")
