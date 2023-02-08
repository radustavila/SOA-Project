import React from "react";
import ReactDOM from "react-dom";
import { CarCatalog } from "./components/CarCatalog";

import "./index.css";

const App = () => (
  <div className="container">
    <h1>Car Catalog</h1>
    <CarCatalog/>
  </div>
);
ReactDOM.render(<App />, document.getElementById("app"));
