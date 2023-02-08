import React from "react";
import ReactDOM from "react-dom";
import { Jokez } from "./components/Jokez";

import "./index.css";

const App = () => (
  <div className="container">
    <h3>Get some jokes</h3>
    <Jokez />
  </div>
);
ReactDOM.render(<App />, document.getElementById("app"));
