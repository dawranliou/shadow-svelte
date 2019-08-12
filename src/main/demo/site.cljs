(ns demo.site
  (:require [hiccups.runtime :as hiccupsrt])
  (:require-macros
   [hiccups.core :as hiccups :refer [html]]))

(defn page-index
  {:export true
   :svelte/page "App"}
  []
  (html
   [:h1 (str "Hello, world!")]))
