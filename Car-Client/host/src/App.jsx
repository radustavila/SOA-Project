import React from "react";
import ReactDOM from "react-dom";
import { CarCatalog } from "../../catalog/src/components/CarCatalog";
import { Jokez } from "../../joke/src/components/Jokez";
import { NotificationModal } from "../../notification/src/components/NotificationModal";

import Img from  './img/images.jpeg';

import "./index.css";


const App = () => (
  <div className="container" style={{ backgroundImage: `url(${Img})`, backgroundSize: "cover" }}>
    <h1 style={{marginLeft:"100px"}}>Homepage</h1>
    <div style={{display:"flex", justifyContent:"space-around"}}>
      <CarCatalog />
      <div style={{display:"flex", justifyContent:"space-around", alignItems:"center", flexDirection:"column"}}>
        <NotificationModal />
        <Jokez />
      </div>
    </div>
  </div>
);
ReactDOM.render(<App />, document.getElementById("app"));
